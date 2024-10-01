package bankaccountapp;

import java.util.Random;

public abstract class Account implements IBaseRate {
    //list common prop for Checking and Savings Account
    private String name;
    private String SSN;
    private double balance;
    protected String accountNumber;
    protected double rate;

    private static int index = 10000;

    //constructor to set base prop and initialize the account
    public Account(String name,String SSN, double initDeposit){
        this.name = name;
        this.SSN = SSN;
        this.balance = initDeposit;

        index++;

        this.accountNumber = setAccountNumber();

        setRate();
    }
    public abstract void setRate();

    private String setAccountNumber(){
        int random3Digit = (int) ((Math.random() * Math.pow(10,3)));
        return SSN.substring(SSN.length()-2) + index + random3Digit;
    }
    public void showInfo(){
        System.out.println("Name:" + name + "\nAccountNo: " + accountNumber + "\nbalance: " + balance + "\nrate: " + rate + "%");
    }
    public void deposit(int money){
        balance+=money;
        System.out.println("Deposited: " + money);
        getBalance();
    }
    public void withdraw(int money){
        balance-=money;
        System.out.println("Withdrawn: " + money);
        getBalance();
    }
    public void transfer(int money, String toWhere){
        balance-=money;
        System.out.println("Transferred " + money + " to " + toWhere);
        getBalance();
    }
    public void getBalance(){
        System.out.println("Your balance is now " + balance);
    }
    //list common methods
}
