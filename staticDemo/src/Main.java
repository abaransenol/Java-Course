public class Main {
    public static void main(String[] args) {
        //INNER CLASS: Class içi class (static verilebiliyor.)
        //CRUD: Crate read update delete kelimelerinin kısaltmasıdır. Sektörde sıklıkla kullanılır.
        /*
            STATIK METOTLAR
            Static metotlar, normal metotların aksine içinde bulundukları classlar new'lenmeden kullanılabilen metotlardır.
            Genelde UTILITY (araç türü) tanımlarken bu tür bir ifade kullanılır. Arka planda tek bir class newlenir
            ve tüm program boyunca oradaki nesne kullanılır. Bu nesneyi işi bitince javanın garbage collector'ı temizlemez
            bu yüzden de program kapanana kadar nesne orada kalarak optimizasyon sorunları yaratabilir.

            Static metotların olduğu classlarda constructor varsa static metot çağırıldığında bu constructor çalışmaz
            (C#'da ise çalışır.). Buradaki static metotlar çalıştığında constructor gibi bir metodun çalışmasını istersek
            static{} bloğunu o class'ın koduna ekleyebiliriz. Birden fazla static bloğu yazılabilir. Her blok static metotla
            beraber direk olarak çalıştırılır.

            Fakat INNER CLASS'larda durum farklıdır. İç içe olan bu class yapılarında içerideki class'ı static olarak
            işaretleyebiliyoruz. Kodları düzenli bloklar haline getirmek için kullanılır. Kullanımı pek yaygın olmasa da
            programlarda kullanılabilir ve büyük kod problemleri oluşturmaz.

        */

        Product product = new Product();
        product.price = 5;
        product.name = "Laptop";

        ProductManager productManager = new ProductManager();
        productManager.add(product);
        
    }
}