package src.JobSystem;

class Teacher extends Urban {

    private int experience;
    private String qualification;
    private double payment;

    public Teacher() {


    }

    public Teacher(String name, int age, char gender, String residentialType,
                   String cityName, String locationName, String occupationType,
                   int cityId, int experience, String qualification, double payment) {
        super(name, age, gender, residentialType, cityName, locationName, occupationType, cityId);
        this.experience = experience;
        this.qualification = qualification;
        this.payment = payment;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getQualification() {
        return qualification;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }


}
