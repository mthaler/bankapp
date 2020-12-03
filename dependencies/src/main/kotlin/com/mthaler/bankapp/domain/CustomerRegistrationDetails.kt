package com.mthaler.bankapp.domain

import org.apache.logging.log4j.LogManager

class CustomerRegistrationDetails() {
    var accountNumber: String? = null
    private var address: String? = null
    private var cardNumber: String? = null
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

    init {
        logger.info("Created CustomerRegistrationDetails instance")
    }
}