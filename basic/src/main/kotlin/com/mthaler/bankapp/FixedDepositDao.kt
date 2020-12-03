package com.mthaler.bankapp

import java.util.HashMap
import org.apache.logging.log4j.LogManager

class FixedDepositDao {

    private var url: String? = null
    private var driverClass: String? = null
    private var username: String? = null
    private var password: String? = null
    private val fixedDeposits: MutableMap<Long, FixedDepositDetails> = HashMap()

    fun setUrl(url: String?) {
        this.url = url
    }

    fun setDriverClass(driverClass: String?) {
        this.driverClass = driverClass
    }

    fun setUsername(username: String?) {
        this.username = username
    }

    fun setPassword(password: String?) {
        this.password = password
    }

    fun getFixedDepositDetails(id: Long): FixedDepositDetails? {
        return fixedDeposits[id]
    }

    fun createFixedDeposit(fdd: FixedDepositDetails): Boolean {
        fixedDeposits[fdd.id] = fdd
        return true
    }

    companion object {
        private val logger = LogManager.getLogger(FixedDepositDao::class.java)
    }

    init {
        logger.info("initializing")
    }
}