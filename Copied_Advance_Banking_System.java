package Test;

public class Bank {
    public static void main(String[] args)
    {
        BankMenu AgraniBank=new BankMenu();
        AgraniBank.menu();

    }


}

package Test;

import javax.swing.*;

public class BankMenu {



        private Account ArrayOfAccount[]=new Account[10];

        private static int iterator=0;



        public void accountInitialization()
        {
            String name;
            String phone;
            String address;
            String NID;

            if(iterator>=10)
            {
                JOptionPane.showMessageDialog(null,"ACCOUNT LIMIT CROSSED\n");
            }


            else{

                name=JOptionPane.showInputDialog("ENTER YOUR NAME\n");
                phone=JOptionPane.showInputDialog("ENTER YOUR PHONE NUMBER\n");
                address=JOptionPane.showInputDialog("ENTER YOUR ADDRESS\n");
                NID=JOptionPane.showInputDialog("ENTER NID\n");

                ArrayOfAccount[iterator]=new Account(name,address,phone,NID);

                System.out.println("ACCOUT CREATED SUCCESSFULLY\n");

                JOptionPane.showMessageDialog(null,ArrayOfAccount[iterator].checkAccountHolderDetails());
                JOptionPane.showMessageDialog(null,"BALANCE IS:"+ArrayOfAccount[iterator].checkBalance());
                //JOptionPane.showMessageDialog(null,"ACCOUNT NUMBER IS "+ArrayOfAccount[iterator].checkAccountNumber()+" .\n");

                iterator++;
            }




        }




        public void accountProcess()
        {
            int marker=0,count=0,temp=0;

            double inputAccountNumber,choice,amount,CHOICE_2;
            String input_user,choice_1,amount_1,CHOICE;


            input_user=JOptionPane.showInputDialog("ENTER YOUR ACCOUNT NUMBER\n");
            inputAccountNumber=Integer.parseInt(input_user);


            if(inputAccountNumber<10000)
            {
                JOptionPane.showMessageDialog(null,"INVALID INPUT\n");

                CHOICE=JOptionPane.showInputDialog("PRESS 1 TO CONTINUE\nPRESS 2 TO RETURN TO MAINMENU\n");
                CHOICE_2=Integer.parseInt(CHOICE);
                if(CHOICE_2==1)
                {
                    accountProcess();
                }
                else if(CHOICE_2==2)
                {
                    menu();
                }
            }

            else{
                for(count=0;ArrayOfAccount[count]!=null;count++)
                {
                    if(ArrayOfAccount[count].checkAccountNumber()==inputAccountNumber)
                    {
                        temp=count;
                        marker=1;
                        break;
                    }
                }

                if(marker==1)
                {

                    mark:choice_1=JOptionPane.showInputDialog("PRESS 1 TO SHOW ACCOUNT DETAILS\nPRESS 2 TO DEPOSIT\nPRESS 3 TO WITHDRAW CASH\n");
                    choice=Integer.parseInt(choice_1);
                    if(choice==1)
                    {
                        JOptionPane.showMessageDialog(null,ArrayOfAccount[temp].checkAccountHolderDetails());
                        JOptionPane.showMessageDialog(null,"ACCOUNT BALANCE:"+ArrayOfAccount[temp].checkBalance());

                    }

                    else if(choice==2)
                    {
                        amount_1=JOptionPane.showInputDialog("ENTER AMOUNT\n");
                        amount=Double.parseDouble(amount_1);
                        ArrayOfAccount[temp].deposit(amount);
                        JOptionPane.showMessageDialog(null,"YOUR CURRENT BALANCE:"+ArrayOfAccount[temp].checkBalance());
                    }
                    else if(choice==3)
                    {
                        amount_1=JOptionPane.showInputDialog("ENTER AMOUNT\n");
                        amount=Double.parseDouble(amount_1);
                        ArrayOfAccount[temp].withDraw(amount);
                        JOptionPane.showMessageDialog(null,"YOUR CURRENT BALANCE:"+ArrayOfAccount[temp].checkBalance());

                    }


                    CHOICE=JOptionPane.showInputDialog("PRESS 1 TO CONTINUE\nPRESS 2 TO RETURN TO MAINMENU\n");
                    CHOICE_2=Integer.parseInt(CHOICE);
                    if(CHOICE_2==1)
                    {
                        accountProcess();
                    }
                    else if(CHOICE_2==2)
                    {
                        menu();
                    }


                }

                else if(marker==0)
                {
                    JOptionPane.showMessageDialog(null,"ACCOUNT NOT FOUND\n");




                    CHOICE=JOptionPane.showInputDialog("PRESS 1 TO CONTINUE\nPRESS 2 TO RETURN TO MAINMENU\n");
                    CHOICE_2=Integer.parseInt(CHOICE);
                    if(CHOICE_2==1)
                    {
                        accountProcess();
                    }
                    else if(CHOICE_2==2)
                    {
                        menu();
                    }
                }

            }



        }

        public void accountShow()
        {
            int iterator_2;
            for(iterator_2=0;iterator_2<iterator;iterator_2++)
            {

                JOptionPane.showMessageDialog(null,ArrayOfAccount[iterator_2].checkAccountHolderDetails());
            }


        }


        public void menu()
        {
            int choice;
            String choice_2;

            choice_2=JOptionPane.showInputDialog("PRESS 1 TO CREATE A NEW ACCOUNT\nPRESS 2 TO SHOW ALL ACCOUNT DETAILS\nPRESS 3 TO ACCESS PARTICUL ACCOUNT\nPRESS ANY KEY TO QUIT\n");


            choice=Integer.parseInt(choice_2);
            if(choice==1)
            {
                accountInitialization();
                menu();
            }
            else if(choice==2)
            {
                accountShow();
                menu();
            }

            else if(choice==3)
            {
                accountProcess();
                menu();
            }

            else{
                return;
            }



        }
    }




package Test;

import javax.swing.*;

public class Account {

    private int accountNumber;
    private String Account_Holder_Name;
    private String Holder_NID;
    private String Account_Address;
    private String Account_Holder_Phone;
    private String Account_Photo;

    private double balance;
    private String type;

    private static int accountCounter=0;
    private final int account_starting_range=10000;

    private void account_Number_Generation()
    {
        accountCounter+=1;
        this.accountNumber=account_starting_range+accountCounter;

    }


    public Account(String name,String address,String phone)
    {
        this.Account_Holder_Name=name;
        this.Account_Address=address;
        this.Account_Holder_Phone=phone;
        this.Account_Photo="n/a";
        this.Holder_NID="N/A";

        account_Number_Generation();

    }
    public Account(String name,String address,String phone,String NID)
    {
        this.Account_Holder_Name=name;
        this.Account_Address=address;
        this.Account_Holder_Phone=phone;
        this.Holder_NID=NID;
        this.Account_Photo="N/A";


        this.balance=0.0;
        account_Number_Generation();

    }

    public Account(String name,String address,String phone,String NID,String photo)
    {
        this.Account_Holder_Name=name;
        this.Account_Address=address;
        this.Account_Holder_Phone=phone;
        this.Holder_NID=NID;
        this.Account_Photo=photo;

        this.balance=2000.0;

        account_Number_Generation();


    }

    public double checkBalance()
    {
        return this.balance;
    }

    public int checkAccountNumber()
    {
        return this.accountNumber;

    }


    public String checkAccountHolderDetails()
    {
        return this.Account_Holder_Name+"\n"+
                this.Account_Address +"\n"+
                this.Account_Holder_Phone+"\n"+
                this.Holder_NID +"\n"+
                this.Account_Photo+"\n"+"ACCOUNT NUMBER:"+this.checkAccountNumber();


    }

    public boolean withDraw(double amount)
    {
        if(amount<=0)
        {
            JOptionPane.showMessageDialog(null,"ENTER POSITIVE NUMBER");

            return false;
        }

        else if(balance-amount<100)
        {
            JOptionPane.showMessageDialog(null,"BALANCE LIMIT CROSSED");
            return false;
        }

        else
        {
            balance=balance-amount;
            JOptionPane.showMessageDialog(null,"WITHDRAWAL SUCCESSFUL\n");
            return true;
        }


    }

    public boolean deposit(double amount)
    {
        if(amount<0)
        {
            JOptionPane.showMessageDialog(null,"ENTER A POSITIVE AMOUNT");
            return false;
        }

        else
        {
            balance=balance+amount;
            JOptionPane.showMessageDialog(null,"DEPOSIT SUCCESSFUL\n");
            return true;
        }


    }
}
