package com.mthaler.bankapp.service

import java.beans.ConstructorProperties
import com.mthaler.bankapp.dao.CustomerRequestDao
import com.mthaler.bankapp.domain.CustomerRequestDetails
import org.apache.logging.log4j.LogManager
import org.springframework.context.ApplicationContextAware

class CustomerRequestServiceImpl @ConstructorProperties("customerRequestDetails", "customerRequestDao") constructor(
    customerRequestDetails: CustomerRequestDetails,
    customerRequestDao: CustomerRequestDao
) : CustomerRequestService, ApplicationContextAware {

    private val customerRequestDetails: CustomerRequestDetails
    private val customerRequestDao: CustomerRequestDao

    init {
        logger.info("Created CustomerRequestServiceImpl instance")
        this.customerRequestDetails = customerRequestDetails
        this.customerRequestDao = customerRequestDao
    }

    override fun submitRequest(requestType: String, requestDescription: String) {
        // -- create an instance of UserRequestDetails and save it
    }

    companion object {
        private val logger = LogManager.getLogger(CustomerRequestServiceImpl::class.java)
    }
}