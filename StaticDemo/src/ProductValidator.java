public class ProductValidator {
    static {
        System.out.println("Static constructor working");
    }
    public ProductValidator(){
        System.out.println("Constructor working");

    }
    public static boolean isValid(Product product){
        if (product.price>0 && !product.name.isEmpty()){
            return false;
        }else {
            return true;
        }

    }

    public void random(){

    }

}
