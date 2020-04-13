import insurance.BronzePlan;
import insurance.GoldPlan;
import insurance.HealthInsurancePlan;
import insurance.PlatinumPlan;
import insurance.SilverPlan;

public class Billing {

    private static double[] getCoverageAndReduction(HealthInsurancePlan patientInsurancePlan){

        double[] coverageAndReduction = new double[2];

        if(patientInsurancePlan instanceof PlatinumPlan){
            ((PlatinumPlan) patientInsurancePlan).setPlatinumCoverage();
            coverageAndReduction[1] = 50;
        }

        if(patientInsurancePlan instanceof GoldPlan){
            ((GoldPlan) patientInsurancePlan).setGoldCoverage();
            coverageAndReduction[1] = 40;
        }

        if(patientInsurancePlan instanceof SilverPlan){
            ((SilverPlan) patientInsurancePlan).setSilverCoverage();
            coverageAndReduction[1] = 30;
        }

        if(patientInsurancePlan instanceof BronzePlan){
            ((BronzePlan) patientInsurancePlan).setBronzeCoverage();
            coverageAndReduction[1] = 25;
        }

        coverageAndReduction[0] = patientInsurancePlan.getCoverage();

        return coverageAndReduction;

    }



    public static double[] computePaymentAmount(Patient patient, double amount){

        double[] payments = new double[2];

        HealthInsurancePlan patientInsurancePlan = patient.getInsurancePlan();

        if(patientInsurancePlan == null){
            payments[0] = 0;
            payments[1] = amount >= 20 ? amount - 20 : amount;

            return payments;
        }

        double[] coverageAndReduction = getCoverageAndReduction(patientInsurancePlan);

        payments[0] = amount * coverageAndReduction[0];

        payments[1] = amount >= coverageAndReduction[1] ? 
        amount - payments[0] - coverageAndReduction[1] :
        amount - payments[0];

        return payments;


    }

}