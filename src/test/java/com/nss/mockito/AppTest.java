//package com.nss.mockito;
//
//import com.nss.mockito.bankApplication.service.GenerateAccountService;
//import junit.framework.Test;
//import junit.framework.TestCase;
//import junit.framework.TestSuite;
//import org.powermock.api.mockito.PowerMockito;
//
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertNotNull;
//import static org.mockito.Mockito.when;
//
///**
// * Unit test for simple App.
// */
//public class AppTest
//    extends TestCase
//{
//    /**
//     * Create the test case
//     *
//     * @param testName name of the test case
//     */
//    public AppTest( String testName )
//    {
//        super( testName );
//    }
//
//    /**
//     * @return the suite of tests being tested
//     */
//    public static Test suite()
//    {
//        return new TestSuite( AppTest.class );
//    }
//
//    /**
//     * Rigourous Test :-)
//     */
//    public void testApp()
//    {
//        assertTrue( true );
//    }
//}
//@org.junit.Test
//public void testCreateAccountWithSufficientDeposit() {
//    double initialDeposit = 6000;
//
//    // Arrange
//    when(bankService1.generateAccountNumber()).thenReturn("ACC123456");
//    PowerMockito.when(GenerateAccountService.generateAccountNumber()).thenReturn("ACC123456");
//    //Act
//    String accountNumber = bankService1.createAccount(initialDeposit);
//    //Assert
//    assertNotNull(accountNumber);
//    assertEquals("ACC123456", accountNumber);
//}
//@org.junit.Test
//public void testCreateAccountWithInsufficientDeposit() {
//    double initialDeposit = 4000;
//    String result = bankService1.createAccount(initialDeposit);
//
//    assertEquals("Application rejected: Minimum deposit should be at least 5000.0", result);
//}