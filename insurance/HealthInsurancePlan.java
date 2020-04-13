package insurance;

public class HealthInsurancePlan {

    private double coverage;

    private InsuranceBrand offeredBy;

    public double getCoverage() {
        return coverage;
    }

    protected void setCoverage(double coverage) {
        this.coverage = coverage;
    }

    public InsuranceBrand getBrand() {
        return offeredBy;
    }

    public void setBrand(InsuranceBrand offeredBy) {
        this.offeredBy = offeredBy;
    }

    

}