package src.LibraryManagement;

public class RegisterMember   {
    private String accountNumber;
    RegisterMember(String name ,  String type,String accountNumber ) {
        this.accountNumber = accountNumber;
    }
    public String getAccountNumber(){
        return this.accountNumber;
    }
}