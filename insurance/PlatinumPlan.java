package insurance;

public class PlatinumPlan extends HealthInsurancePlan {

    public void setPlatinumCoverage(){
        setCoverage(0.9);
    }

    public double computeMonthlyPremium(double salary){
        return salary * 0.08;
    }

}