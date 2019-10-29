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
