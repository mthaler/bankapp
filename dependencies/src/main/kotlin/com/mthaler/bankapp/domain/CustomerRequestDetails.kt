package com.mthaler.bankapp.domain

import com.mthaler.bankapp.domain.CustomerRequestDetails
import org.apache.logging.log4j.LogManager
import java.util.*

class CustomerRequestDetails {
    var type: String? = null
    var description: String? = null
    var category: String? = null
    var assignedDepartment: String? = null
    var submissionDate: Date? = null
    var status: String? = null
    var resolutionTimeInDays: String? = null

    init {
        logger.info("Created CustomerRequestDetails instance")
    }

    companion object {
        private val logger = LogManager.getLogger(
            CustomerRequestDetails::class.java
        )
    }
}