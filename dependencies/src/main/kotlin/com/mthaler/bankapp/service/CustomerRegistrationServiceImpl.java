package com.mthaler.bankapp.service;

import java.beans.ConstructorProperties;

import com.mthaler.bankapp.dao.CustomerRegistrationDao;
import com.mthaler.bankapp.domain.CustomerRegistrationDetails;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomerRegistrationServiceImpl implements
		CustomerRegistrationService {
	private static Logger logger = LogManager
			.getLogger(CustomerRegistrationServiceImpl.class);

	private CustomerRegistrationDetails customerRegistrationDetails;
	private CustomerRegistrationDao customerRegistrationDao;

	@ConstructorProperties({ "customerRegistrationDetails",
			"customerRegistrationDao" })
	public CustomerRegistrationServiceImpl(
			CustomerRegistrationDetails customerRegistrationDetails,
			CustomerRegistrationDao customerRegistrationDao) {
		this.customerRegistrationDetails = customerRegistrationDetails;
		this.customerRegistrationDao = customerRegistrationDao;
		logger.info("Created CustomerRegistrationServiceImpl instance");
	}

	@Override
	public void setAccountNumber(String accountNumber) {
		customerRegistrationDetails.setAccountNumber(accountNumber);
	}

	@Override
	public void setAddress(String address) {
		customerRegistrationDetails.setAddress(address);
	}

	@Override
	public void setDebitCardNumber(String cardNumber) {
		customerRegistrationDetails.setCardNumber(cardNumber);
	}

	@Override
	public void register() {
		customerRegistrationDao.registerCustomer(customerRegistrationDetails);
	}

}
