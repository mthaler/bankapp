package com.mthaler.bankapp.dao

import org.springframework.beans.factory.annotation.Qualifier
import com.mthaler.bankapp.dao.TxDao
import com.mthaler.bankapp.domain.Tx
import org.springframework.stereotype.Repository
import java.util.ArrayList

@Repository(value = "txDao")
@Qualifier("myTx")
class TxDaoImpl : TxDao {

    override fun getTransactions(accountNumber: Int): List<Tx> {
        val txList: MutableList<Tx> = ArrayList()
        txList.add(Tx(1, "High value money transfer", "complete"))
        txList.add(Tx(2, "High value money transfer", "in process"))
        return txList
    }
}