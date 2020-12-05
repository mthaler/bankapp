package com.mthaler.bankapp.service

import com.mthaler.bankapp.dao.AccountStatementDao
import com.mthaler.bankapp.domain.AccountStatement
import java.util.*

class AccountStatementServiceImpl : AccountStatementService {

    private var accountStatementDao: AccountStatementDao? = null

    fun setAccountStatementDao(accountStatementDao: AccountStatementDao?) {
        this.accountStatementDao = accountStatementDao
    }

    override fun getAccountStatement(from: Date?, to: Date?): AccountStatement? {
        return accountStatementDao!!.getAccountStatement(from, to)
    }
}