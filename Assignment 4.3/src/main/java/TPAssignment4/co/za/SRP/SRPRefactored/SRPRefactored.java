package TPAssignment4.co.za.SRP.SRPRefactored;

/**
 * Created by thabomoopa on 2017/03/31.
 */
public class SRPRefactored {

    private int number1;
    private int number2;

    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }

    public SRPRefactored()
    {

    }

    public SRPRefactored(int a, int b)
    {
        this.number1 = a;
        this.number2 = b;
    }
    public int addition(int a, int b)
    {
        return a + b;
    }

}
