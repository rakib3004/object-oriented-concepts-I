package src.LibraryManagement;

import javax.swing.*;

public class Library extends JFrame {

    public Author author_array[] = new Author[10];
    public Book book_array[] = new Book[7];
    public static int initial = 6;


    public void seminar_library() {


        author_array[0] = new Author("Jafar Iqbal", "jafar@sust.ac.bd", 'm');
        author_array[1] = new Author("Humayon Ahmed", "hm@du.ac.bd", 'm');
        author_array[2] = new Author("Selina Hossain", "selina@ru.ac.bd", 'f');
        author_array[3] = new Author("Anisul Haque", "anisul@buet.ac.bd", 'm');
        author_array[4] = new Author("Imdadul Haque Milon", "milon@jnu.ac.bd", 'm');
        author_array[5] = new Author("Anisuzzaman", "anisuzzaman@du.ac.bd", 'm');
        author_array[6] = new Author("Ahsan Habib", "habib@du.ac.bd", 'm');


        book_array[0] = new Book("Ami topu", author_array[0], 350.0, 16);
        book_array[1] = new Book("Misir Ali", author_array[1], 400.0, 12);
        book_array[2] = new Book("Ekattor er Chithi", author_array[2], 290.0, 6);
        book_array[3] = new Book("Ma", author_array[3], 420.0, 10);
        book_array[4] = new Book("Kaloghora", author_array[4], 370.0, 8);
        book_array[5] = new Book("Jadughar", author_array[5], 280.0, 16);
        book_array[6] = new Book("First Second Third", author_array[6], 400.0, 12);


    }

    public void librarian() {
        MemberDatabase libraryMember = new MemberDatabase();

        String part_one = "Choose Your Option : \n1.Show all book\n2.Search book\n3.Input book\n";
        String part_two = "4.Increase Book\n5.Books Optimization\n6.Show Register member";
        String option = JOptionPane.showInputDialog(part_one + part_two);
        if (option.equals("1")) {

            show_book();
        } else if (option.equals("2")) {
            search();
        } else if (option.equals("3")) {
            input_books();
        } else if (option.equals("4")) {
            increase_books();
        } else if (option.equals("5")) {
            optimise_books();
        } else if (option.equals("6")) {
            libraryMember.showRegisterMember();
        } else if (option.equals("29")) {
            System.exit(0);
        } else {
            librarian();
        }
        librarian();
    }

    public void input_books() {
        String book_name = JOptionPane.showInputDialog("Enter New Book Name :");

        Book new_book = findNewBook(book_name, book_array);

        int author_number = show_author(author_array);
        String str_book_price = JOptionPane.showInputDialog("Enter Your Book Price :");
        int n = author_number;
        double book_price = Double.parseDouble(str_book_price);
        String str_quantity = JOptionPane.showInputDialog("Enter Amount of Book");
        int quantity = Integer.parseInt(str_quantity);
        initial++;
        book_array[initial] = new Book(book_name, author_array[n], book_price, quantity);
        JOptionPane.showMessageDialog(null, "New Book Details :\n" + book_array);
        librarian();
        /* JOptionPane.showMessageDialog(null,"This is already here!!!\n"+book_name+" increases.\n");*/

    }

    public void increase_books() {
        String desired_name = JOptionPane.showInputDialog("Enter the  books name : ");
        Book desired_book = findBook(desired_name, book_array);
        int previous_book_number = desired_book.getQty();
        String increasing_number = JOptionPane.showInputDialog("Enter how many books you want to increase : ");
        int incre_num = Integer.parseInt(increasing_number);
        int new_book_number = previous_book_number + incre_num;
        desired_book.setQty(new_book_number);
        JOptionPane.showMessageDialog(null, desired_book);
    }

    public void optimise_books() {
        JOptionPane.showMessageDialog(null, "Optimization is not Complete");
        librarian();
        ;
    }

    public void show_book() {
        int iterator;
        for (iterator = 0; iterator < 10; iterator++) {
            if (iterator > initial) {
                librarian();
            }
            JOptionPane.showMessageDialog(null, "Self No : 01 || Book No :0" + (iterator + 1) + "\n" + book_array[iterator]);
        }
    }

    public String show_book2() {
        String index_ordinator = "";
        int iterator = 0;
        for (Book bookish : book_array) {
            iterator++;
            index_ordinator = index_ordinator + "Self No : 01 || Book No :0" + (iterator + 1) + "\n" + bookish + "\n" + "\n";

        }
        return index_ordinator;
    }

    public int show_author(Author[] authors_array) {
        String author_info = "Chose Your Author :\n";
        int count = 1;
        for (Author author_data : authors_array) {
            if (count > initial + 1) {
                break;
            }
            author_info += count + ". " + author_data.getName() + "\n";
            count++;
        }

        String str_number = JOptionPane.showInputDialog(author_info);
        int int_number = Integer.parseInt(str_number);
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

    public Book findBook(String desired_name, Book[] books_array) {
        for (Book book_data : books_array) {
            if (book_data.getName().equalsIgnoreCase(desired_name))
                return book_data;
        }
        search();
        return null;
    }

    public Author findAuthor(String desired_name, Author[] authors_array) {
        for (Author author_data : authors_array) {
            if (author_data.getName().equalsIgnoreCase(desired_name))
                return author_data;
        }
        search();
        return null;
    }

    public Book findNewBook(String desired_name, Book[] books_array) {
        for (Book book_data : books_array) {
            if (book_data.getName().equalsIgnoreCase(desired_name))
                return book_data;
        }
        return null;
    }

    public void search() {
        String option = JOptionPane.showInputDialog("Which way you search ??\n1.Search by Book\n2.Search by Author.");
        if (option.equals("1")) {
            book_search();
        } else if (option.equals("2")) {
            author_search();
        } else if (option.equals("29")) {
            System.exit(0);
        } else {
            search();
        }
        search();
    }

    public void book_search() {
        String desired_name = JOptionPane.showInputDialog("Enter your desired book: ");
        Book desired_book = findBook(desired_name, book_array);
        JOptionPane.showMessageDialog(null, desired_book);
    }

    public void author_search() {
        String desired_name = JOptionPane.showInputDialog("Enter your desired author:");
        Author desired_author = findAuthor(desired_name, author_array);
        String this_author = desired_author.getName();
        Book book_of_author = author_book(this_author, book_array);
        JOptionPane.showMessageDialog(null, book_of_author);

    }

    public Book author_book(String desired_name, Book[] books_array) {
        for (Book book_data : books_array) {
            if (book_data.author.getName().equals(desired_name)) ;
            return book_data;
        }
        return null;
    }
}
