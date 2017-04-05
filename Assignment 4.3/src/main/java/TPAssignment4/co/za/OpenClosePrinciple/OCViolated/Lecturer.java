package TPAssignment4.co.za.OpenClosePrinciple.OCViolated;

/**
 * Created by thabomoopa on 2017/03/31.
 */
public class Lecturer extends Person{


    private int lecturerNumber;


    public Lecturer(String name, String surname, String address, int age, int lecturerNumber) {
        super(name, surname, address, age);
        this.lecturerNumber = lecturerNumber;
    }

    public int getLecturerNumber() {
        return lecturerNumber;
    }
}
