package src.LibraryManagement;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Main {
    public static void main(String[] args) {
        Library lib = new Library();
        BookManagement bookManagement = new BookManagement();
        MemberDatabase libraryMember = new MemberDatabase();
        libraryMember.memberShip();
        bookManagement.seminar_library();
        lib.librarian();
        Library frame = new Library();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setTitle("Operation Overdrive");
        frame.setBounds(100, 0, 900, 800);
    }
}
