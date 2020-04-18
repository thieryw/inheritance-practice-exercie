import java.util.Arrays;
import insurance.HealthInsurancePlan;
import insurance.InsuranceBrand;
import insurance.PlatinumPlan;
import insurance.SilverPlan;

public class Hospital {


    public static void main(String[] args) {

        HealthInsurancePlan insurancePlan = new PlatinumPlan();

        InsuranceBrand insuranceBrand = new InsuranceBrand();
        insuranceBrand.setId(123);
        insuranceBrand.setName("red cross");

        insurancePlan.setBrand(insuranceBrand);


        User william = new Doctor();

        william.setEmail("william@gmail.com");
        william.setFirstName("william");
        william.setGender("male");
        william.setId(1001);
        william.setLastName("thiery");
        ((Doctor)william).setSalary(3000);
        
        ((Doctor) william).setInsured(true);
        ((Doctor) william).setDoctorId(11001);
        ((Doctor) william).setInsurance(insurancePlan);

        System.out.println(Arrays.toString(Billing.computePaymentAmount(((Doctor) william), 1000.0)));

        System.out.println(((PlatinumPlan)insurancePlan).computeMonthlyPremium(((Doctor)william).getSalary()));




        



    }

}