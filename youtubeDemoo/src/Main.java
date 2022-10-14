public class Main {
    public static void main(String[] args) {

        //IoC Container
        CustomerManager customerManager=new CustomerManager(new Person(), new TeacherCreditManager());
        customerManager.giveCredit();

        CustomerManager customerManager1 =new CustomerManager();

        Customer customer = new Company();

        Customer customer1 = new Person();

        customerManager1.saveCustomer(customer);




//        CreditManager creditManager = new CreditManager();
//        creditManager.calculate();
//        creditManager.save();
//
//
//        Customer  customer= new Customer();
//        customer.city="Ankara";
//
//
//        CustomerManager customerManager = new CustomerManager(customer);
//        customerManager.save();
//        customerManager.delete();
//
//        Company company=new Company();
//        company.taxNumber="200000000";
//        company.companyName="Beko";
//        company.id=100;
//
//
//        CustomerManager customerManager1 = new CustomerManager(new Company());
//
//
//        Person person = new Person();



    }
}