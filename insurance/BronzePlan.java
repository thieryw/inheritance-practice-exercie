package insurance;

public class BronzePlan extends HealthInsurancePlan {

   public void setBronzeCoverage(){
       setCoverage(0.6);
   }

   @Override
   public double computeMonthlyPremium(double salary) {
       return salary - salary * 0.5;
   }

   

}