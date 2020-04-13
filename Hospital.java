
public class Hospital {

    public static String getUserEmail(User u){
        return u.getEmail();
    }

    public static void main(String[] args) {

       User doctor = new Doctor();
       User nurse = new Nurse();
       User patient = new Patient();

       doctor.setEmail("doctor@email.com");
       nurse.setEmail("nurse@email.com");
       patient.setEmail("patient@email.com");



       System.out.println("doctor email : " + getUserEmail(doctor) + "\n" +
       "nurse email : " + getUserEmail(nurse) + "\n" +
       "patient email : " + getUserEmail(patient));





    }

}