public class TeacherCreditManager extends BaseCreditManager{
    public double calculate(double amount) {

        return amount * 1.22;
    }
    public String getName(){
        return "Teacher Credit";
    }
}
