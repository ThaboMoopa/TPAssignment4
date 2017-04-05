package TPAssignment4.co.za.LiskovTest;

import TPAssignment4.co.za.LiskovPrinciple.LiskovViolated.AreaCalculator;
import TPAssignment4.co.za.LiskovPrinciple.LiskovViolated.Rectangle;
import TPAssignment4.co.za.LiskovPrinciple.LiskovViolated.Square;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by thabomoopa on 2017/04/01.
 */
public class LiskovViolatedTest extends TestCase {
 @Test
    public void testRectangle()
 {
     AreaCalculator calculate = new AreaCalculator();
     Rectangle rectangle = new Rectangle(4,4);
     assertEquals(16, calculate.calculateRectangle(rectangle));
 }
 @Test
    public void testSquare()
 {
     Rectangle rectangle = new Rectangle(4,4);
     AreaCalculator calculate = new AreaCalculator();
     Square square = new Square(4,4, rectangle);
     assertEquals(16, calculate.calculateSquare(square));
 }
 @Test
    public void testRectangleSquare()
 {
    Rectangle rectangle = new Rectangle(7,8);
    Square square = new Square(7,8,rectangle);
    AreaCalculator calculate = new AreaCalculator();
    assertEquals(calculate.calculateRectangle(rectangle),calculate.calculateSquare(square));
 }

}
