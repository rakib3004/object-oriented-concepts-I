package src.RetailSystem;

abstract class Person {

    private String name;

    Person(String name) {
        this.name = name;

    }

    public String getName() {
        return this.name;
    }

    public abstract double getPay();

}
