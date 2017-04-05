package TPAssignment4.co.za;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by thabomoopa on 2017/03/31.
 */
public class PersonTest extends TestCase {
    Person person = new Person("Thabo", "Moopa", 35, "Pretoria");
    Employee employee = new Employee(2002, new Person("Jack", "Motswetla", 54, "North West"));
    Student student = new Student(214002497, "Information Technology", person);

    @Test
    public void testPerson()
    {
        assertEquals(employee.getPerson(),employee.getPerson());
    }
    @Test
    public void testEmployee()
    {
        assertEquals(employee.getPerson().getName(), student.getPerson().getName());

    }
    @Test
    public void testStudentCourse()
    {
        assertEquals(student.getPerson().getName(), student.getPerson().getName());

    }
    @Test
    public void testEmployeeName()
    {
        assertEquals("Jack", employee.getPerson().getName());
    }
    @Test
    public void testStudentNumber()
    {
        Student student1 = new Student(214002676, "Human Resource Management", new Person("Lerato", "Mokgake", 23, "Mamelodi"));
        assertEquals(214002676,student1.getNumber());
    }

    @Test
    public void testPersonSame()
    {
        assertSame(employee.getPerson(), employee.getPerson());
    }

    @Test
    public void testPersonNotSame()
    {
       assertNotSame(student.getPerson(), student.getPerson());
    }
    @Test
    public void testPersonNotNull()
    {
        assertNotNull(person);
    }


}
