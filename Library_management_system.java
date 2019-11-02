//main class
package AccountManagementSystem;
import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        Library lib = new Library();
        MemberDatabase libraryMember  = new MemberDatabase();
        libraryMember.memberShip();
        lib.seminar_library();
        lib.librarian();
    }
}


//library class


package AccountManagementSystem;
import javax.swing.*;

public class Library {
    Author author_array[] = new Author[10];
    Book book_array[] = new Book[7];
    static int initial =6;
    public void seminar_library(){


        author_array[0]= new Author("Jafar Iqbal","jafar@sust.ac.bd",'m');
        author_array[1]= new Author("Humayon Ahmed","hm@du.ac.bd",'m');
        author_array[2]= new Author("Selina Hossain","selina@ru.ac.bd",'f');
        author_array[3]= new Author("Anisul Haque","anisul@buet.ac.bd",'m');
        author_array[4]= new Author("Imdadul Haque Milon","milon@jnu.ac.bd",'m');
        author_array[5]= new Author("Anisuzzaman","anisuzzaman@du.ac.bd",'m');
        author_array[6]= new Author("Ahsan Habib","habib@du.ac.bd",'m');


        book_array[0] = new Book("Ami topu",author_array[0],350.0,16);
        book_array[1] = new Book("Misir Ali",author_array[1],400.0,12);
        book_array[2] = new Book("Ekattor er Chithi",author_array[2],290.0,6);
        book_array[3] = new Book("Ma",author_array[3],420.0,10);
        book_array[4] = new Book("Kaloghora",author_array[4],370.0,8);
        book_array[5] = new Book("Jadughar",author_array[5],280.0,16);
        book_array[6]= new Book("First Second Third",author_array[6],400.0,12);



    }
    public void librarian(){
        MemberDatabase libraryMember  = new MemberDatabase();

        String part_one = "Choose Your Option : \n1.Show all book\n2.Search book\n3.Input book\n";
        String part_two ="4.Increase Book\n5.Books Optimization\n6.Show Register member" ;
        String option = JOptionPane.showInputDialog(part_one+part_two);
        if(option.equals("1")){
            show_book();
        }
        else if(option.equals("2")){
            search();
        }
        else if(option.equals("3")){
            input_books();
        }else if(option.equals("4")){
            increase_books();
        }
        else if(option.equals("5")){
            optimise_books();
        }
        else if(option.equals("6")){
            libraryMember.showRegisterMember();
        }
        else if(option.equals("29")){
            System.exit(0);
        }
        else{
            librarian();
        }
        librarian();
    }

    public void input_books(){
String book_name = JOptionPane.showInputDialog("Enter New Book Name :");
Book  new_book = findNewBook(book_name,book_array);
        int author_number =show_author(author_array);
    String str_book_price = JOptionPane.showInputDialog("Enter Your Book Price :");
    int n = author_number;
    double book_price = Double.parseDouble(str_book_price);
    String str_quantity = JOptionPane.showInputDialog("Enter Amount of Book");
    int quantity = Integer.parseInt(str_quantity);
initial++;
    book_array[initial]= new Book(book_name,author_array[n],book_price,quantity);
JOptionPane.showMessageDialog(null,"New Book Details :\n"+book_array);
librarian();;
   /* JOptionPane.showMessageDialog(null,"This is already here!!!\n"+book_name+" increases.\n");*/

    }
    public void increase_books(){
        String desired_name = JOptionPane.showInputDialog("Enter the  books name : ");
        Book desired_book = findBook(desired_name, book_array);
        int previous_book_number=desired_book.getQty();
        String increasing_number = JOptionPane.showInputDialog("Enter how many books you want to increase : ");
        int incre_num=Integer.parseInt(increasing_number);
        int new_book_number  =previous_book_number +incre_num;
        desired_book.setQty(new_book_number);
        JOptionPane.showMessageDialog(null, desired_book);
    }
    public void optimise_books(){
        JOptionPane.showMessageDialog(null,"Optimization is not Complete");
        librarian();;
    }

    public void show_book(){
        int iterator;
        for(iterator=0;iterator<10;iterator++){
            if(iterator>initial){
                librarian();
            }
            JOptionPane.showMessageDialog(null,"Shell No : 01 || Book No :0"+(iterator+1)+"\n"+book_array[iterator]);
        }
    }
    public int show_author(Author[] authors_array){
        String author_info = "Chose Your Author :\n";
        int count=1;
        for(Author author_data: authors_array){
            if(count>initial+1){
                break;
            }
            author_info += count+". "+author_data.getName()+ "\n";
            count++;
        }

        String  str_number =JOptionPane.showInputDialog(author_info);
     int   int_number = Integer.parseInt(str_number);
     int_number--;
     return int_number;

    }
 /*   public void showData(Book[] books_array){
        String book_info = "";
        for(Book book_data: books_array){
            book_info += book_data + "\n";
        }

        JOptionPane.showMessageDialog(null, book_info);
    }*/

    public Book findBook(String desired_name, Book[] books_array){
        for(Book book_data: books_array){
            if (book_data.getName().equalsIgnoreCase(desired_name))
                return book_data;
        }
        search();
        return null;
    }
    public Author findAuthor(String desired_name, Author[] authors_array){
        for(Author author_data : authors_array){
            if (author_data.getName().equalsIgnoreCase(desired_name))
                return author_data;
        }
        search();
        return null;
    }
    public Book findNewBook(String desired_name, Book[] books_array){
        for(Book book_data: books_array){
            if (book_data.getName().equalsIgnoreCase(desired_name))
                return book_data;
        }
        return null;
    }

    public void search(){
        String option = JOptionPane.showInputDialog("Which way you search ??\n1.Search by Book\n2.Search by Author.");
        if(option.equals("1")){
            book_search();
        }
        else if(option.equals("2")){
            author_search();
        }
        else if(option.equals("29")){
            System.exit(0);
        }
        else {
            search();
        }
        search();
    }
    public void book_search(){
        String desired_name = JOptionPane.showInputDialog("Enter your desired book: ");
        Book desired_book = findBook(desired_name, book_array);
        JOptionPane.showMessageDialog(null, desired_book);
    }
    public void author_search(){
        String desired_name = JOptionPane.showInputDialog("Enter your desired author:");
        Author  desired_author = findAuthor(desired_name, author_array);
        String this_author = desired_author.getName();
        Book book_of_author  = author_book(this_author,book_array);
        JOptionPane.showMessageDialog(null, book_of_author);

    }

    public Book author_book(String desired_name, Book[] books_array){
        for(Book book_data: books_array){
            if (book_data.author.getName().equals(desired_name));
            return book_data;
        }
        return null;
    }
}



//author class

package AccountManagementSystem;
public class Author {


    private String name;
    private String email;
    private char gender;

    public  Author(String name , String email , char gender){

        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public char getGender(){
        return gender;
    }
    public String toString(){
        return "Author Name : "+getName()+"\nAuthor Email : "+getEmail()+"\nAuthor Gender : "+getGender();
    }


}


//book class

package AccountManagementSystem;

public class Book {

    private String name;
    Author author ;

    private double price;
    private  int qty=0;
    public Book(String name , Author author , double price){
        this.name = name;
        this.author = author;
        this.price = price;
    }
    public Book(String name , Author author , double price,int qty){
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty  =qty;
    }

    public String getName(){
        return name;
    }
    public Author getAuthor(){
        return author;
    }

    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public  int getQty(){
        return qty;
    }
    public void setQty(int qty){
        this.qty = qty;
    }

    public String toString(){
        return "Book Name : "+getName()+"\n"+getAuthor()+"\n"+"Book Price : "+getPrice()+"\n"+"Number of Books : "+getQty();
    }


}


//Library Member Class


package AccountManagementSystem;

public class LibraryMember {
    private  String name;
    private String type;

    LibraryMember(String name, String type){
this.name = name;
this.type = type;
    }

    public String getName(){
        return this.name;
    }

    public String getType(){
        return this.type;
    }

}



//Member Database

package AccountManagementSystem;

import javax.swing.*;

public class MemberDatabase {

    GeneralMember generalMembers_array[] = new GeneralMember[12];
    RegisterMember registerMember_array[] = new RegisterMember[20];
    ExecutiveMember executiveMember_array[] = new ExecutiveMember[5];

    public void memberShip(){
        generalMembers_array[0]= new GeneralMember("Mushfiqur E Zidan","General","28 Sept 2018");
        generalMembers_array[1]= new GeneralMember("Sartaz Ainan","General","05 March 2016");
        generalMembers_array[2]= new GeneralMember("Aditya Azim","General","22 Jun 2019");
        generalMembers_array[3]= new GeneralMember("Md. Rakib Trofder","General","15 Feb 2013");
        generalMembers_array[4]= new GeneralMember("Aditya Mahmud","General","16 July 2017");
        generalMembers_array[5]= new GeneralMember("Saiful Islam","General","03 Dec 2018");
        generalMembers_array[6]= new GeneralMember("Khairul Alam","General","26 Dec 2015");
        generalMembers_array[7]= new GeneralMember("Tahmeed Mahbub","General","17 March 2016");
        generalMembers_array[8]= new GeneralMember("Asif Iqbal","General","16 July 2017");
        generalMembers_array[9]= new GeneralMember("Md. Shifat","General","05 March 2014");
        generalMembers_array[10]= new GeneralMember("Md. Shipon","General","05 March 2014");
        generalMembers_array[11]= new GeneralMember("Bedyut Rudra","General","22 April 2018");


        registerMember_array[0]= new RegisterMember("Mohsin Ibne Amin","Register","L101");
        registerMember_array[1]= new RegisterMember("Fahim Morshed","Register","L102");
        registerMember_array[2]= new RegisterMember("Mahtab Hosssen","Register","L103");
        registerMember_array[3]= new RegisterMember("Md. Siam","Register","L104");
        registerMember_array[4]= new RegisterMember("Fahad Hossain","Register","L105");
        registerMember_array[5]= new RegisterMember("Shirsho Iqbal","Register","L106");
        registerMember_array[6]= new RegisterMember("Najmus Sakib","Register","L107");
        registerMember_array[7]= new RegisterMember("Sameha Tahsin","Register","L108");
        registerMember_array[8]= new RegisterMember("Jafar Mahin","Register","L109");
        registerMember_array[9]= new RegisterMember("Mushfiqur Rahman","Register","L110");
        registerMember_array[10]= new RegisterMember("Kazi Muktadir","Register","L111");
        registerMember_array[11]= new RegisterMember("Arif Hasan","Register","L112");
        registerMember_array[12]= new RegisterMember("Inzamamul Haque","Register","L113");
        registerMember_array[13]= new RegisterMember("Mustahid Sakib","Register","L114");
        registerMember_array[14]= new RegisterMember("Jitesh Sureka","Register","L115");
        registerMember_array[15]= new RegisterMember("Muktar Hossen","Register","L116");
        registerMember_array[16]= new RegisterMember("Raisul Islam Rahat","Register","L117");
        registerMember_array[17]= new RegisterMember("Khairul ALam","Register","L118");
        registerMember_array[18]= new RegisterMember("Jubaer Hossen","Register","L119");
        registerMember_array[19]= new RegisterMember("Lutfar Alif","Register","L120");

        executiveMember_array[0]= new ExecutiveMember("Md. Rakib Trofder","Executive","L051","Pesident");
        executiveMember_array[1]= new ExecutiveMember("Abdullah Al Momen","Executive","L052","General Secretary");
        executiveMember_array[2]= new ExecutiveMember("Tourit Jahan Shihab","Executive","L053","Vice President");
        executiveMember_array[3]= new ExecutiveMember("Anam Talukdar","Executive","L054","Organization Secretary");
        executiveMember_array[4]= new ExecutiveMember("Samiul Islam","Executive","L055","Finance Secretary");
    }
    public void showRegisterMember(){
        show_RegMember(registerMember_array);
    }
    public void show_RegMember(RegisterMember[]  registerMembers_array){
       /* String registerMembers_info = "Register Member are  :\n";*/
        int count=1;
        for(RegisterMember registerMembers_data: registerMembers_array){
            JOptionPane.showMessageDialog(null,"Member No :"+count+". "+registerMembers_data.getName());
            count++;
        }



    }

}


//General Member Class

package AccountManagementSystem;

public class GeneralMember extends LibraryMember {
    private String assignDay;
    GeneralMember(String name , String type,String assignDay){
        super(name, type);
        this.assignDay = assignDay;
        }
public String getAssignDay(){
        return assignDay;
}
}


//Register Member Class

package AccountManagementSystem;

public class RegisterMember extends  LibraryMember {
    private String accountNumber;
    RegisterMember(String name ,  String type,String accountNumber ) {
        super(name,type);
        this.accountNumber = accountNumber;
    }
    public String getAccountNumber(){
        return this.accountNumber;
    }
}



//Executive Member Class
package AccountManagementSystem;

public class ExecutiveMember extends RegisterMember {
private String title;

    ExecutiveMember(String name  , String type,  String accountNumber,String title){
super(name,type,accountNumber);
this.title = title;
    }

    public String getTitle(){
        return title;
    }
}

