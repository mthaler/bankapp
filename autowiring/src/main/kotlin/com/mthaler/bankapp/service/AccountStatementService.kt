package com.mthaler.bankapp.service

import com.mthaler.bankapp.domain.AccountStatement
import java.util.*

interface AccountStatementService {

    fun getAccountStatement(from: Date?, to: Date?): AccountStatement?
}