package src.RetailSystem;

import javax.swing.JOptionPane;
public class ShoppingSys {

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

 abstract class Person {

    private String name ;

    Person(String name){
        this.name = name ;

    }
    public String getName() {
        return this.name;
    }
    public abstract double getPay();

}

class Manager extends Employee {
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

 class SalesPerson extends Employee {
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

 class Secretary  extends Employee{
    public Secretary(String employee_number,double basic_salary,String name) {
        super(employee_number, basic_salary, name);
    }
@Override
        public double getPay(){
    return getBasic_salary();
        }
    }
