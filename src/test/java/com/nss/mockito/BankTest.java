package com.nss.mockito;
import com.nss.mockito.bankApplication.service.BankServiceImpl;
import com.nss.mockito.bankApplication.service.GenerateAccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.powermock.api.mockito.PowerMockito.*;

@RunWith(PowerMockRunner.class)
@PrepareForTest({GenerateAccountService.class})
public class BankTest {

    @InjectMocks
    private BankServiceImpl bankService;

    @Test
    public void testCreateAccount_Success() {
        PowerMockito.mockStatic(GenerateAccountService.class);
        String expectedAccountNumber = "12345-67890";
        when(GenerateAccountService.generateAccountNumber()).thenReturn(expectedAccountNumber);
        double initialDeposit = 6000;
        String result = bankService.createAccount("Venkat", initialDeposit);
        assertEquals(expectedAccountNumber, result);
        verifyStatic(GenerateAccountService.class);
        GenerateAccountService.generateAccountNumber();
    }

    @Test
    public void testCreateAccount_Failure() {
        double initialDeposit = 4000;
        String result = bankService.createAccount("Venkat", initialDeposit);
        assertEquals("Application rejected: Minimum deposit should be at least 5000.0", result);
    }

    @Test
    public void testGenerateAccountNumber() {
        String accountNumber = GenerateAccountService.generateAccountNumber();
        assertNotNull(accountNumber);
    }
}
