package com.mthaler.bankapp.controller

import com.mthaler.bankapp.domain.FixedDepositDetails
import com.mthaler.bankapp.service.FixedDepositService

interface FixedDepositController {

    fun submit(): Boolean

    fun get(): FixedDepositDetails?
}