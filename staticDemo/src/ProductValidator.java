public class ProductValidator {
    public static boolean isValid(Product product){
        if (!product.name.isEmpty() && product.price>0){
            return true;
        }else {
            return false;
        }
    }
}
