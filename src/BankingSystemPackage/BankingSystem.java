package src.BankingSystemPackage;
import javax.swing.*;


public class BankingSystem {
    public static void main(String[] args) {

        AccountSystem user_account_System_1 = new AccountSystem("1129","4575","01736378019","user_photo","20161819");
        String input_from_user = JOptionPane.showInputDialog("Enter Your amount for deposit :");
        int amount = Integer.parseInt(input_from_user);
         user_account_System_1.deposit(amount );

        input_from_user = JOptionPane.showInputDialog("Enter Your amount to withdraw :");
       amount = Integer.parseInt(input_from_user);
        user_account_System_1.withdraw(amount);

        JOptionPane.showMessageDialog(null, user_account_System_1.checkAccountHolderDetails());
        JOptionPane.showMessageDialog(null, user_account_System_1.checkAccountNumber());
        JOptionPane.showMessageDialog(null, user_account_System_1.checkBalance());
 }
}

