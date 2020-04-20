package insurance;

public class BlueCrossBlueShield implements InsuranceBrand {
        
    private long id;
    private String name;


    public long getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public void setId(long id) {
        this.id = id;
    }


    public void setName(String name) {
        this.name = name;
    }


    public double computeMonthlyPremium(HealthInsurancePlan insurancePlan, int age, boolean isSmoker){

        if(insurancePlan instanceof BronzePlan){
            return (age > 55 ? 50 : 0) + (isSmoker ? 70 : 0);
        }

        if(insurancePlan instanceof SilverPlan){
            return (age > 55 ? 100 : 0) + (isSmoker ? 80 : 0);
        }

        if(insurancePlan instanceof GoldPlan){
            return (age > 55 ? 150 : 0) + (isSmoker ? 90 : 0);
        }

        return (age > 55 ? 200 : 0) + (isSmoker ? 100: 0); 

    }


}