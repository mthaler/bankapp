package com.mthaler.bankapp.service

import com.mthaler.bankapp.dao.FixedDepositDao
import com.mthaler.bankapp.domain.FixedDepositDetails
import org.apache.logging.log4j.LogManager

class FixedDepositServiceImpl(val fixedDepositDao: FixedDepositDao) : FixedDepositService {

    init {
        logger.info("initializing")
    }

    override fun getFixedDepositDetails(id: Long): FixedDepositDetails? {
        return fixedDepositDao.getFixedDepositDetails(id)
    }

    override fun createFixedDeposit(fdd: FixedDepositDetails?): Boolean {
        return fixedDepositDao.createFixedDeposit(fdd!!)
    }

    companion object {
        private val logger = LogManager.getLogger(FixedDepositServiceImpl::class.java)
    }
}