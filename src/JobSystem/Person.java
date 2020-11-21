package src.JobSystem;

class Person {
    private String name;
    private int age;
    private char gender;
    private String residentialType;

    public Person() {

    }

    public Person(String name, int age, char gender, String residentialType) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.residentialType = residentialType;


    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;

    }

    public char getGender() {
        return this.gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getResidentialType() {
        return this.residentialType;
    }

    public void setResidentialType(String residentialType) {
        this.residentialType = residentialType;
    }
}
