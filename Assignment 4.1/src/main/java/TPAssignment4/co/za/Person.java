package TPAssignment4.co.za;

/**
 * Created by thabomoopa on 2017/03/28.
 */
public class Person {

    private String name;
    private String surname;
    private int age;
    private String address;


    public Person(String fName,String lName,int personAge,String personAddress)
    {
        this.name = fName;
        this.surname = lName;
        this.age = personAge;
        this.address = personAddress;
    }
    public Person()
    {
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

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }




}
