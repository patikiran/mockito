package com.nss.mockito.bankApplication;

import com.nss.mockito.bankApplication.service.BankServiceImpl;
import com.nss.mockito.bankApplication.service.GenerateAccountService;

public class BankApplication {

    public static void main(String[] args) {

        GenerateAccountService generateAccountService = new GenerateAccountService();
        BankServiceImpl bankService = new BankServiceImpl(generateAccountService);
        double initialDeposit1 = 6000;
        String result1 = bankService.createAccount("Venkat", initialDeposit1);
        System.out.println("Result 1: " + result1);
        double initialDeposit2 = 4000;
        String result2 = bankService.createAccount("Venkat", initialDeposit2);
        System.out.println("Result 2: " + result2);
    }
}
