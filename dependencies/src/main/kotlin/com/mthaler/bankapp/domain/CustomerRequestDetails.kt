package com.mthaler.bankapp.domain

import org.apache.logging.log4j.LogManager
import java.util.Date

data class CustomerRequestDetails(val type: String,
    val description: String,
    val category: String,
    val assignedDepartment: String,
    val submissionDate: Date,
    val status: String,
    val resolutionTimeInDays: String) {

    init {
        logger.info("Created CustomerRequestDetails instance")
    }

    companion object {
        private val logger = LogManager.getLogger(
            CustomerRequestDetails::class.java
        )
    }
}