package com.mthaler.bankapp.dao

import com.mthaler.bankapp.domain.AccountStatement
import org.apache.logging.log4j.LogManager
import org.springframework.stereotype.Repository
import java.util.*

@Repository(value = "accountStatementDao")
class AccountStatementDaoImpl : AccountStatementDao {
    override fun getAccountStatement(from: Date, to: Date): AccountStatement {
        logger.info("Getting account statement")
        return AccountStatement()
    }

    companion object {
        private val logger = LogManager.getLogger(
            AccountStatementDaoImpl::class.java
        )
    }
}