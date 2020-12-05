package com.mthaler.bankapp.dao

import com.mthaler.bankapp.domain.FixedDepositDetails

class FixedDepositDaoImpl : FixedDepositDao {

    override fun createFixedDeposit(fdd: FixedDepositDetails): Boolean {
        // -- save the fixed deposits and then return true
        return true
    }
}