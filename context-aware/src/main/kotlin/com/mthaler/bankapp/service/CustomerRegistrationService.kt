package com.mthaler.bankapp.service

interface CustomerRegistrationService {

    fun setAccountNumber(accountNumber: String)

    fun setAddress(address: String)

    fun setDebitCardNumber(cardNumber: String)

    fun register()
}