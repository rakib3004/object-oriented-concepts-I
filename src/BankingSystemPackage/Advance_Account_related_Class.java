package src.BankingSystemPackage;
import javax.swing.*;


class BankingSystemAutomation {
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




 class BankMenu {
    AccountSystem array_0F_accountSystem[] = new AccountSystem[8];
    int iterator;
    int count=0,flag=0;
    double amount;
    String input_from_user;
    BankingSystemAutomation bank =new BankingSystemAutomation();
    private static int parameter = 7;
    int inputAccountNumber;
    public  void set_account(){
        array_0F_accountSystem[0] = new AccountSystem("Zidan", "ME_IUT", "110962", "@zidan", "Mechanical");
        array_0F_accountSystem[1] = new AccountSystem("Wasif", "CSE_JU", "110975", "@wasif", "Computer Science");
        array_0F_accountSystem[2] = new AccountSystem("Azim", "SWE_KU", "110964", "@azim", "Soil & Water");
        array_0F_accountSystem[3] = new AccountSystem("Rakib", "IIT_DU", "110965", "@rakib", "Software");
        array_0F_accountSystem[4] = new AccountSystem("Mahmud", "CE_BUET", "110966", "@mahmud", "Civil");
        array_0F_accountSystem[5] = new AccountSystem("Alif", "CSE_KUET", "110968", "@alif", "Computer Science");
        array_0F_accountSystem[6] = new AccountSystem("Tahmeed", "IIT_DU", "110969", "@tahmeed", "Software");
        array_0F_accountSystem[7] = new AccountSystem("Shifat","CSE_KUET","110971","@shifat","Computer Science");

    }
    public void account_initialization() {

        String name, address, phone, photo, user_NID;
        name = JOptionPane.showInputDialog("User Name");
        address = JOptionPane.showInputDialog("User Address");
        phone = JOptionPane.showInputDialog("User Phone");
        photo = JOptionPane.showInputDialog("User Photo");
        user_NID = JOptionPane.showInputDialog("User user_NID");

        array_0F_accountSystem[parameter] = new AccountSystem(name, address, phone, photo, user_NID);
        String user_details_message = "Name :" + name +"\n"+
                "Address :"+ address +"\n"+
                "Phone Number : "+  phone +"\n"+
                "NID number : "+ user_NID +"\n"+
                "Holder Photo :"+  photo ;
        JOptionPane.showMessageDialog(null, user_details_message );
        JOptionPane.showMessageDialog(null,"Account created successfully");
        JOptionPane.showMessageDialog(null, array_0F_accountSystem[parameter].checkAccountNumber());
        JOptionPane.showMessageDialog(null,"Your account balance is "+ array_0F_accountSystem[parameter].checkBalance());
        parameter++;
        bank.recursive_menu();
    }

    public void account_info_show() {
        String get_roll_string = JOptionPane.showInputDialog("Find the account number : ");
        inputAccountNumber = Integer.parseInt(get_roll_string);

        for(count =0; array_0F_accountSystem[count]!=null; count++){
            JOptionPane.showMessageDialog(null, array_0F_accountSystem[count].checkAccountNumber());
            if(array_0F_accountSystem[count].checkAccountNumber()==inputAccountNumber){
                iterator = count;
                flag=1;
                break;
            }
        }
        if(flag==1){

            JOptionPane.showMessageDialog(null , array_0F_accountSystem[iterator].checkAccountHolderDetails());
        }
        else{
            JOptionPane.showMessageDialog(null,"Account not found");
        }
        bank.recursive_menu();
    }
    public void deposit_show(){
        String get_roll_string = JOptionPane.showInputDialog("Find the account number : ");
        inputAccountNumber = Integer.parseInt(get_roll_string);

        for(count =0; array_0F_accountSystem[count]!=null; count++){
            JOptionPane.showMessageDialog(null, array_0F_accountSystem[count].checkAccountNumber());
            if(array_0F_accountSystem[count].checkAccountNumber()==inputAccountNumber){
                iterator = count;
                flag=1;
                break;
            }
        }
        if(flag==1){
            input_from_user =   JOptionPane.showInputDialog("Enter Deposit money :");
            amount = Double.parseDouble(input_from_user);
            array_0F_accountSystem[iterator].deposit(amount);
        }
        else{
            JOptionPane.showMessageDialog(null,"Account not found");
        }
        bank.recursive_menu();
    }
    public void  withdraw_show(){
        String get_roll_string = JOptionPane.showInputDialog("Find the account number : ");
        inputAccountNumber = Integer.parseInt(get_roll_string);

        for(count =0; array_0F_accountSystem[count]!=null; count++){
            JOptionPane.showMessageDialog(null, array_0F_accountSystem[count].checkAccountNumber());
            if(array_0F_accountSystem[count].checkAccountNumber()==inputAccountNumber){
                iterator = count;
                flag=1;
                break;
            }
        }
        if(flag==1){
            input_from_user =   JOptionPane.showInputDialog("Enter Deposit money :");
            amount = Double.parseDouble(input_from_user);
            array_0F_accountSystem[iterator].withdraw(amount);
        }
        else{
            JOptionPane.showMessageDialog(null,"Account not found");
        }
        bank.recursive_menu();
    }

    public void  checkBalance_show(){
        String get_roll_string = JOptionPane.showInputDialog("Find the account number : ");
        inputAccountNumber = Integer.parseInt(get_roll_string);

        for(count =0; array_0F_accountSystem[count]!=null; count++){
            JOptionPane.showMessageDialog(null, array_0F_accountSystem[count].checkAccountNumber());
            if(array_0F_accountSystem[count].checkAccountNumber()==inputAccountNumber){
                iterator = count;
                flag=1;
                break;
            }
        }
        if(flag==1){

            array_0F_accountSystem[iterator].checkBalance();
        }
        else{
            JOptionPane.showMessageDialog(null,"Account not found");
        }
        bank.recursive_menu();
    }
    public void all_info_show(){
        JOptionPane.showMessageDialog(null,"Welcome to Database");

        JOptionPane.showMessageDialog(null, array_0F_accountSystem[0].checkAccountHolderDetails());
        for(int iterator1 = 0;iterator1<=7;iterator1++){

            JOptionPane.showMessageDialog(null, array_0F_accountSystem[iterator1].checkAccountHolderDetails());
        }
        bank.recursive_menu();

    }
}



 class UserMenu {
    private boolean control=true;

    public void controlller() {
        while (control){
            Interaction();
        }
    }

    private void  Interaction() {

        BankMenu creat_menu = new BankMenu();
        AccountSystem show_info = new AccountSystem();
        BankingSystemAutomation bank =new BankingSystemAutomation();
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


