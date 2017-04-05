package TPAssignment4.co.za.LiskovPrinciple.LiskovViolated;

/**
 * Created by thabomoopa on 2017/04/01.
 */
public class AreaCalculator {

    public int calculateSquare(Square square)
    {
        return square.getWidth() * square.getHeight();
    }

    public int calculateRectangle(Rectangle rectangle)
    {
        return rectangle.getHeight() * rectangle.getHeight();
    }
}
