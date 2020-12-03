package com.mthaler.bankapp

import kotlin.jvm.JvmStatic
import org.springframework.context.ApplicationContext
import org.springframework.context.support.ClassPathXmlApplicationContext
import com.mthaler.bankapp.controller.FixedDepositController
import org.apache.logging.log4j.LogManager

object BankApp {
    private val logger = LogManager.getLogger(BankApp::class.java)
    @JvmStatic
    fun main(args: Array<String>) {
        val context: ApplicationContext = ClassPathXmlApplicationContext(
                "classpath:META-INF/spring/applicationContext.xml")
        val fixedDepositController = context.getBean("controller") as FixedDepositController
        logger.info("Submission status of fixed deposit : " + fixedDepositController.submit())
        logger.info("Returned fixed deposit info : " + fixedDepositController.get())
    }
}