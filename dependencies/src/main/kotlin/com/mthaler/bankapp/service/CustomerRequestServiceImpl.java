package com.mthaler.bankapp.service;

import java.beans.ConstructorProperties;

import com.mthaler.bankapp.dao.CustomerRequestDao;
import com.mthaler.bankapp.domain.CustomerRequestDetails;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@SuppressWarnings("unused")
public class CustomerRequestServiceImpl implements CustomerRequestService {
	private static Logger logger = LogManager
			.getLogger(CustomerRequestServiceImpl.class);
	private CustomerRequestDetails customerRequestDetails;
	private CustomerRequestDao customerRequestDao;

	@ConstructorProperties({ "customerRequestDetails", "customerRequestDao" })
	public CustomerRequestServiceImpl(
			CustomerRequestDetails customerRequestDetails,
			CustomerRequestDao customerRequestDao) {
		logger.info("Created CustomerRequestServiceImpl instance");
		this.customerRequestDetails = customerRequestDetails;
		this.customerRequestDao = customerRequestDao;
	}

	@Override
	public void submitRequest(String requestType, String requestDescription) {
		// -- create an instance of UserRequestDetails and save it
	}

}
