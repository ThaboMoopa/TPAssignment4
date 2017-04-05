package TPAssignment4.co.za.DIP.DIPViolated;

/**
 * Created by thabomoopa on 2017/04/01.
 */
public class Nurse {
    private int nurseNumber;
    private String name;
    private String surname;
    private int hoursWorked;

    public int getNurseNumber() {
        return nurseNumber;
    }

    public void setNurseNumber(int nurseNumber) {
        this.nurseNumber = nurseNumber;
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

    public Nurse(int nurseNumber, String name, String surname, int hoursWorked) {

        this.nurseNumber = nurseNumber;
        this.name = name;
        this.surname = surname;
        this.hoursWorked = hoursWorked;
    }
    public double payEmployee()
    {
        return hoursWorked * 200.50;
    }
}
