package TPAssignment4.co.za.OpenClosePrinciple.OCViolated;

/**
 * Created by thabomoopa on 2017/03/31.
 */
public class Person {

    private String name;
    private String surname;
    private String address;
    private int age;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public Person(String name, String surname, String address, int age) {

        this.name = name;
        this.surname = surname;
        this.address = address;
        this.age = age;
    }



}
