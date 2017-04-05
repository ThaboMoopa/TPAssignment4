package TPAssignment4.co.za.LiskovPrinciple.LiskovRefactored;

/**
 * Created by thabomoopa on 2017/04/01.
 */
public class Square extends AreaCalculator {

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Square(int length) {

        this.length = length;
    }

    private int length;
    @Override
    public int Area() {
        return length * length;
    }
}
