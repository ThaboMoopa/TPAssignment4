package TPAssignment4.co.za.DIP.DIPViolated;

/**
 * Created by thabomoopa on 2017/04/01.
 */
public class HospitalManager {

    private Nurse nurse;
    private Doctor doctor;

    public double payDoctor()
    {
        return doctor.payEmployee();
    }
    public double payNurse()
    {
        return nurse.payEmployee();
    }
}
