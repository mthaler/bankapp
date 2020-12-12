package com.mthaler.bankapp.dao;

import java.util.Date;

import sample.spring.chapter06.bankapp.domain.AccountStatement;

public interface AccountStatementDao {
	public AccountStatement getAccountStatement(Date from, Date to);
}
