package com.mthaler.bankapp.dao;

import com.mthaler.bankapp.domain.CustomerRegistrationDetails;

public interface CustomerRegistrationDao {

	void registerCustomer(CustomerRegistrationDetails customerRegistrationDetails);
}
