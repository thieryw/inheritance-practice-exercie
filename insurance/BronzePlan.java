package insurance;

public class BronzePlan extends HealthInsurancePlan {

   public void setBronzeCoverage(){
       setCoverage(0.6);
   }

   @Override
   public double computeMonthlyPremium(double salary, int age, boolean isSmoker) {
       
       return salary * 0.05 + getBrand().computeMonthlyPremium(this, age, isSmoker);

   }

   

}