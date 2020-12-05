package com.mthaler.bankapp.dao

import com.mthaler.bankapp.dao.AccountStatementDao
import com.mthaler.bankapp.domain.AccountStatement
import com.mthaler.bankapp.dao.AccountStatementDaoImpl
import org.apache.logging.log4j.LogManager
import java.util.*

class AccountStatementDaoImpl : AccountStatementDao {

    override fun getAccountStatement(from: Date?, to: Date?): AccountStatement? {
        logger.info("Getting account statement")
        return AccountStatement()
    }

    companion object {
        private val logger = LogManager.getLogger(
            AccountStatementDaoImpl::class.java
        )
    }
}