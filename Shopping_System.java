package Main;

import E_Shop_Management.*;

import javax.swing.*;

public class MainClass {

    public static void main(String[] args) {
        Person person = new Person("Asif");
        Customer customer = new Customer();
        Employee employee = new Employee();
        Manager manager = new Manager();
        SalesPerson salesPerson = new SalesPerson();
        Secretary secretary = new Secretary();


        JOptionPane.showMessageDialog(null,person.getName());
        int side = 55;

        int side2=45;

        double xolume = Math.sqrt(Math.pow(side,2))- Math.sqrt(Math.pow(side2,2));



    }
}
package E_Shop_Management;

public abstract class Person {

    protected String name ;

    Person(String name){
        this.name = name ;

    }
    public String getName() {
        return name;
    }
    public abstract double getPay();

}
package E_Shop_Management;

public class Customer extends Person {

    protected String address ;
    protected float budget;
    public Customer(String address,float budget,String  name){
        super(name);
    }
    public String getAddress() {
        return address;
    }

    public float getBudget() {
        return budget;
    }
    public void purchase(){

    }
}
package E_Shop_Management;

public class Employee {

    private String employee_number;
    private float basic_salary;
    public Employee(){

    }

}
package E_Shop_Management;

public class Manager extends Employee {
    protected float allowance;
    public Manager(String employee_number,float basic_salary,String name,float allowance){
        super(employee_number,basic_salary,name);
        this.allowance = allowance;
    }

    public float getAllowance() {
        return allowance;
    }
}
package E_Shop_Management;

public class SalesPerson extends Employee {
    protected float commission;

    protected float getCommission() {
        return commission;
    }

    public void take_order(){

    }
}
 package E_Shop_Management;

public class Secretary  extends Employee{
    public Secretary(){
        super();

    }
}
