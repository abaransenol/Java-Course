public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        ProductManager productManager = new ProductManager();

        product.setId(1);
        product.setName("Laptop");

        System.out.println(product.getId());
        productManager.add(product);
        System.out.println(product.getKod());

        /*
           Değişkenleri direk olarak ürünle ilgili metotlara göndermektense ürün ve ürün yöneticisi adı iki class
           yardımıyla bu olayı yapmak sürdürülebilir yazılıma çok daha uygundur. Çünkü eğer bu ürünün metotlarını 100
           yerde kullandıysak ve bu ürüne yeni bir özellik geldiyse bunu 100 yerin hepsine tek tek manuel olarak entegre
           etmemiz gerekir. Diğer türlü metota doğru değişken gelmediği için sistem çöker. Fakat bunu ürün ve ürün
           yöneticisi yöntemi ile yaparsak yapmamız gereken tek şey ürün class'ına yeni bir attribute eklemektir. Ayrıca
           bu özelliği tanımladığımız ürün nesnesine yeni bir özellik olarak girmezsek program da çökmez. Bu yüzden bu
           yöntem hem işleri kolaylaştırarak basite indirger hem de kodun okunabilirliğine katkı sağlar.

        */
    }
}