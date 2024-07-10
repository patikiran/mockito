package com.nss.mockito.bankApplication.service;

import com.nss.mockito.bankApplication.model.BankAccount;

public class BankServiceImpl {

    public GenerateAccountService accountService;

    public BankServiceImpl(GenerateAccountService generateAccountNumber) {
        this.accountService = generateAccountNumber;
    }

    private static final double MINIMUM_BALANCE = 5000;
    public String createAccount(double initialDeposit) {
        if (initialDeposit >= MINIMUM_BALANCE) {
            String accountNumber= GenerateAccountService.generateAccountNumber();
            BankAccount account = new BankAccount(accountNumber, initialDeposit);
            return account.getAccountNumber();
        } else {
            return "Application rejected: Minimum deposit should be at least " + MINIMUM_BALANCE;
        }
    }

}

