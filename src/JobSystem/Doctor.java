package src.JobSystem;

class Doctor extends Urban {

    private String hospitalName;
    private int patientNumber;
    private int doctorID;
    private double payment;

    public Doctor() {


    }

    public Doctor(String name, int age, char gender, String residentialType, String cityName,
                  String locationName, String occupationType, int cityId, String hospitalName,
                  int patientNumber, int doctorID, double payment) {

        super(name, age, gender, residentialType, cityName, locationName, occupationType, cityId);
        this.hospitalName = hospitalName;
        this.patientNumber = patientNumber;
        this.doctorID = doctorID;
        this.payment = payment;

    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public int getPatientNumber() {
        return patientNumber;
    }

    public void setPatientNumber(int patientNumber) {
        this.patientNumber = patientNumber;
    }

    public int getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(int doctorID) {
        this.doctorID = doctorID;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }
}
