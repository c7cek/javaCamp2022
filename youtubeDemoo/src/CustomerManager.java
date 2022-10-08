public class CustomerManager {
    private Customer _customer;
    private ICreditManager _creditManager;

    public CustomerManager(Customer customer, ICreditManager creditManager) {
        this._customer = customer;
        this._creditManager = creditManager;
    }
    public CustomerManager(){

    }

    public void save() {
        System.out.println("Customer saved : ");
    }

    public void delete() {
        System.out.println("Customer deleted : ");
    }

    public void giveCredit() {
        _creditManager.calculate();
        System.out.println("Credit given");
    }
    public void saveCustomer(Customer customer){
        System.out.println("Customer saved"+customer.id);
    }

}
