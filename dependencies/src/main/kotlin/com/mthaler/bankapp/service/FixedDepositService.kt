package com.mthaler.bankapp.service

import com.mthaler.bankapp.domain.FixedDepositDetails

interface FixedDepositService {

    @Throws(Exception::class)
    fun createFixedDeposit(fdd: FixedDepositDetails)
}