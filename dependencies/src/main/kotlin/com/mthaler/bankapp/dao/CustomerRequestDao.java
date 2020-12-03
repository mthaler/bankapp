package com.mthaler.bankapp.dao;

import com.mthaler.bankapp.domain.CustomerRequestDetails;

public interface CustomerRequestDao {
	void submitRequest(CustomerRequestDetails userRequestDetails);
}
