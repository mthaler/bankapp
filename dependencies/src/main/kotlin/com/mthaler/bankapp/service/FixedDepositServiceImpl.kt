package com.mthaler.bankapp.service

import com.mthaler.bankapp.Constants
import com.mthaler.bankapp.dao.FixedDepositDao
import com.mthaler.bankapp.event.EventSender
import kotlin.Throws
import java.lang.Exception
import com.mthaler.bankapp.domain.FixedDepositDetails
import com.mthaler.bankapp.event.FixedDepositCreatedEvent
import org.apache.logging.log4j.LogManager
import org.springframework.core.io.ClassPathResource
import java.util.*

class FixedDepositServiceImpl(configFile: String?) : FixedDepositService {

    private var fixedDepositDao: FixedDepositDao? = null
    private var eventSender: EventSender? = null

    init {
        // --read the appConfig.properties file to know the EventSender
        // implementation to use
        val configProperties = ClassPathResource(configFile)
        if (configProperties.exists()) {
            val inStream = configProperties.inputStream
            val properties = Properties()
            properties.load(inStream)
            val eventSenderClassString = properties
                .getProperty(Constants.EVENT_SENDER_CLASS_PROPERTY)
            if (eventSenderClassString != null) {
                val eventSenderClass = Class
                    .forName(eventSenderClassString)
                eventSender = eventSenderClass.newInstance() as EventSender
                logger.info("Created EventSender class")
            } else {
                logger.info("appConfig.properties file doesn't contain the information about EventSender class")
            }
        }
    }

    fun setFixedDepositDao(fixedDepositDao: FixedDepositDao?) {
        this.fixedDepositDao = fixedDepositDao
    }

    @Throws(Exception::class)
    override fun createFixedDeposit(fdd: FixedDepositDetails) {
        // -- create fixed deposit
        fixedDepositDao!!.createFixedDeposit(fdd)

        // -- create the event that corresponds to creating fixed deposits
        val event = FixedDepositCreatedEvent()
        val eventData: MutableMap<String, Any> = HashMap()
        eventData["amount"] = fdd.depositAmount
        event.eventData = eventData
        // --send the event to the event sender
        eventSender?.let {
            it.sendEvent(event)
        }
    }

    companion object {
        private val logger = LogManager
            .getLogger(FixedDepositServiceImpl::class.java)
    }
}