package com.mthaler.bankapp.service

import com.mthaler.bankapp.dao.FixedDepositDao
import kotlin.Throws
import java.lang.Exception
import com.mthaler.bankapp.domain.FixedDepositDetails

class FixedDepositServiceImpl : FixedDepositService {

    private var myFixedDepositDao: FixedDepositDao? = null

    fun setMyFixedDepositDao(myFixedDepositDao: FixedDepositDao) {
        this.myFixedDepositDao = myFixedDepositDao
    }

    @Throws(Exception::class)
    override fun createFixedDeposit(fdd: FixedDepositDetails) {
        // -- create fixed deposit
        myFixedDepositDao?.createFixedDeposit(fdd)
    }
}