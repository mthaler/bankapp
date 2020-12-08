package com.mthaler.bankapp

import kotlin.Throws
import java.lang.Exception
import kotlin.jvm.JvmStatic
import org.springframework.context.ApplicationContext
import org.springframework.context.support.ClassPathXmlApplicationContext
import com.mthaler.bankapp.service.FixedDepositService
import com.mthaler.bankapp.domain.FixedDepositDetails

object BankApp {
    @Throws(Exception::class)
    @JvmStatic
    fun main(args: Array<String>) {
        val context: ApplicationContext = ClassPathXmlApplicationContext(
            "classpath:META-INF/spring/applicationContext.xml"
        )
        val fixedDepositService = context
            .getBean(FixedDepositService::class.java)
        fixedDepositService.createFixedDeposit(
            FixedDepositDetails(
                1, 1000f,
                12, "someemail@somedomain.com"
            )
        )
    }
}