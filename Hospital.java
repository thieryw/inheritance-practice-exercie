import java.util.Arrays;

import insurance.BlueCrossBlueShield;
import insurance.GoldPlan;
import insurance.HealthInsurancePlan;
import insurance.InsuranceBrand;
import insurance.PlatinumPlan;
import insurance.SilverPlan;

public class Hospital {


    public static void main(String[] args) {

        HealthInsurancePlan insurancePlan = new GoldPlan();
        InsuranceBrand insuranceBrand = new BlueCrossBlueShield();
        insurancePlan.setBrand(insuranceBrand);
        User william = new Doctor();

        william.setEmail("william@gmail.com");
        william.setFirstName("william");
        william.setGender("male");
        william.setId(1001);
        william.setLastName("thiery");
        william.setAge(29);
        william.setSmoker(true);
        ((Doctor)william).setSalary(3000);
        
        ((Doctor) william).setInsured(true);
        ((Doctor) william).setDoctorId(11001);
        ((Doctor) william).setInsurance(insurancePlan);

        System.out.println(Arrays.toString(Billing.computePaymentAmount(((Doctor) william), 1000.0)));

        System.out.println(william.getInsurancePlan().computeMonthlyPremium(((Doctor)william).getSalary(), william.getAge(), william.isSmoker()));


    }

}