package TPAssignment4.co.za.DIP.DIPRefactored;

/**
 * Created by thabomoopa on 2017/04/01.
 */
public class HospitalManager {

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Nurse getNurse() {
        return nurse;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }

    private Doctor doctor;
    private Nurse nurse;

    public HospitalManager(Doctor doctor, Nurse nurse) {
        this.doctor = doctor;
        this.nurse = nurse;
    }
}
