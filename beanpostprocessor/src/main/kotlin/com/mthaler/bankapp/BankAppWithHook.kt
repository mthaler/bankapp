package com.mthaler.bankapp

import kotlin.Throws
import java.lang.Exception
import kotlin.jvm.JvmStatic
import org.springframework.context.ConfigurableApplicationContext
import org.springframework.context.support.ClassPathXmlApplicationContext
import com.mthaler.bankapp.service.FixedDepositService
import com.mthaler.bankapp.domain.FixedDepositDetails

object BankAppWithHook {
    @Throws(Exception::class)
    @JvmStatic
    fun main(args: Array<String>) {
        val context: ConfigurableApplicationContext = ClassPathXmlApplicationContext(
            "classpath:META-INF/spring/applicationContext.xml"
        )
        context.registerShutdownHook()
        val fixedDepositService = context.getBean(FixedDepositService::class.java)
        fixedDepositService.createFixedDeposit(FixedDepositDetails(1, 1000f, 12, "someemail@somedomain.com"))
    }
}