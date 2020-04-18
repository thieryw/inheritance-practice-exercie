package insurance;

public class GoldPlan extends HealthInsurancePlan{

    public void setGoldCoverage(){
        setCoverage(0.8);
    }

    public double computeMonthlyPremium(double salary) {
        return salary - salary * 0.7;
    }
}