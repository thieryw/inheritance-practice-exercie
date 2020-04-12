package patientAndPersonal;

public class Patient extends User{


    private long patientId;
    private boolean isInsured;

    public long getPatientId() {
        return patientId;
    }

    public boolean isInsured() {
        return isInsured;
    } 

    public void setPatientId(long patientId) {
        this.patientId = patientId;
    }

    public void setInsured(boolean isInsured) {
        this.isInsured = isInsured;
    }

    
}