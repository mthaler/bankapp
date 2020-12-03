package com.mthaler.bankapp.service
import java.beans.ConstructorProperties
import com.mthaler.bankapp.domain.CustomerRegistrationDetails
import com.mthaler.bankapp.dao.CustomerRegistrationDao
import org.apache.logging.log4j.LogManager

class CustomerRegistrationServiceImpl @ConstructorProperties(
    "customerRegistrationDetails",
    "customerRegistrationDao"
) constructor(
    private val customerRegistrationDetails: CustomerRegistrationDetails,
    private val customerRegistrationDao: CustomerRegistrationDao
) : CustomerRegistrationService {
    override fun setAccountNumber(accountNumber: String) {
        customerRegistrationDetails.accountNumber = accountNumber
    }

    override fun setAddress(address: String) {
        customerRegistrationDetails.setAddress(address)
    }

    override fun setDebitCardNumber(cardNumber: String) {
        customerRegistrationDetails.setCardNumber(cardNumber)
    }

    override fun register() {
        customerRegistrationDao.registerCustomer(customerRegistrationDetails)
    }

    companion object {
        private val logger = LogManager
            .getLogger(CustomerRegistrationServiceImpl::class.java)
    }

    init {
        logger.info("Created CustomerRegistrationServiceImpl instance")
    }
}