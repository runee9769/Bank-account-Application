package bankaccountapp;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {
    public static void main(String[] args) throws IOException {
        List<Account> accounts = new LinkedList<Account>();

        //Read csv file then create new accounts based on that data
        String file = "/Users/neerugiri/Downloads/NewBankAccounts.csv";
        List<String[]> newCustomers = utilities.CSV.read(file);

        for(String[] accountHolder: newCustomers){
            String name = accountHolder[0];
            String SSN = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);
            if(accountType.equals("Savings")){
                //Savings svAcc1 = new Savings("Aman", "734889786", 7364.6);
                accounts.add(new Savings(name,SSN,initDeposit));
            }else if(accountType.equals("Checking")){
                accounts.add(new Checking(name,SSN,initDeposit));
            }else {
                System.out.println("Error reading Account Type");
            }
        }
        for(Account acc: accounts){
            acc.showInfo();
            System.out.println("**********************");
        }

//        Savings svAcc1 = new Savings("Aman", "734889786", 7364.6);
//        svAcc1.showInfo();
//        svAcc1.deposit(1000);
//        svAcc1.withdraw(900);
//        svAcc1.transfer(678,"School");
//
//        Checking chkAcc1 = new Checking("Neeru", "7348999096" , 9000.0);
//        chkAcc1.showInfo();
    }
}
