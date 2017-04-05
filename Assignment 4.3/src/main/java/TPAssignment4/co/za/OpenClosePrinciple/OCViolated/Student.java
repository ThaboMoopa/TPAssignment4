package TPAssignment4.co.za.OpenClosePrinciple.OCViolated;

/**
 * Created by thabomoopa on 2017/03/31.
 */
public class Student extends Person{

    private int studentNumber;

    public Student(String name, String surname, String address, int age, int studentNumber) {
        super(name, surname, address, age);
        this.studentNumber = studentNumber;
    }

    public int getStudentNumber() {
        return studentNumber;
    }
}
