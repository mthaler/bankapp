package com.mthaler.bankapp

import kotlin.Throws
import java.lang.Exception
import kotlin.jvm.JvmStatic
import org.springframework.context.support.ClassPathXmlApplicationContext
import com.mthaler.bankapp.service.FixedDepositService
import com.mthaler.bankapp.domain.FixedDepositDetails
import org.springframework.context.ConfigurableApplicationContext

object BankApp {
    @Throws(Exception::class)
    @JvmStatic
    fun main(args: Array<String>) {
        val context: ConfigurableApplicationContext = ClassPathXmlApplicationContext(
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
        context.getBean("eventSenderFactory");
        context.getBean("eventSenderFactory");
        context.close();
    }
}