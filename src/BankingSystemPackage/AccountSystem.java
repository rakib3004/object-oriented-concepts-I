package src.BankingSystemPackage;

import javax.swing.*;

public class AccountSystem {
    private int accountHolderNumber;
    private String accountHolderName;
    private String accountHolderNID;
    private String accountHolderAddress;
    private String accountHolderPhone;
    private String accountHolderPhoto;
    private double balance;
    private static int accountCounter = 0;
    private final int account_starting_range = 11803000;

    private void account_number_generator() {
        accountCounter++;
        this.accountHolderNumber = account_starting_range + accountCounter;
    }

    public AccountSystem() {

    }

    public AccountSystem(String name, String address, String phone) {
        this.accountHolderName = name;
        this.accountHolderAddress = address;
        this.accountHolderPhone = phone;
        this.accountHolderNID = "N/A";

        account_number_generator();
        this.balance = 5000.0 + accountCounter * 500.0;
    }

    public AccountSystem(String name, String address, String phone, String user_NID) {
        this.accountHolderName = name;
        this.accountHolderAddress = address;
        this.accountHolderPhone = phone;
        this.accountHolderNID = user_NID;
        this.accountHolderPhoto = "N/A";
        account_number_generator();
        this.balance = 5000.0 + accountCounter * 500.0;
    }

    public AccountSystem(String name, String address, String phone, String photo, String user_NID) {
        this.accountHolderName = name;
        this.accountHolderAddress = address;
        this.accountHolderPhone = phone;
        this.accountHolderNID = user_NID;
        this.accountHolderPhoto = photo;
        account_number_generator();
        this.balance = 5000.0 + accountCounter * 500.0;
    }


    public String checkAccountHolderDetails() {
        return "Name :" + this.accountHolderName + "\n" +
                "Address :" + this.accountHolderAddress + "\n" +
                "Phone Number : " + this.accountHolderPhone + "\n" +
                "NID number : " + this.accountHolderNID + "\n" +
                "Holder Photo :" + this.accountHolderPhoto;

    }


    public int checkAccountNumber() {

        return this.accountHolderNumber;
    }

    public void withdraw(double amount) {
        if (amount <= 0.0) {
            JOptionPane.showMessageDialog(null, "Enter Positive Amount");

        } else if (this.balance - amount < 100) {
            JOptionPane.showMessageDialog(null, "Balance Limit Cross");
        } else {
            this.balance = this.balance - amount;
            JOptionPane.showMessageDialog(null, "Withdraw Successful!!!!!!");


        }

    }

    public double checkBalance() {

        return this.balance;
    }

    public void deposit(double amount) {

        if (amount <= 0.0) {
            JOptionPane.showMessageDialog(null, "Enter Positive Amount");
        } else {
            this.balance = this.balance + amount;
            JOptionPane.showMessageDialog(null, "Deposit Successful!!!!!!");


        }
    }
}
