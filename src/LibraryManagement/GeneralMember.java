package src.LibraryManagement;

public class GeneralMember extends LibraryMember {
    private String assignDay;

    GeneralMember(String name, String type, String assignDay) {
        super(name, type);
        this.assignDay = assignDay;
    }

    public String getAssignDay() {
        return assignDay;
    }
}
