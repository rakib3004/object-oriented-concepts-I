//main class

package AccountManagementSystem;
import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.seminar_library();
        lib.librarian();
    }
}
//library class

package AccountManagementSystem;
import javax.swing.*;

public class Library {
    Author author_array[] = new Author[7];
    Book book_array[] = new Book[7];
    public void seminar_library(){


        author_array[0]= new Author("Jafar Iqbal","jafar@sust.ac.bd",'m');
        author_array[1]= new Author("Humayon Ahmed","hm@du.ac.bd",'m');
        author_array[2]= new Author("Selina Hossain","selina@ru.ac.bd",'f');
        author_array[3]= new Author("Anisul Haque ","anisul@buet.ac.bd",'m');
        author_array[4]= new Author("Imdadul  Haque Milon","milon@jnu.ac.bd",'m');
        author_array[5]= new Author("Anisuzzaman ","anisuzzaman@du.ac.bd",'f');
        author_array[6]= new Author("Ahsan Habib","habib@du.ac.bd",'m');


        book_array[0] = new Book("Ami topu",author_array[0],350.0,16);
        book_array[1] = new Book("Nondito Noroke",author_array[1],400.0,12);
        book_array[2] = new Book("Hangar nodir grened",author_array[2],290.0,6);
        book_array[3] = new Book("Ekannoborti",author_array[3],420.0,10);
        book_array[4] = new Book("Kalogora",author_array[4],370.0,8);
        book_array[5] = new Book("Kalnirobodhi",author_array[5],280.0,16);
        book_array[6]= new Book("Voot jokhon Ghost",author_array[6],400.0,12);



    }
    public void librarian(){
        String option = JOptionPane.showInputDialog("Choose Your Option : \n1.Show all book\n2.Search book\n3.Input book\n4.Increase Book\n5.Books Optimization");
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
         else if(option.equals("29")){
System.exit(0);
         }
         else{
             librarian();
        }
        librarian();
    }

    public void input_books(){
//String book_name =
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
        for(iterator=0;iterator<5;iterator++){
            JOptionPane.showMessageDialog(null,book_array[iterator]);
        }
    }

    public Book findBook(String desired_name, Book[] books_array){
        for(Book book_data: books_array){
            if (book_data.getName().equalsIgnoreCase(desired_name))
                return book_data;
        }
        return null;
    }
   public Author findAuthor(String desired_name, Author[] authors_array){
        for(Author author_data: authors_array){
            if (author_data.getName().equalsIgnoreCase(desired_name))
                return author_data;
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
        String desired_name = JOptionPane.showInputDialog("Enter your desired author: ");
        Author  desired_author = findAuthor(desired_name, author_array);
        String this_author = desired_author.getName();
        Book book_of_author  = author_book(this_author,book_array);
        JOptionPane.showMessageDialog(null, book_of_author);

    }

   public Book author_book(String desired_name, Book[] books_array){
       for(Book book_data: books_array){
           if (book_data.getAuthor().equals(desired_name));
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
