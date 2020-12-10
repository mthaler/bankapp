package com.mthaler.bankapp.service

import com.mthaler.bankapp.common.DependencyResolver
import com.mthaler.bankapp.dao.FixedDepositDao
import kotlin.Throws
import java.lang.Exception
import com.mthaler.bankapp.domain.FixedDepositDetails
import com.mthaler.bankapp.common.MyApplicationContext
import org.apache.logging.log4j.LogManager

class FixedDepositServiceImpl : FixedDepositService, DependencyResolver {

    private lateinit var fixedDepositDao: FixedDepositDao

    @Throws(Exception::class)
    override fun createFixedDeposit(fdd: FixedDepositDetails) {
        // -- create fixed deposit
        fixedDepositDao.createFixedDeposit(fdd)
    }

    override fun resolveDependency(myApplicationContext: MyApplicationContext?) {
        logger.info("Resolving dependencies of FixedDepositServiceImpl instance")
        fixedDepositDao = myApplicationContext!!.getBean(FixedDepositDao::class.java)
    }

    companion object {
        private val logger = LogManager
            .getLogger(FixedDepositServiceImpl::class.java)
    }
}