package TPAssignment4.co.za;

/**
 * Created by thabomoopa on 2017/03/28.
 */
public class Employee extends Person{

    private int number;

    public Employee(int number, String name, String surname, int age, String address)
    {
        super(name, surname, age, address);
        this.number = number;

    }

    public int getNumber() {
        return number;
    }


    public void setNumber(int number) {
        this.number = number;
    }
}
