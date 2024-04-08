public class Main {
    public static void main(String[] args) {

        //BEST PRACTISE: en iyi,verimli ve performanslı koda verilen ad.

        //1- Amele yöntemi:
        String ogrenci1 = "Ali";
        String ogrenci2 = "Baran";
        String ogrenci3 = "Şenol";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);

        //2-Listeli yöntem (Best Practise)

        String[] ogrenciler = new String[3];
        //Burada bir STRING ARRAY tanımladık. "new" ifadesi bu tanımdaki anahtar kelimedir.
        //Eşittirin diğer tarafındaki köşeli parantez içinde yazan sayı listenin eleman sayısıdır.

        ogrenciler[0] = "Ali";
        ogrenciler[1] = "Baran";
        ogrenciler[2] = "Şenol";

        //a-For ile integer kullanarak ekrana yazdırma yöntemi
        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }

        //b-For ile direk listenin elemanlarını dolaşarak ekrana yazdırma yöntemi (Best Practise)
        for (String o : ogrenciler) {
            System.out.println(o);
        }//Bu bir FOREACH döngüsüdür.
    }
}