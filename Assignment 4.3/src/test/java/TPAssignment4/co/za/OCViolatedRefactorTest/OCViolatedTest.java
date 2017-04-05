package TPAssignment4.co.za.OCViolatedRefactorTest;

import TPAssignment4.co.za.OpenClosePrinciple.OCViolated.Lecturer;
import TPAssignment4.co.za.OpenClosePrinciple.OCViolated.Person;
import TPAssignment4.co.za.OpenClosePrinciple.OCViolated.Student;
import TPAssignment4.co.za.OpenClosePrinciple.OCViolated.University;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by thabomoopa on 2017/04/01.
 */
public class OCViolatedTest extends TestCase
{
    University university = new University();
    Person person = new Person("Thabo", "Moopa", "Pretoria", 54);
    Student student = new Student("Lesego", "Rametsi", "Bloemfontein",21, 2177789);
    Lecturer lecturer = new Lecturer("Lerato", "Skhukhune", "Bloemfontein",32, 21);


    @Test
    public void testUniversity()
    {
        assertEquals(university.equals(student), university);
    }
}
