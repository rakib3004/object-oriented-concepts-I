package src.RetailSystem;

class Secretary extends Employee {
    public Secretary(String employee_number, double basic_salary, String name) {
        super(employee_number, basic_salary, name);
    }

    @Override
    public double getPay() {
        return getBasic_salary();
    }
}
