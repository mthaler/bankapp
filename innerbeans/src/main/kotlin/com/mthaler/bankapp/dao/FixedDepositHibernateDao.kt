package com.mthaler.bankapp.dao

import com.mthaler.bankapp.domain.FixedDepositDetails
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger
import java.util.HashMap

class FixedDepositHibernateDao : FixedDepositDao {

    private val fixedDeposits: MutableMap<Long, FixedDepositDetails> = HashMap()

    override fun getFixedDepositDetails(id: Long): FixedDepositDetails? {
        return fixedDeposits[id]
    }

    override fun createFixedDeposit(fdd: FixedDepositDetails): Boolean {
        fixedDeposits.put(fdd.id, fdd)
        return true
    }

    companion object {
        private val logger: Logger = LogManager.getLogger(FixedDepositHibernateDao::class.java)
    }

    init {
        logger.info("initializing")
    }
}