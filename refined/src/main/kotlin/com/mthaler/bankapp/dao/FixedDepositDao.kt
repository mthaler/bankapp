package com.mthaler.bankapp.dao

import com.mthaler.bankapp.domain.FixedDepositDetails

interface FixedDepositDao {

    fun getFixedDepositDetails(id: Long): FixedDepositDetails?

    fun createFixedDeposit(fdd: FixedDepositDetails): Boolean
}