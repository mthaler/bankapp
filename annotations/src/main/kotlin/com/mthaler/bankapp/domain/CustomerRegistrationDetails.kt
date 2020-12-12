package com.mthaler.bankapp.domain

import org.springframework.beans.factory.config.ConfigurableBeanFactory
import org.apache.logging.log4j.LogManager
import org.springframework.context.annotation.Scope
import org.springframework.stereotype.Component

@Component(value = "customerRegistrationDetails")
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
class CustomerRegistrationDetails {

    var accountNumber: String? = null

    private var address: String? = null
    private var cardNumber: String? = null

    init {
        logger.info("Created CustomerRegistrationDetails instance")
    }

    fun setAddress(address: String?) {
        this.address = address
    }

    fun setCardNumber(cardNumber: String?) {
        this.cardNumber = cardNumber
    }

    companion object {
        private val logger = LogManager
            .getLogger(CustomerRegistrationDetails::class.java)
    }

}