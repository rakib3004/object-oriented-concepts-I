package src.BankingSystem;
import javax.swing.*;
public class Account {
    private int  accountHolderNumber ;
    private  String accountHolderName;
    private   String accountHolderNID;
    private  String accountHolderAddress;
    private  String accountHolderPhone;
    private  String accountHolderPhoto;
    private  double balance;
    private static int accountCounter = 0;
    private  final  int account_starting_range = 11803000;
    private void  account_number_generator(){
        accountCounter++;
        this.accountHolderNumber =   account_starting_range + accountCounter;
    }

    public Account(){

    }

    public  Account(String name ,String address ,String phone){
        this.accountHolderName =name;
        this.accountHolderAddress = address;
        this.accountHolderPhone = phone;
        this.accountHolderNID ="N/A";

        account_number_generator();
        this.balance =5000.0 +accountCounter*500.0;
    }
    public  Account(String name ,String address ,String phone,String user_NID){
        this.accountHolderName =name;
        this.accountHolderAddress = address;
        this.accountHolderPhone = phone;
        this.accountHolderNID =user_NID;
        this.accountHolderPhoto ="N/A";
        account_number_generator();
        this.balance =5000.0+accountCounter*500.0;
    }

    public Account(String name ,String address ,String phone,String photo , String user_NID){
        this.accountHolderName =name;
        this.accountHolderAddress = address;
        this.accountHolderPhone = phone;
        this.accountHolderNID =user_NID;
        this.accountHolderPhoto =photo;
        account_number_generator();
        this.balance =5000.0+accountCounter*500.0 ;
    }


    public String checkAccountHolderDetails(){
        return    "Name :" + this.accountHolderName +"\n"+
                "Address :"+ this.accountHolderAddress +"\n"+
                "Phone Number : "+  this.accountHolderPhone +"\n"+
                "NID number : "+ this.accountHolderNID +"\n"+
                "Holder Photo :"+  this.accountHolderPhoto ;

    }


    public int   checkAccountNumber(){

        return  this.accountHolderNumber;
    }

    public  void withdraw(double amount){
        if(amount<=0.0){
            JOptionPane.showMessageDialog(null,"Enter Positive Amount");

        }
        else if(this.balance-amount<100){
            JOptionPane.showMessageDialog(null,"Balance Limit Cross");
        }
        else {
            this.balance = this.balance - amount ;
            JOptionPane.showMessageDialog(null,"Withdraw Successful!!!!!!");


        }

    }

    public double checkBalance(){

        return  this.balance;
    }

    public void deposit(double amount){

        if(amount<=0.0){
            JOptionPane.showMessageDialog(null,"Enter Positive Amount");
        }
        else  {
            this.balance = this.balance + amount ;
            JOptionPane.showMessageDialog(null,"Deposit Successful!!!!!!");


        }
    }
}


public class BankingSystem {
    public static void main(String[] args) {

        UserMenu pickpoint = new UserMenu();
        BankMenu pickpoint2 = new BankMenu();
        pickpoint2.set_account();

        JOptionPane.showMessageDialog(null, "Welcome to IT Bank Ltd.");

        pickpoint.controlller();

    }
    public void developer_info(){
        String curve ="Powered By: t@r@fder !nformatics Ltd.\nLocation :5/A,Nikunja,Dhaka-1229\nAuthor :Eng. Md .Rakib Trofder";
        JOptionPane.showMessageDialog(null,curve);
        JOptionPane.showMessageDialog(null, "Thanks to visit our site\nHope we will meet soon!!!!!");
        JOptionPane.showMessageDialog(null, "\"Our mission \nto serve the nation\"\n---\'t@r@fder !nformatics Ltd.\'");

        recursive_menu();
    }
    public void recursive_menu(){
        UserMenu pickpoint = new UserMenu();

        pickpoint.controlller();

    }
}




package UserSection;
        import javax.swing.*;
public class BankMenu {
    Account array_0f_account[] = new Account[8];
    int iterator;
    int count=0,flag=0;
    double amount;
    String input_from_user;
    BankingSystem bank =new BankingSystem();
    private static int parameter = 7;
    int inputAccountNumber;
    public  void set_account(){
        array_0f_account[0] = new Account("Zidan", "ME_IUT", "110962", "@zidan", "Mechanical");
        array_0f_account[1] = new Account("Wasif", "CSE_JU", "110975", "@wasif", "Computer Science");
        array_0f_account[2] = new Account("Azim", "SWE_KU", "110964", "@azim", "Soil & Water");
        array_0f_account[3] = new Account("Rakib", "IIT_DU", "110965", "@rakib", "Software");
        array_0f_account[4] = new Account("Mahmud", "CE_BUET", "110966", "@mahmud", "Civil");
        array_0f_account[5] = new Account("Alif", "CSE_KUET", "110968", "@alif", "Computer Science");
        array_0f_account[6] = new Account("Tahmeed", "IIT_DU", "110969", "@tahmeed", "Software");
        array_0f_account[7] = new Account("Shifat","CSE_KUET","110971","@shifat","Computer Science");

    }
    public void account_initialization() {

        String name, address, phone, photo, user_NID;
        name = JOptionPane.showInputDialog("User Name");
        address = JOptionPane.showInputDialog("User Address");
        phone = JOptionPane.showInputDialog("User Phone");
        photo = JOptionPane.showInputDialog("User Photo");
        user_NID = JOptionPane.showInputDialog("User user_NID");

        array_0f_account[parameter] = new Account(name, address, phone, photo, user_NID);
        String user_details_message = "Name :" + name +"\n"+
                "Address :"+ address +"\n"+
                "Phone Number : "+  phone +"\n"+
                "NID number : "+ user_NID +"\n"+
                "Holder Photo :"+  photo ;
        JOptionPane.showMessageDialog(null, user_details_message );
        JOptionPane.showMessageDialog(null,"Account created successfully");
        JOptionPane.showMessageDialog(null,array_0f_account[parameter].checkAccountNumber());
        JOptionPane.showMessageDialog(null,"Your account balance is "+array_0f_account[parameter].checkBalance());
        parameter++;
        bank.recursive_menu();
    }

    public void account_info_show() {
        String get_roll_string = JOptionPane.showInputDialog("Find the account number : ");
        inputAccountNumber = Integer.parseInt(get_roll_string);

        for( count =0;array_0f_account[count]!=null;count++){
            JOptionPane.showMessageDialog(null, array_0f_account[count].checkAccountNumber());
            if(array_0f_account[count].checkAccountNumber()==inputAccountNumber){
                iterator = count;
                flag=1;
                break;
            }
        }
        if(flag==1){

            JOptionPane.showMessageDialog(null ,array_0f_account[iterator].checkAccountHolderDetails());
        }
        else{
            JOptionPane.showMessageDialog(null,"Account not found");
        }
        bank.recursive_menu();
    }
    public void deposit_show(){
        String get_roll_string = JOptionPane.showInputDialog("Find the account number : ");
        inputAccountNumber = Integer.parseInt(get_roll_string);

        for( count =0;array_0f_account[count]!=null;count++){
            JOptionPane.showMessageDialog(null, array_0f_account[count].checkAccountNumber());
            if(array_0f_account[count].checkAccountNumber()==inputAccountNumber){
                iterator = count;
                flag=1;
                break;
            }
        }
        if(flag==1){
            input_from_user =   JOptionPane.showInputDialog("Enter Deposit money :");
            amount = Double.parseDouble(input_from_user);
            array_0f_account[iterator].deposit(amount);
        }
        else{
            JOptionPane.showMessageDialog(null,"Account not found");
        }
        bank.recursive_menu();
    }
    public void  withdraw_show(){
        String get_roll_string = JOptionPane.showInputDialog("Find the account number : ");
        inputAccountNumber = Integer.parseInt(get_roll_string);

        for( count =0;array_0f_account[count]!=null;count++){
            JOptionPane.showMessageDialog(null, array_0f_account[count].checkAccountNumber());
            if(array_0f_account[count].checkAccountNumber()==inputAccountNumber){
                iterator = count;
                flag=1;
                break;
            }
        }
        if(flag==1){
            input_from_user =   JOptionPane.showInputDialog("Enter Deposit money :");
            amount = Double.parseDouble(input_from_user);
            array_0f_account[iterator].withdraw(amount);
        }
        else{
            JOptionPane.showMessageDialog(null,"Account not found");
        }
        bank.recursive_menu();
    }

    public void  checkBalance_show(){
        String get_roll_string = JOptionPane.showInputDialog("Find the account number : ");
        inputAccountNumber = Integer.parseInt(get_roll_string);

        for( count =0;array_0f_account[count]!=null;count++){
            JOptionPane.showMessageDialog(null, array_0f_account[count].checkAccountNumber());
            if(array_0f_account[count].checkAccountNumber()==inputAccountNumber){
                iterator = count;
                flag=1;
                break;
            }
        }
        if(flag==1){

            array_0f_account[iterator].checkBalance();
        }
        else{
            JOptionPane.showMessageDialog(null,"Account not found");
        }
        bank.recursive_menu();
    }
    public void all_info_show(){
        JOptionPane.showMessageDialog(null,"Welcome to Database");

        JOptionPane.showMessageDialog(null, array_0f_account[0].checkAccountHolderDetails());
        for(int iterator1 = 0;iterator1<=7;iterator1++){

            JOptionPane.showMessageDialog(null, array_0f_account[iterator1].checkAccountHolderDetails());
        }
        bank.recursive_menu();

    }
}

package UserSection;
        import jdk.nashorn.internal.scripts.JO;

        import javax.swing.*;
        import java.beans.PropertyVetoException;

public class UserMenu {
    private boolean control=true;

    public void controlller() {
        while (control){
            Interaction();
        }
    }

    private void  Interaction() {

        BankMenu creat_menu = new BankMenu();
        Account show_info = new Account();
        BankingSystem bank =new BankingSystem();
        double amount;
        String string_one,string_two,string_three;
        int key_one;
        int key_two;
        String key_one_string;


        String menu1 = "1.Creat Account\n2.Show Infomation\n3.Show Balance\n4.Debit & Credit System\n5.Show Author Information\n6.Stop program";
        key_one_string = JOptionPane.showInputDialog(null, "What do You Want ????\n" + menu1);
        key_one = Integer.parseInt(key_one_string);

        if(key_one==1){
            creat_menu.account_initialization();
        }
        else if(key_one==2){
            key_one_string = JOptionPane.showInputDialog("what do you want ??\n1.All Information\n2.Individual Information");
            key_two = Integer.parseInt(key_one_string);
            if(key_two==1){
                creat_menu.all_info_show();
            }
            else  if(key_two==2){
                creat_menu.account_info_show();

            }
        }
        else if(key_one==3){
            creat_menu.checkBalance_show();
        }
        else if(key_one==4){
            key_one_string =   JOptionPane.showInputDialog(null,"What do you want???\n1.withdraw\n2.deposit");
            key_two = Integer.parseInt(key_one_string);
            if(key_two==1){
                creat_menu.withdraw_show();
            }
            else if(key_two==2){
                creat_menu.deposit_show();
            }
        }
        else if(key_one==5){

            bank.developer_info();
        }
        else if(key_one==6){
            JOptionPane.showMessageDialog(null,"Thank you very much. \n Please come here again!!!!! ");
            control=false;
            return;
        }
        else {
            control=true;
        }

    }
}


