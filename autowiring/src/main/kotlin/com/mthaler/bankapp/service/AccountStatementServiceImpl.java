package com.mthaler.bankapp.service;

import com.mthaler.bankapp.dao.AccountStatementDao;
import com.mthaler.bankapp.domain.AccountStatement;

import java.util.Date;

public class AccountStatementServiceImpl implements AccountStatementService {
	private AccountStatementDao accountStatementDao;
	
	public void setAccountStatementDao(AccountStatementDao accountStatementDao) {
		this.accountStatementDao = accountStatementDao;
	}

	@Override
	public AccountStatement getAccountStatement(Date from, Date to) {
		return accountStatementDao.getAccountStatement(from, to);
	}
}
