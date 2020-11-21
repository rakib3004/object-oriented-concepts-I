package src.LibraryManagement;

public class ExecutiveMember extends RegisterMember {
    private String title;

    ExecutiveMember(String name, String type, String accountNumber, String title) {
        super(name, type, accountNumber);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
