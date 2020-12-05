package com.mthaler.bankapp.dao;

import com.mthaler.bankapp.domain.AccountStatement;

import java.util.Date;

public interface AccountStatementDao {
	public AccountStatement getAccountStatement(Date from, Date to);
}
