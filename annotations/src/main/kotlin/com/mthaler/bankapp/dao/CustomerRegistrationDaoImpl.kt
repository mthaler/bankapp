package com.mthaler.bankapp.dao

import com.mthaler.bankapp.dao.CustomerRegistrationDao
import com.mthaler.bankapp.domain.CustomerRegistrationDetails
import com.mthaler.bankapp.dao.CustomerRegistrationDaoImpl
import org.apache.logging.log4j.LogManager
import org.springframework.stereotype.Repository

@Repository(value = "customerRegistrationDao")
class CustomerRegistrationDaoImpl : CustomerRegistrationDao {

    init {
        logger.info("Created CustomerRegistrationDaoImpl instance")
    }

    override fun registerCustomer(customerRegistrationDetails: CustomerRegistrationDetails) {
    }

    companion object {
        private val logger = LogManager
            .getLogger(CustomerRegistrationDaoImpl::class.java)
    }
}