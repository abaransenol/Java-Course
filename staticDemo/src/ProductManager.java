public class ProductManager {
    public void add(Product product){
        if(ProductValidator.isValid(product)){
            System.out.println("Nesne eklendi!");
        }else {
            System.out.println("Ürün bilgileri geçersiz.");
        }
    }
}
