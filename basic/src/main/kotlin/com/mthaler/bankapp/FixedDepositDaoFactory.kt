package com.mthaler.bankapp

object FixedDepositDaoFactory {

    fun getFixedDepositDao(daoType: String?): FixedDepositDao? {

        var fixedDepositDao: FixedDepositDao? = null
        if ("jdbc".equals(daoType, ignoreCase = true)) {
            if (fixedDepositDao == null) {
                fixedDepositDao = FixedDepositDao()
            }
        }
        return fixedDepositDao
    }
}