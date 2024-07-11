package com.nss.mockito.bankApplication.service;

import java.util.UUID;

public class GenerateAccountService {
    public static String generateAccountNumber() {
        return UUID.randomUUID().toString();
    }
}
