package com.mthaler.bankapp

import com.mthaler.bankapp.domain.FixedDepositDetails
import com.mthaler.bankapp.service.AccountStatementService
import com.mthaler.bankapp.service.CustomerRegistrationService
import com.mthaler.bankapp.service.CustomerRequestService
import com.mthaler.bankapp.service.FixedDepositService
import kotlin.jvm.JvmStatic
import org.springframework.context.ApplicationContext
import org.springframework.context.support.ClassPathXmlApplicationContext
import org.apache.logging.log4j.LogManager
import java.util.*

object BankApp {
    private val logger = LogManager.getLogger(BankApp::class.java)
    @JvmStatic
    fun main(args: Array<String>) {

        val context: ApplicationContext = ClassPathXmlApplicationContext(
            "classpath:META-INF/spring/applicationContext.xml"
        )

        logger.info("Beginning with accessing CustomerRequestService (autowire='constructor')")
        val customerRequestService_1 = context
            .getBean("customerRequestService") as CustomerRequestService
        customerRequestService_1.submitRequest(
            "checkBookRequest",
            "Request to send a 50-leaf check book"
        )
        logger.info("Done with accessing CustomerRequestService (autowire='constructor')")

        logger.info("Beginning with accessing CustomerRegistrationService (autowire='byType')")
        val customerRegistrationService_1 = context
            .getBean("customerRegistrationService") as CustomerRegistrationService
        customerRegistrationService_1.setAccountNumber("account_1")
        customerRegistrationService_1.setAddress("address_1")
        customerRegistrationService_1.setDebitCardNumber("debitCardNumber_1")
        customerRegistrationService_1.register()
        logger.info("Done with accessing CustomerRegistrationService (autowire='byType')")

        logger.info("Beginning with accessing CustomerRegistrationService (autowire='no')")
        val customerRegistrationService_2 = context
            .getBean("customerRegistrationService_") as CustomerRegistrationService
        try {
            customerRegistrationService_2.setAccountNumber("account_2")
            customerRegistrationService_2.setAddress("address_2")
            customerRegistrationService_2
                .setDebitCardNumber("debitCardNumber_2")
            customerRegistrationService_2.register()
        } catch (e: Exception) {
            logger.error("Exception : $e")
        }
        logger.info("Done with accessing CustomerRegistrationService (autowire='no')")

        logger.info("Beginning with accessing FixedDepositService (autowire='byName')")
        val fixedDepositService = context
            .getBean(FixedDepositService::class.java)
        fixedDepositService.createFixedDeposit(
            FixedDepositDetails(
                1, 1000.0f,
                12, "someemail@somedomain.com"
            )
        )
        logger.info("Done with accessing FixedDepositService (autowire='byName')")

        logger.info("Beginning with accessing AccountStatementService (autowire-candidate='false')")
        try {
            val accountStatementService = context
                .getBean(AccountStatementService::class.java)
            accountStatementService.getAccountStatement(Date(), Date())
        } catch (e: Exception) {
            logger.error("Exception : $e")
        }
        logger.info("Done with accessing AccountStatementService (autowire-candidate='false')")
    }
}