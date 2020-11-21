package src.RetailSystem;

abstract class Employee extends Person {

    private String employee_number;
    private double basic_salary;

    public Employee(String employee_number, double basic_salary, String name) {
        super(name);
        this.employee_number = employee_number;
        this.basic_salary = basic_salary;
    }

    public String getEmployee_number() {
        return this.employee_number;
    }

    public double getBasic_salary() {
        return this.basic_salary;
    }

    public abstract double getPay();
}
