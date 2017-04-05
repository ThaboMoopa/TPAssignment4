package TPAssignment4.co.za;

/**
 * Created by thabomoopa on 2017/03/28.
 */
public class Student extends Person {

    private int number;
    private String course;

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Student(int number, String name, String surname, int age, String address, String course )
    {
        super(name, surname, age, address);
        this.number = number;
        this.course = course;
    }
    public void setNumber(int studentNumber)
    {
        this.number = studentNumber;
    }
    public int getNumber()
    {
        return number;
    }
}
