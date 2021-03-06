package com.mthaler.bankapp.dao

import com.mthaler.bankapp.domain.FixedDepositDetails

interface FixedDepositDao {

    fun createFixedDeposit(fdd: FixedDepositDetails): Boolean
}