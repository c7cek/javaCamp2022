public abstract class Customer {
    public int id;

    public String city;

    public Customer(){
        System.out.println("Customer obj started");
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
