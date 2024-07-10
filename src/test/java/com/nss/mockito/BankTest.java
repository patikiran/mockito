package com.nss.mockito;


import com.nss.mockito.bankApplication.service.BankServiceImpl;
import com.nss.mockito.bankApplication.service.GenerateAccountService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;
//
@RunWith(PowerMockRunner.class)
@PrepareForTest(GenerateAccountService.class)

public class BankTest {
    @Mock GenerateAccountService generateAccountService;

    @InjectMocks
    private BankServiceImpl bankService1;

    @Test
    public void testCreateAccount_Success()  {
        PowerMockito.mockStatic(GenerateAccountService.class);
        String expectedAccountNumber = "ACC123456789";
        PowerMockito.when(GenerateAccountService.generateAccountNumber()).thenReturn(expectedAccountNumber);

        double initialDeposit = 6000;
        String result = bankService1.createAccount(initialDeposit);

        assertEquals(expectedAccountNumber, result);
    }

    @Test
    public void testCreateAccount_Failure() {
        double initialDeposit = 4000;
        String result = bankService1.createAccount(initialDeposit);

        assertEquals("Application rejected: Minimum deposit should be at least 5000.0", result);
    }
}








