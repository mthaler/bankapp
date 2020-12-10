package com.mthaler.bankapp.factory

import org.springframework.beans.factory.FactoryBean
import org.springframework.beans.factory.InitializingBean
import kotlin.Throws
import java.lang.Exception
import org.apache.logging.log4j.LogManager

class EventSenderFactoryBean : FactoryBean<EventSender>, InitializingBean {


    init {
        logger.info("Created EventSenderFactoryBean")
    }

    @Throws(Exception::class)
    override fun getObject(): EventSender {
        logger.info("getObject method of EventSenderFactoryBean invoked")
        return EventSender()
    }

    override fun getObjectType(): Class<*> {
        return EventSender::class.java
    }

    override fun isSingleton(): Boolean {
        return false
    }

    @Throws(Exception::class)
    override fun afterPropertiesSet() {
        logger.info("afterPropertiesSet method of EventSenderFactoryBean invoked")
    }

    companion object {
        private val logger = LogManager
            .getLogger(EventSenderFactoryBean::class.java)
    }
}