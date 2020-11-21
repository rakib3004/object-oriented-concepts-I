package src.RetailSystem;

class SalesPerson extends Employee {
    private double commission;

    public SalesPerson(String employee_number, double basic_salary, String name, double commission) {
        super(employee_number, basic_salary, name);
        this.commission = commission;
    }

    private double getCommission() {
        return this.commission;
    }

    @Override
    public double getPay() {
        return getBasic_salary() + getCommission() * 1.5;
    }

    public void take_order() {

    }
}
