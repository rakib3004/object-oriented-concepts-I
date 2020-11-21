package src.RetailSystem;

class Manager extends Employee {
    private double allowance;

    public Manager(String employee_number, double basic_salary, String name, float allowance) {
        super(employee_number, basic_salary, name);
        this.allowance = allowance;
    }

    public double getAllowance() {
        return allowance;
    }

    @Override
    public double getPay() {
        return getBasic_salary() + getAllowance();
    }
}
