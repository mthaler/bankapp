package com.mthaler.bankapp.domain

import org.springframework.beans.factory.config.ConfigurableBeanFactory
import org.apache.logging.log4j.LogManager
import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Component
import java.util.*

@Component(value = "customerRequestDetails")
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
class CustomerRequestDetails {
    var type: String? = null
    var description: String? = null
    var category: String? = null
    var assignedDepartment: String? = null
    var submissionDate: Date? = null
    var status: String? = null
    var resolutionTimeInDays: String? = null

    companion object {
        private val logger = LogManager.getLogger(
            CustomerRequestDetails::class.java
        )
    }

    init {
        logger.info("Created CustomerRequestDetails instance")
    }
}