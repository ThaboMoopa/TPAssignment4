package TPAssignment4.co.za;

/**
 * Created by thabomoopa on 2017/03/31.
 */
public class Student {
    private int number;
    private String course;

    private Person person;

    public int getNumber() {
        return number;
    }

    public String getCourse() {
        return course;
    }

    public Person getPerson() {
        return person;
    }

    public Student(int number, String course, Person person) {

        this.number = number;
        this.course = course;
        this.person = person;
    }
}
