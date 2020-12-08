package com.mthaler.bankapp.service

import kotlin.Throws
import java.lang.Exception
import com.mthaler.bankapp.domain.FixedDepositDetails

interface FixedDepositService {

    @Throws(Exception::class)
    fun createFixedDeposit(fdd: FixedDepositDetails?)
}