package Main;

import E_Shop_Management.*;

import javax.swing.JOptionPane;

public class MainClass {

    public static void main(String[] args) {
        Manager manager = new Manager("M1001", 35000, "Noushaw Nuhash", 20000);


        JOptionPane.showMessageDialog(null,"Manager Name :"+ manager.getName());
        JOptionPane.showMessageDialog(null,"Manager Basic Salary :"+ manager.getBasic_salary());
        JOptionPane.showMessageDialog(null, "Manager Payment :"+manager.getPay());

        int side = 55;

        int side2=45;

        double volume = Math.sqrt(Math.pow(side,2))- Math.sqrt(Math.pow(side2,2));
    JOptionPane.showMessageDialog(null,"The volume of the office: "+volume);


    }
}





package E_Shop_Management;

public abstract class Person {

    private String name ;

    Person(String name){
        this.name = name ;

    }
    public String getName() {
        return this.name;
    }
    public abstract double getPay();

}



package E_Shop_Management;

public abstract class Customer extends Person {

    private String address ;
    private double budget;
    public Customer(String  name,String address,double budget){
        super(name);
        this.address = address;
        this.budget  = budget;
    }
    public String getAddress() {
        return address;
    }

    public double getBudget() {
        return budget;
    }
    public void purchase(){

    }
}


package E_Shop_Management;

public abstract class Employee extends Person {

    private String employee_number;
    private double basic_salary;
    public Employee(String employee_number,double basic_salary,String name){
        super(name);
        this.employee_number = employee_number;
        this.basic_salary =basic_salary;
    }

    public String getEmployee_number(){
return this.employee_number;
    }

    public double getBasic_salary() {
        return this.basic_salary;
    }
  public   abstract double getPay();
}



package E_Shop_Management;

public class Manager extends Employee {
    private double allowance;
    public Manager(String employee_number,double basic_salary,String name,float allowance){
        super(employee_number,basic_salary,name);
        this.allowance = allowance;
    }

    public double getAllowance() {
        return allowance;
    }
    @Override
    public double getPay(){
        return getBasic_salary() + getAllowance();
    }
}


package E_Shop_Management;

public class SalesPerson extends Employee {
    private double commission;

    public SalesPerson(String employee_number,double basic_salary,String name,double commission) {
        super(employee_number, basic_salary, name);
        this.commission = commission;
    }
    private double getCommission() {
        return this.commission;
    }
    @Override
    public double getPay(){
        return getBasic_salary() + getCommission()*1.5;
    }

    public void take_order(){

    }
}



package E_Shop_Management;

public class Secretary  extends Employee{
    public Secretary(String employee_number,double basic_salary,String name) {
        super(employee_number, basic_salary, name);
    }
@Override
        public double getPay(){
    return getBasic_salary();
        }
    }


