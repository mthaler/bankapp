package com.mthaler.bankapp.service;

public interface CustomerRegistrationService {
	void setAccountNumber(String accountNumber);
	void setAddress(String address);
	void setDebitCardNumber(String cardNumber);
	void register();
}
