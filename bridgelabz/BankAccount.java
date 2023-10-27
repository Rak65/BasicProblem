package com.bridgelabz;

public class BankAccount {
    int balance = 25000;
    int accountNumber = 354578;
    public void deposit(){
        int depositAmount=10000;
        balance += depositAmount;
        System.out.println("Deposit Balance = "+depositAmount+", Total balance = "+balance);
    }
    public void withdraw(){
        int withdrawAmount = 15000;
        balance -= withdrawAmount;
        System.out.println("Deposit Balance = "+withdrawAmount+", Total balance = "+balance);
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit();
        bankAccount.withdraw();
    }
}
