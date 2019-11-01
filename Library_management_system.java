//Main class
package Main;
import AccountSystemManagement.*;

import javax.swing.*;

public class MainClass {
    public static void main(String[] args) {

Library lib = new Library();

lib.seminar_library();


    }
}


//library class


package AccountSystemManagement;

import javax.swing.*;

public class Library {
    public void seminar_library(){
        Author author_array[] = new Author[3];
        Book book_array[] = new Book[5];

        author_array[0]= new Author("Jafar Iqbal","jafar@sust.ac.bd",'m');
        author_array[1]= new Author("Humayon Ahmed","hm@du.ac.bd",'m');
        author_array[2]= new Author("Selina Hossain","selina@hcc.ac.bd",'f');


        book_array[0] = new Book("Himu",author_array[1],500.0);
        book_array[0] = new Book("Misir Ali",author_array[1],500.0);
        book_array[0] = new Book("Muktijudder Golpo",author_array[2],500.0);
        book_array[0] = new Book("Dipu No 2",author_array[0],500.0);
        book_array[0] = new Book("Amar bondu rashed",author_array[0],500.0);

        int iterator=0;
        for(iterator=0;iterator<5;iterator++){
            JOptionPane.showMessageDialog(null,"Information :"+book_array[iterator].toString());
        }

    }
public void borrow_book(){

}
public void chose_book(){

}

}

//Author class

package AccountSystemManagement;

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
        return "Author Name : "+getName()+"\n"+"Author Email"+getEmail()+"\n"+"Author Gender :"+getGender();
    }


}


//Book class


package AccountSystemManagement;

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
        return "Book Name :"+getName()+"\n"+"Book Author :"+getAuthor()+"\n"+"Book Price :"+getPrice();
    }


}
