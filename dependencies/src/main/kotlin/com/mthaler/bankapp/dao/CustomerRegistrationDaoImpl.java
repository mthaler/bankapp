package com.mthaler.bankapp.dao;

import com.mthaler.bankapp.domain.CustomerRegistrationDetails;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomerRegistrationDaoImpl implements CustomerRegistrationDao {
	private static Logger logger = LogManager
			.getLogger(CustomerRegistrationDaoImpl.class);

	public CustomerRegistrationDaoImpl() {
		logger.info("Created CustomerRegistrationDaoImpl instance");
	}

	@Override
	public void registerCustomer(
			CustomerRegistrationDetails customerRegistrationDetails) {
	}

}
