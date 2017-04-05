package TPAssignment4.co.za;

/**
 * Created by thabomoopa on 2017/03/31.
 */
public class Employee  {
    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public Person getPerson() {
        return person;
    }

    public Employee(int employeeNumber, Person person) {

        this.employeeNumber = employeeNumber;
        this.person = person;
    }

    private int employeeNumber;

    private Person person;



}
