import patientAndPersonal.Nurse;
import patientAndPersonal.Patient;
import patientAndPersonal.User;

public class Hospital {


    public static void main(String[] args) {

       Patient william = new Patient();

       william.setId(1);
       william.setEmail("williamalexthiery@hotmail.fr");
       william.setFirstName("william");
       william.setLastName("thiery");
       william.setGender("male");
       william.setInsured(true);
       william.setPatientId(10001);

       System.out.println(william.getEmail() + "\n" + william.getPatientId());

       Nurse laeticia = new Nurse();

       laeticia.setFirstName("laeticia");

       System.out.println(laeticia.getFirstName());

    }

}