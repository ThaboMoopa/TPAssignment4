package TPAssignment4.co.za.LiskovPrinciple.LiskovViolated;

/**
 * Created by thabomoopa on 2017/04/01.
 */
public class Square {
    private int width;
    private int height;
    private Rectangle rectangle;

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

    public Rectangle getRectangle() {
        return rectangle;
    }

    public void setRectangle(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    public Square(int width, int height, Rectangle rectangle) {

        this.width = width;
        this.height = height;
        this.rectangle = rectangle;
    }

}
