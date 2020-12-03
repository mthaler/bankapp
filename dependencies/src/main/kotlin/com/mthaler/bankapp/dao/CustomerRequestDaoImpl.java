package com.mthaler.bankapp.dao;

import com.mthaler.bankapp.domain.CustomerRequestDetails;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CustomerRequestDaoImpl implements CustomerRequestDao {
	private static Logger logger = LogManager.getLogger(CustomerRequestDaoImpl.class);
	
	public CustomerRequestDaoImpl() {
		logger.info("Created CustomerRequestDaoImpl instance");
	}
	
	@Override
	public void submitRequest(CustomerRequestDetails userRequestDetails) {
		// --save UserRequestDetails
	}

}
