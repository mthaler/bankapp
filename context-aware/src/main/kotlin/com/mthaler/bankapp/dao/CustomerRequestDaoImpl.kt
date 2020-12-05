package com.mthaler.bankapp.dao

import com.mthaler.bankapp.domain.CustomerRequestDetails
import org.apache.logging.log4j.LogManager

class CustomerRequestDaoImpl : CustomerRequestDao {

    init {
        logger.info("Created CustomerRequestDaoImpl instance")
    }

    override fun submitRequest(userRequestDetails: CustomerRequestDetails) {
        // --save UserRequestDetails
    }

    companion object {

        private val logger = LogManager.getLogger(CustomerRequestDaoImpl::class.java)
    }
}