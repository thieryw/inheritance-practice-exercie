package insurance;

public class GoldPlan extends HealthInsurancePlan{

    public void setGoldCoverage(){
        setCoverage(0.8);
    }

    public double computeMonthlyPremium(double salary, int age, boolean isSmoker) {
        return salary * 0.07 + getBrand().computeMonthlyPremium(this, age, isSmoker);
    }
}