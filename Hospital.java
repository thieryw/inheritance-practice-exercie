import java.util.Arrays;
import insurance.HealthInsurancePlan;
import insurance.InsuranceBrand;
import insurance.SilverPlan;

public class Hospital {


    public static void main(String[] args) {

        HealthInsurancePlan insurancePlan = new SilverPlan();

        InsuranceBrand insuranceBrand = new InsuranceBrand();
        insuranceBrand.setId(123);
        insuranceBrand.setName("red cross");

        insurancePlan.setBrand(insuranceBrand);


        User william = new Patient();

        william.setEmail("william@gmail.com");
        william.setFirstName("william");
        william.setGender("male");
        william.setId(1001);
        william.setLastName("thiery");
        ((Patient) william).setInsured(true);
        ((Patient) william).setPatientId(11001);
        ((Patient) william).setInsurance(insurancePlan);

        System.out.println(Arrays.toString(Billing.computePaymentAmount(((Patient) william), 1000.0)));


        



    }

}