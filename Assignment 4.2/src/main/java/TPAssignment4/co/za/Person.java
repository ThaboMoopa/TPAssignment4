package TPAssignment4.co.za;

/**
 * Created by thabomoopa on 2017/03/31.
 */
public class Person {

    private String name;
    private String surname;
    private int age;
    private String address;

    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }
    public void loadPerson()
    {
        System.out.println("Name: " + name + " " + "\nSurname: " + surname + "\nAge: " + age + "\nAddress: "+address);
    }




}
