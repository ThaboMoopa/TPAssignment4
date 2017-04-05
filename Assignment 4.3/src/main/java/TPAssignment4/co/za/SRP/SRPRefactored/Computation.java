package TPAssignment4.co.za.SRP.SRPRefactored;

/**
 * Created by thabomoopa on 2017/03/31.
 */
public class Computation{

    private SRPRefactored addition;
    private String computation;

    public Computation(SRPRefactored addition, String computation) {
        this.addition = addition;
        this.computation = computation;
    }

    public SRPRefactored getAddition() {
        return addition;
    }

    public String getComputation() {
        return computation;
    }

    public String results()
    {
        return computation ;

    }
}
