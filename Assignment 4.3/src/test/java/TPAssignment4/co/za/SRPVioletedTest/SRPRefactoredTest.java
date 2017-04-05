package TPAssignment4.co.za.SRPVioletedTest;

import TPAssignment4.co.za.SRP.SRPRefactored.Computation;
import TPAssignment4.co.za.SRP.SRPRefactored.SRPRefactored;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by thabomoopa on 2017/03/31.
 */
public class SRPRefactoredTest extends TestCase {
    SRPRefactored refactored = new SRPRefactored();
    Computation compute = new Computation(refactored, "Addition");

    @Test
    public void testComputation()
    {

        assertEquals("addition", compute.results());
    }
    @Test
    public void testValues()
    {
        assertEquals(15,refactored.addition(7,8));
    }
}
