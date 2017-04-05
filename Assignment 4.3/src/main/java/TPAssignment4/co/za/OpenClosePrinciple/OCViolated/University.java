package TPAssignment4.co.za.OpenClosePrinciple.OCViolated;

/**
 * Created by thabomoopa on 2017/03/31.
 */
public class University {

    public void perfromDuties(Person person)
    {
        if (person instanceof Student) {
            classesToAttend();
            studyingHours();
        }
        else if(person instanceof Lecturer)
        {
            numberOfLecturers();
            numberOfTutorials();
        }

    }
    //students  function at the university
    public void classesToAttend()
    {
        System.out.println("Must attend atleast 5 lectures a day");
    }
    public void studyingHours()
    {
        System.out.println("Must attend atleast 16 hours in the library");
    }

    //Lecturer functions in the university
    public void numberOfLecturers()
    {
        System.out.println("Lecturer 4 classes today");
    }
    public void numberOfTutorials()
    {
        System.out.println("Give 5 tutorials on Open Close Violation");
    }

}
