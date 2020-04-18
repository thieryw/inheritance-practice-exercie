package insurance;

public class SilverPlan extends HealthInsurancePlan {

    public void setSilverCoverage(){
        setCoverage(0.7);
    }

    public double computeMonthlyPremium(double salary){
        return salary - salary * 0.6;
    }
    
}