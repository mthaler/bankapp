package com.mthaler.bankapp.dao

import com.mthaler.bankapp.domain.Tx

interface TxDao {
    fun getTransactions(accountNumber: Int): List<Tx>
}