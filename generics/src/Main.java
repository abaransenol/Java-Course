import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        /*
            GENERIC CLASSES
            Generic classlar birbirine benzer operasyonlarda tip güvenli çalıştığımız zamanlarda bize yardımcı olan
            sınıflardır.

        */
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Ankara");
        cities.add("İstanbul");

        MyList<Integer> myList = new MyList<Integer>();
        myList.add(69420);
    }
}