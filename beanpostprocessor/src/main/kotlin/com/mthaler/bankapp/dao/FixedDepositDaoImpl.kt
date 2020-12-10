package com.mthaler.bankapp.dao

import com.mthaler.bankapp.common.InstanceValidator
import com.mthaler.bankapp.domain.FixedDepositDetails
import org.apache.logging.log4j.LogManager

class FixedDepositDaoImpl : FixedDepositDao, InstanceValidator {

    private var connection: DatabaseConnection? = null

    init {
        logger.info("FixedDepositDaoImpl's constructor invoked")
    }

    fun initializeDbConnection() {
        logger.info("FixedDepositDaoImpl's initializeDbConnection method invoked")
        connection = DatabaseConnection.instance
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

    override fun validateInstance() {
        logger.info("Validating FixedDepositDaoImpl instance")
        if (connection == null) {
            logger.error("Failed to obtain DatabaseConnection instance")
        }
    }

    companion object {
        private val logger = LogManager.getLogger(
            FixedDepositDaoImpl::class.java
        )
    }
}