import insurance.*;

public class Patient extends User{

    private HealthInsurancePlan insurancePlan;
    private long patientId;
    private boolean isInsured;

    public void setInsurance(HealthInsurancePlan insurancePlan) {
        this.insurancePlan = insurancePlan;
    }

    public HealthInsurancePlan getInsurancePlan() {
        if(isInsured){
            return insurancePlan;
        }

        return null;
    }

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