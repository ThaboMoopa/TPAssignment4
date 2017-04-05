package TPAssignment4.co.za;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by thabomoopa on 2017/03/30.
 */
public class PersonTest  extends TestCase {


    @Test
    public void testPerson()
    {
        //Polymorphism
        Person person1 = new Employee(1, "Thabo","Moopa", 24, "Pretoria");
        Person person2 = new Employee(1, "Thabo","Moopa", 24, "Pretoria");
        assertEquals(person1, person2);
    }
    @Test
    public void testEmployee()
    {
        Person employee1 = new Employee(5, "Lethabo", "Jack", 34, "Bloemfontein");
        assertNotNull(employee1);
    }
    @Test
    public void testStudentCourse()
    {
        Student student1 = new Student(65, "Jackson", "Merusi", 33, "Pretoria", "IT");
        assertEquals("IT", student1.getCourse());
    }
    @Test
    public void testEmployeeName()
    {
        //Polymorphism
        Person person3 = new Employee(3, "John", "Kgopa", 54, "Johannesburg");
        assertEquals("John", person3.getName());
    }
}
