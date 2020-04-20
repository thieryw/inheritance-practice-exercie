package insurance;

public class SilverPlan extends HealthInsurancePlan {

    public void setSilverCoverage(){
        setCoverage(0.7);
    }

    public double computeMonthlyPremium(double salary, int age, boolean isSmoker){
        return salary * 0.06 + getBrand().computeMonthlyPremium(this, age, isSmoker);
    }
    
}