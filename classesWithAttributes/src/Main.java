public class Main {
    public static void main(String[] args) {

        Product product = new Product(1,"Laptop","asus",1500,2,"red");

        Product product1 = new Product();
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Asus");
        product.setPrice(1000);
        product.setStockAmount(2);

        ProductManager productManager=new ProductManager();
        productManager.Add(product);
        System.out.println(product.getKod());

    }
}