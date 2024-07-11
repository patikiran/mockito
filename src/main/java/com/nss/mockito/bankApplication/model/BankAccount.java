package com.nss.mockito.bankApplication.model;

public class BankAccount {
    private String applicantName;
    private String accountNumber;
    private double balance;

    public BankAccount(String applicantName, String accountNumber, double balance) {
        this.applicantName = applicantName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}
