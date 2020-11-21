package src.BankingSystemPackage;

import javax.swing.*;

public class Account {
    private int accountHolderNumber;
    private String accountHolderName;
    private String accountHolderNID;
    private String accountHolderAddress;
    private String accountHolderPhone;
    private String accountHolderPhoto;
    private double balance;
    private String accountHolderBalanceType;


    public Account(String name, String address, String phone) {
        this.accountHolderName = name;
        this.accountHolderAddress = address;
        this.accountHolderPhone = phone;
        this.accountHolderNID = "N/A";
        this.accountHolderPhoto = "N/A";
        this.balance = 12500.0;
    }

    public Account(String name, String address, String phone, String user_NID) {
        this.accountHolderName = name;
        this.accountHolderAddress = address;
        this.accountHolderPhone = phone;
        this.accountHolderNID = user_NID;
        this.accountHolderPhoto = "N/A";
        this.balance = 0.0;
    }


    public Account(String name, String address, String phone, String photo, String user_NID) {
        this.accountHolderName = name;
        this.accountHolderAddress = address;
        this.accountHolderPhone = phone;
        this.accountHolderNID = user_NID;
        this.accountHolderPhoto = photo;
        this.balance = 0.0;
    }

    String user_details_message = "Name :" + this.accountHolderName + "\n" +
            "Address :" + this.accountHolderAddress + "\n" +
            "Phone Number : " + this.accountHolderPhone + "\n" +
            "NID number : " + this.accountHolderNID + "\n" +
            "Holder Photo :" + this.accountHolderPhoto;

    public String checkAccountHolderDetails() {

        return user_details_message;

    }

    public String checkBalance() {
        return "Your balance is :" + this.balance;
    }

    public String checkAccountNumber() {
        return "Your Account Number is : " + this.accountHolderNumber;
    }


    public boolean withdraw(double amount) {
        if (amount <= 0.0) {
            JOptionPane.showMessageDialog(null, "Enter Positive Amount");
            return false;
        } else if (this.balance - amount < 100) {
            JOptionPane.showMessageDialog(null, "Balance Limit Cross");
            return false;
        } else {
            JOptionPane.showMessageDialog(null, "Withdraw Successful!!!!!!");
            this.balance = this.balance - amount;
            return true;
        }

    }

    public boolean deposit(double amount) {

        if (amount <= 0.0) {
            JOptionPane.showMessageDialog(null, "Enter Positive Amount");
            return false;
        } else {
            this.balance = this.balance + amount;
            JOptionPane.showMessageDialog(null, "Deposit Successful!!!!!!");
            return true;
        }
    }
}
