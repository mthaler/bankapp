package com.mthaler.bankapp

import org.apache.logging.log4j.LogManager

class FixedDepositService {

    var fixedDepositDao: FixedDepositDao? = null
    set(value) {
        logger.info("Setting fixedDepositDao property")
        field = value
    }

    init {
        logger.info("initializing")
    }

    fun getFixedDepositDetails(id: Long): FixedDepositDetails? {
        return fixedDepositDao?.getFixedDepositDetails(id)
    }

    fun createFixedDeposit(fdd: FixedDepositDetails?): Boolean {
        return fixedDepositDao!!.createFixedDeposit(fdd!!)
    }

    companion object {
        private val logger = LogManager.getLogger(FixedDepositService::class.java)
    }
}