package com.mthaler.bankapp.dao

import com.mthaler.bankapp.domain.FixedDepositDetails
import org.apache.logging.log4j.LogManager

class FixedDepositDaoImpl : FixedDepositDao {

    private var connection: DatabaseConnection? = null

    init {
        logger.info("FixedDepositDaoImpl's constructor invoked")
    }

    fun initializeDbConnection() {
        logger.info("FixedDepositDaoImpl's initializeDbConnection method invoked")
        connection = DatabaseConnection.getInstance()
    }

    override fun createFixedDeposit(fdd: FixedDepositDetails): Boolean {
        logger.info("FixedDepositDaoImpl's createFixedDeposit method invoked")
        // -- save the fixed deposits and then return true
        return true
    }

    fun releaseDbConnection() {
        logger.info("FixedDepositDaoImpl's releaseDbConnection method invoked")
        connection!!.releaseConnection()
    }

    companion object {
        private val logger = LogManager.getLogger(
            FixedDepositDaoImpl::class.java
        )
    }
}