package TPAssignment4.co.za.LiskovTest;

import TPAssignment4.co.za.LiskovPrinciple.LiskovRefactored.AreaCalculator;
import TPAssignment4.co.za.LiskovPrinciple.LiskovRefactored.Rectangle;
import TPAssignment4.co.za.LiskovPrinciple.LiskovRefactored.Square;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by thabomoopa on 2017/04/01.
 */
public class LiskovRefactorTest extends TestCase {
    @Test
    public void testRectangle() {
        Rectangle rectangle = new Rectangle(4, 4);
        assertEquals(16, rectangle.Area());
    }

    @Test
    public void testSquare()
    {
        Square square = new Square(5);
        assertEquals(25, square.Area());

    }
    @Test
    public void testCalculateSquare()
    {
        AreaCalculator area = new Square(5);
        assertEquals(25, area.Area());

    }
    @Test
    public void testCalculateRectangle()
    {
        AreaCalculator rectangle = new Rectangle(5,5);
        assertEquals(25, rectangle.Area());
    }
    @Test
    public void testListInstances()
    {
        Rectangle rectangle = new Rectangle(2,7);
        Square square = new Square(5);
        List<AreaCalculator> shape = new ArrayList<AreaCalculator>();
        shape.add(rectangle);
        shape.add(square);
        assertEquals(false, shape.contains(rectangle.Area()));
    }
}
