import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //ARRAYLIST yapısı
        /*
            Arraylistleri dizilerin bir tık daha gelişmiş hali olarak tanımlayabiliriz. Dizilerdeki gibi tek bir türde
            olma zorundalığı ve belirlenen eleman sayısından fazla eleman ekleyememe durumu yoktur.
        */

        ArrayList numbers = new ArrayList();

        //add metotu yardımı ile arraylistlere sonuncu indexten itibaren eleman ekleriz.
        numbers.add(1);
        numbers.add(10);
        numbers.add("Ankara");

        //get metotu ile beraber parantez içerisindeki index numarasına sahip elemanı çekeriz.
        System.out.println(numbers.get(0));

        /*  remove metotu ile parantez içerisindeki index numarasına sahip elemanı sileriz. Eleman silindikten sonra onun
        yerine bir öndeki eleman geçer. Yani silinen index sonrasındaki liste bir sola kayar.   */
        System.out.println(numbers.remove(1));

        /*  For döngüsü yardımıyla listedeki tüm yapıları dolaşabiliriz. Fakat dizinin içerisindeki yapılar farklı türlerde
        olduğundan listede dönecek eleman "object" türünde olmalıdır.    */
        for (Object i: numbers){
            System.out.println(i);
        }

        //clear metotu index numaralarıyla beraber listeyi tamamen siler.
        numbers.clear();
        System.out.println(numbers.get(0));


    }
}