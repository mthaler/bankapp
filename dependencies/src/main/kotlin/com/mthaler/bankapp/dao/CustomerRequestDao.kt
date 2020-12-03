package com.mthaler.bankapp.dao

import com.mthaler.bankapp.domain.CustomerRequestDetails

interface CustomerRequestDao {

    fun submitRequest(userRequestDetails: CustomerRequestDetails)
}