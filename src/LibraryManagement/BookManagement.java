package src.LibraryManagement;

public class BookManagement {


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
}
