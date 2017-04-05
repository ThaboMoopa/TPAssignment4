package TPAssignment4.co.za.DIPTest;

import TPAssignment4.co.za.DIP.DIPViolated.Doctor;
import TPAssignment4.co.za.DIP.DIPViolated.HospitalManager;
import TPAssignment4.co.za.DIP.DIPViolated.Nurse;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by thabomoopa on 2017/04/01.
 */
public class DIPViolatedTest extends TestCase {
    @Test
    public void testPayEmployee()
    {

        Doctor doctor = new Doctor(546, "Lebo", "Sekgobela", 7);
        HospitalManager manager = new HospitalManager();
        assertEquals(2803.50, manager.payDoctor());

    }
}
