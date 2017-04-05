package TPAssignment4.co.za.SRPVioletedTest;

import TPAssignment4.co.za.SRP.SRPViolated.SRPViolated;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by thabomoopa on 2017/03/31.
 */
public class SRPVioletedTest extends TestCase {

    @Test
    public void testSRPVioled()
    {
        SRPViolated srp = new SRPViolated();
        assertEquals(15, srp.addition(7,8));
    }
}
