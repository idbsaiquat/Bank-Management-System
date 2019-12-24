package com.banking.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banking.dao.CustomerDao;
import com.banking.model.Account;

@Service
@Transactional
public class CutomerServiceImpl implements CustomerService{

	@Autowired
	CustomerDao customerDao;
	
	@Override
	public List<Account> getAllCustomer() {
		
		return customerDao.getAllCustomer();
	}

}
