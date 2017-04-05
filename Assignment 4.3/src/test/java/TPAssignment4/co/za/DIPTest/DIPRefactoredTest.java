package TPAssignment4.co.za.DIPTest;

import TPAssignment4.co.za.DIP.DIPRefactored.Doctor;
import TPAssignment4.co.za.DIP.DIPRefactored.HospitalManager;
import TPAssignment4.co.za.DIP.DIPRefactored.Nurse;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by thabomoopa on 2017/04/01.
 */
public class DIPRefactoredTest extends TestCase {
    @Test
    public void testGetNurse()
    {
        Doctor doctor = new Doctor(536, "Lethabo", "Lethabo", 20);
        Nurse nurse = new Nurse(3562, "Thando", "Thabethe", 10);
        HospitalManager manager = new HospitalManager(doctor, nurse);
        assertEquals(nurse, manager.getDoctor());
    }
    @Test
    public void testPayEmployee()
    {
        Doctor doctor = new Doctor(536, "Lethabo", "Lethabo", 20);
        Nurse nurse = new Nurse(3562, "Thando", "Thabethe", 10);
        HospitalManager manager = new HospitalManager(doctor, nurse);
        assertEquals(16020, manager.getDoctor().payEmployee());
    }
}
