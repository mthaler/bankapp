package com.mthaler.bankapp.service

import java.beans.ConstructorProperties
import com.mthaler.bankapp.dao.CustomerRequestDao
import org.springframework.context.ApplicationContextAware
import org.springframework.context.ApplicationContext
import kotlin.Throws
import org.springframework.beans.BeansException
import com.mthaler.bankapp.domain.CustomerRequestDetails
import org.apache.logging.log4j.LogManager

class CustomerRequestServiceImpl @ConstructorProperties("customerRequestDao") constructor(
    customerRequestDao: CustomerRequestDao
) : CustomerRequestService, ApplicationContextAware {

    private val customerRequestDao: CustomerRequestDao
    private lateinit var applicationContext: ApplicationContext

    init {
        logger.info("Created CustomerRequestServiceContextAwareImpl instance")
        this.customerRequestDao = customerRequestDao
    }

    @Throws(BeansException::class)
    override fun setApplicationContext(applicationContext: ApplicationContext) {
        this.applicationContext = applicationContext
    }

    override fun submitRequest(requestType: String, requestDescription: String) {
        // -- populate CustomerRequestDetails object and save it
        val customerRequestDetails = applicationContext.getBean(CustomerRequestDetails::class.java)
        customerRequestDetails.type = requestType
        customerRequestDetails.description = requestDescription
        customerRequestDao.submitRequest(customerRequestDetails)
    }

    companion object {
        private val logger = LogManager
            .getLogger(CustomerRequestServiceImpl::class.java)
    }
}