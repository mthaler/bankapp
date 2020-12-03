package com.mthaler.bankapp.dao

import com.mthaler.bankapp.domain.CustomerRegistrationDetails
import org.apache.logging.log4j.LogManager

class CustomerRegistrationDaoImpl : CustomerRegistrationDao {

    init {
        logger.info("Created CustomerRegistrationDaoImpl instance")
    }

    override fun registerCustomer(customerRegistrationDetails: CustomerRegistrationDetails) {}

    companion object {
        private val logger = LogManager
            .getLogger(CustomerRegistrationDaoImpl::class.java)
    }
}