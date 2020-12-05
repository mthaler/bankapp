package com.mthaler.bankapp.service

import com.mthaler.bankapp.domain.CustomerRegistrationDetails
import com.mthaler.bankapp.dao.CustomerRegistrationDao

class CustomerRegistrationServiceImpl : CustomerRegistrationService {
    var customerRegistrationDetails: CustomerRegistrationDetails? = null
    var customerRegistrationDao: CustomerRegistrationDao? = null

    override fun setAccountNumber(accountNumber: String) {
        customerRegistrationDetails!!.accountNumber = accountNumber
    }

    override fun setAddress(address: String) {
        customerRegistrationDetails!!.setAddress(address)
    }

    override fun setDebitCardNumber(cardNumber: String) {
        customerRegistrationDetails!!.setCardNumber(cardNumber)
    }

    override fun register() {
        customerRegistrationDao!!.registerCustomer(customerRegistrationDetails!!)
    }
}