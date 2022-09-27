package oop1;

public class Main {
    public static void main(String[] args) {
        String mesaj = "Vade oranı";

        Product product1 = new Product();
        product1.setName("Kahve Makinesi");
        product1.setDiscount(7);
        product1.setUnitPrice(7500);
        product1.setUnitsInStock(5);
        product1.setImageUrl("image1.jpeg");


        Product product2 = new Product();
        product2.setName("Kahve ");
        product2.setDiscount(7);
        product2.setUnitPrice(6500);
        product2.setUnitsInStock(6);
        product2.setImageUrl("image2.jpeg");


        Product product3 = new Product();
        product3.setName("Kahve fincanı");
        product3.setDiscount(7);
        product3.setUnitPrice(4500);
        product3.setUnitsInStock(5);
        product3.setImageUrl("image3.jpeg");


        Product[] products = {product1, product2, product3};
        System.out.println("<ul>");
        for (Product productFor : products) {
            System.out.println("<li>" + productFor.getName() + "</li>");
        }
        System.out.println("</ul>");

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("5222222222");
        individualCustomer.setCustomerNumber("12345");
        individualCustomer.setFirstName("Mustafa");
        individualCustomer.setLastName("Cicek");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("Kodlama.io");
        corporateCustomer.setPhone("51111111111");
        corporateCustomer.setTaxNumber("111111111");
        corporateCustomer.setCustomerNumber("54321");

        Customer[] customers ={individualCustomer,corporateCustomer};

    }
}