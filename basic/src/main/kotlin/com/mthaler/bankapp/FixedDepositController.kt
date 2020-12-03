package com.mthaler.bankapp

import org.apache.logging.log4j.LogManager

class FixedDepositController {

    var fixedDepositService: FixedDepositService? = null
    set(value) {
        logger.info("Setting fixedDepositService property")
        field = value
    }

    init {
        logger.info("initializing")
    }

    fun submit(): Boolean {
        return fixedDepositService!!.createFixedDeposit(FixedDepositDetails(
                1, 10000.0f, 365, "someemail@something.com"))
    }

    fun get(): FixedDepositDetails {
        return fixedDepositService!!.getFixedDepositDetails(1L)!!
    }

    companion object {
        private val logger = LogManager.getLogger(FixedDepositController::class.java)
    }
}