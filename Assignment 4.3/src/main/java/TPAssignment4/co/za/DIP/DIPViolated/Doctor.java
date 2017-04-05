package TPAssignment4.co.za.DIP.DIPViolated;

/**
 * Created by thabomoopa on 2017/04/01.
 */
public class Doctor {
    public int getDoctorNumber() {
        return doctorNumber;
    }

    public void setDoctorNumber(int doctorNumber) {
        this.doctorNumber = doctorNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public Doctor(int doctorNumber, String name, String surname, int hoursWorked) {

        this.doctorNumber = doctorNumber;
        this.name = name;
        this.surname = surname;
        this.hoursWorked = hoursWorked;
    }


    private int doctorNumber;
    private String name;
    private String surname;
    private int hoursWorked;

    public double payEmployee()
    {
        return hoursWorked * 400.50;
    }

}
