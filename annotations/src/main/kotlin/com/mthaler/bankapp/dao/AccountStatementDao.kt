package com.mthaler.bankapp.dao

import com.mthaler.bankapp.domain.AccountStatement
import java.util.*

interface AccountStatementDao {
    fun getAccountStatement(from: Date, to: Date): AccountStatement
}