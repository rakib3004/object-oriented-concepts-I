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
                JOptionPane.showMessageDialog(null,"Account Limit Crossed\n");
            }


            else{

                name=JOptionPane.showInputDialog("Enter Your Name\n");
                phone=JOptionPane.showInputDialog("Enter Your Phone Number\n");
                address=JOptionPane.showInputDialog("Enter Your Address\n");
                NID=JOptionPane.showInputDialog("Enter NID\n");

                ArrayOfAccount[iterator]=new Account(name,address,phone,NID);

                System.out.println("Account Created Successfully!!!!!\n");

                JOptionPane.showMessageDialog(null,ArrayOfAccount[iterator].checkAccountHolderDetails());
                JOptionPane.showMessageDialog(null,"Balance is :"+ArrayOfAccount[iterator].checkBalance());
                //JOptionPane.showMessageDialog(null,"ACCOUNT NUMBER IS "+ArrayOfAccount[iterator].checkAccountNumber()+" .\n");

                iterator++;
            }




        }




        public void accountProcess()
        {
            int marker=0,count=0,temp=0;

            double inputAccountNumber,choice,amount,CHOICE_2;
            String input_user,choice_1,amount_1,CHOICE;


            input_user=JOptionPane.showInputDialog("Enter your account number\n");
            inputAccountNumber=Integer.parseInt(input_user);


            if(inputAccountNumber<10000)
            {
                JOptionPane.showMessageDialog(null,"Invalid amount\n");

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

                    mark:choice_1=JOptionPane.showInputDialog("1.Show Account Details\n2.Deposit\n3.Withdraw\n");
                    choice=Integer.parseInt(choice_1);
                    if(choice==1)
                    {
                        JOptionPane.showMessageDialog(null,ArrayOfAccount[temp].checkAccountHolderDetails());
                        JOptionPane.showMessageDialog(null,"Account Balance:"+ArrayOfAccount[temp].checkBalance());

                    }

                    else if(choice==2)
                    {
                        amount_1=JOptionPane.showInputDialog("Enter Balance :\n");
                        amount=Double.parseDouble(amount_1);
                        ArrayOfAccount[temp].deposit(amount);
                        JOptionPane.showMessageDialog(null,"Current Balance :"+ArrayOfAccount[temp].checkBalance());
                    }
                    else if(choice==3)
                    {
                        amount_1=JOptionPane.showInputDialog("Enter Amount :\n");
                        amount=Double.parseDouble(amount_1);
                        ArrayOfAccount[temp].withDraw(amount);
                        JOptionPane.showMessageDialog(null,"Current Balance:"+ArrayOfAccount[temp].checkBalance());

                    }


                    CHOICE=JOptionPane.showInputDialog("1.Continue\n2.Return to back\n");
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
                    JOptionPane.showMessageDialog(null,"Account not found!!!!\n");




                    CHOICE=JOptionPane.showInputDialog("1.Continue\n2.Return to back\n");
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

            choice_2=JOptionPane.showInputDialog("1.Create New Account \n2.Show All Account Details \n3.Show Particular Account Details \n4.Quit\n");


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
            JOptionPane.showMessageDialog(null,"Enter Positive Number");

            return false;
        }

        else if(balance-amount<100)
        {
            JOptionPane.showMessageDialog(null,"Balance Limit Crossed");
            return false;
        }

        else
        {
            balance=balance-amount;
            JOptionPane.showMessageDialog(null,"Withdraw Successful\n");
            return true;
        }


    }

    public boolean deposit(double amount)
    {
        if(amount<0)
        {
            JOptionPane.showMessageDialog(null,"Enter a positive amount");
            return false;
        }

        else
        {
            balance=balance+amount;
            JOptionPane.showMessageDialog(null,"Deposit Successful\n");
            return true;
        }


    }


}
