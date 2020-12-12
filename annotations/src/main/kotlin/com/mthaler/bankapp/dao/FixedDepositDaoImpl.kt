package com.mthaler.bankapp.dao

import com.mthaler.bankapp.dao.FixedDepositDao
import com.mthaler.bankapp.domain.FixedDepositDetails
import org.springframework.stereotype.Repository

@Repository(value = "myFixedDepositDao")
class FixedDepositDaoImpl : FixedDepositDao {

    override fun createFixedDeposit(fdd: FixedDepositDetails): Boolean {
        // -- save the fixed deposits and then return true
        return true
    }
}