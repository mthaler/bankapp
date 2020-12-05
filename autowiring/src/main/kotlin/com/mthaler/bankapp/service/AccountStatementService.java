package com.mthaler.bankapp.service;

import com.mthaler.bankapp.domain.AccountStatement;

import java.util.Date;

public interface AccountStatementService {

	public AccountStatement getAccountStatement(Date from, Date to);
}
