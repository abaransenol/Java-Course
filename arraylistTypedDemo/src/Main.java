import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        //TYPE-SAFE: Tip güvenli çalışma demektir. Kullandığımız arraylerin tek türde bir array olmasını istersek bu
        //yönteme başvururuz.

        ArrayList<String> cities = new ArrayList<String>();

        cities.add("İstanbul");
        cities.add("Ankara");
        cities.add("İzmir");

        cities.remove(0);
        cities.add("Eskişehir");


        //sort metotu tip güvenli arraylerde array içerisindeki elemanları sıralamaya yarar (String için alfabe sırası vs.).
        Collections.sort(cities);   //cities.sort(); kullanımı da vardır.

        for (String city:cities){
            System.out.println(city);
        }
    }
}