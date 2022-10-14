public class FarmCreditManager extends BaseCreditManager{
    public double calculate(double amount) {

        return amount * 1.25;
    }

        public String getName(){
        return "Farm Credit";
    }
}
