package com.mthaler.bankapp.dao

import com.mthaler.bankapp.domain.CustomerRegistrationDetails

interface CustomerRegistrationDao {

    fun registerCustomer(customerRegistrationDetails: CustomerRegistrationDetails)
}