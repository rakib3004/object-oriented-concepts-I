package src.RetailSystem;

abstract class Customer extends Person {

    private String address;
    private double budget;

    public Customer(String name, String address, double budget) {
        super(name);
        this.address = address;
        this.budget = budget;
    }

    public String getAddress() {
        return address;
    }

    public double getBudget() {
        return budget;
    }

    public void purchase() {

    }
}
