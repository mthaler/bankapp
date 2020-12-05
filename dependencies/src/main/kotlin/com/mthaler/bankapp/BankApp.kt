package com.mthaler.bankapp

import kotlin.jvm.JvmStatic
import org.springframework.context.ApplicationContext
import org.springframework.context.support.ClassPathXmlApplicationContext
import org.apache.logging.log4j.LogManager
import com.mthaler.bankapp.service.CustomerRegistrationService
import com.mthaler.bankapp.service.CustomerRequestService
import com.mthaler.bankapp.domain.FixedDepositDetails
import com.mthaler.bankapp.service.FixedDepositService




object BankApp {
    private val logger = LogManager.getLogger(BankApp::class.java)
    @JvmStatic
    fun main(args: Array<String>) {
        val context: ApplicationContext = ClassPathXmlApplicationContext(
            "classpath:META-INF/spring/applicationContext.xml"
        )

        val fixedDepositService = context
            .getBean("service") as FixedDepositService

        fixedDepositService.createFixedDeposit(
            FixedDepositDetails(
                101,
                10000.0f, 60, "someemail@somedomain.com"
            )
        )

        logger.info("Beginning with accessing CustomerRequestService")
        val customerRequestService_1 = context
            .getBean(CustomerRequestService::class.java)
        customerRequestService_1.submitRequest(
            "checkBookRequest",
            "Request to send a 50-leaf check book"
        )

        val customerRequestService_2 = context
            .getBean(CustomerRequestService::class.java)
        customerRequestService_2.submitRequest(
            "checkBookRequest",
            "Request to send a 100-leaf check book"
        )
        logger.info("Done with accessing CustomerRequestService")

        logger.info("Beginning with accessing CustomerRegistrationService")

        val customerRegistrationService_1 = context
            .getBean(CustomerRegistrationService::class.java)
        customerRegistrationService_1.setAccountNumber("account_1")
        customerRegistrationService_1.setAddress("address_1")
        customerRegistrationService_1.setDebitCardNumber("debitCardNumber_1")
        customerRegistrationService_1.register()

        logger.info("registered customer with id account_1")

        val customerRegistrationService_2 = context
            .getBean(CustomerRegistrationService::class.java)
        customerRegistrationService_2.setAccountNumber("account_2")
        customerRegistrationService_2.setAddress("address_2")
        customerRegistrationService_2.setDebitCardNumber("debitCardNumber_2")
        customerRegistrationService_2.register()
        logger.info("registered customer with id account_2")

        logger.info("Done with accessing CustomerRegistrationService")
    }
}