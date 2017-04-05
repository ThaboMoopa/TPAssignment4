package TPAssignment4.co.za.LiskovPrinciple.LiskovRefactored;

/**
 * Created by thabomoopa on 2017/04/01.
 */
public class Rectangle extends AreaCalculator {

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    private int width;
    private int height;

    @Override
    public int Area() {
        return width * height;
    }
}
