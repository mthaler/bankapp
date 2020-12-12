package com.mthaler.bankapp.dao

import com.mthaler.bankapp.dao.CustomerRequestDao
import com.mthaler.bankapp.domain.CustomerRequestDetails
import com.mthaler.bankapp.dao.CustomerRequestDaoImpl
import org.apache.logging.log4j.LogManager
import org.springframework.stereotype.Repository

@Repository(value = "customerRequestDao")
class CustomerRequestDaoImpl : CustomerRequestDao {

    init {
        logger.info("Created CustomerRequestDaoImpl instance")
    }

    override fun submitRequest(userRequestDetails: CustomerRequestDetails) {
        // --save UserRequestDetails
    }

    companion object {
        private val logger = LogManager
            .getLogger(CustomerRequestDaoImpl::class.java)
    }
}