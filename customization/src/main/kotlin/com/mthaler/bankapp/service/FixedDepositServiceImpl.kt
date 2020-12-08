package com.mthaler.bankapp.service

import com.mthaler.bankapp.dao.FixedDepositDao
import kotlin.Throws
import java.lang.Exception
import com.mthaler.bankapp.domain.FixedDepositDetails
import org.apache.logging.log4j.LogManager

class FixedDepositServiceImpl : FixedDepositService {

    private var myFixedDepositDao: FixedDepositDao? = null

    fun setMyFixedDepositDao(myFixedDepositDao: FixedDepositDao?) {
        logger.info("FixedDepositServiceImpl's setMyFixedDepositDao method invoked")
        this.myFixedDepositDao = myFixedDepositDao
    }

    @Throws(Exception::class)
    override fun createFixedDeposit(fdd: FixedDepositDetails?) {
        // -- create fixed deposit
        myFixedDepositDao!!.createFixedDeposit(fdd!!)
    }

    companion object {
        private val logger = LogManager.getLogger(
            FixedDepositServiceImpl::class.java
        )
    }
}