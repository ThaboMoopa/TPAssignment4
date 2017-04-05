package TPAssignment4.co.za.DIP.DIPRefactored;

/**
 * Created by thabomoopa on 2017/04/01.
 */
public class WorkImpl implements Work {
    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    private int hoursWorked;
    private double amount;

    public double payEmployee() {
        return hoursWorked * amount;
    }

}
