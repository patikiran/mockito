package com.nss.mockito.bankApplication.service;

import com.nss.mockito.bankApplication.model.BankAccount;

public class BankServiceImpl {

    private GenerateAccountService accountService;

    public BankServiceImpl(GenerateAccountService generateAccountService) {
        this.accountService = generateAccountService;
    }

    private static final double MINIMUM_BALANCE = 5000;

    public String createAccount(String applicantName, double initialDeposit) {
        if (initialDeposit >= MINIMUM_BALANCE) {
            String accountNumber = GenerateAccountService.generateAccountNumber();
            BankAccount account = new BankAccount(applicantName, accountNumber, initialDeposit);
            // Here you can add logic to save the account to a database if needed
            return accountNumber;
        } else {
            return "Application rejected: Minimum deposit should be at least " + MINIMUM_BALANCE;
        }
    }
}
