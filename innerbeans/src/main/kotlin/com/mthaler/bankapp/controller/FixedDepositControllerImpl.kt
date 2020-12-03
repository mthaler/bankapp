package com.mthaler.bankapp.controller

import com.mthaler.bankapp.domain.FixedDepositDetails
import com.mthaler.bankapp.service.FixedDepositService
import org.apache.logging.log4j.LogManager

class FixedDepositControllerImpl(val fixedDepositService: FixedDepositService) : FixedDepositController {

    init {
        logger.info("initializing")
    }

    override fun submit(): Boolean {
        return fixedDepositService.createFixedDeposit(FixedDepositDetails(
                1, 10000.0f, 365, "someemail@something.com"))
    }

    override fun get(): FixedDepositDetails {
        return fixedDepositService.getFixedDepositDetails(1L)!!
    }

    companion object {
        private val logger = LogManager.getLogger(FixedDepositControllerImpl::class.java)
    }
}