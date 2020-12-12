package com.mthaler.bankapp.service

import com.mthaler.bankapp.domain.FixedDepositDetails

interface FixedDepositService {

    fun getFixedDepositDetails(id: Long): FixedDepositDetails?

    fun createFixedDeposit(fdd: FixedDepositDetails?): Boolean
}