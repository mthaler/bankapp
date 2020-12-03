package com.mthaler.bankapp.service

interface CustomerRequestService {

    fun submitRequest(requestType: String, requestDescription: String)
}