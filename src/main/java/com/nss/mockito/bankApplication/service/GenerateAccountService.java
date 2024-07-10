package com.nss.mockito.bankApplication.service;

public class GenerateAccountService {
    public static String generateAccountNumber()
    {
        return "ACC" + System.currentTimeMillis();
    }
}
