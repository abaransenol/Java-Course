import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        //HASHMAP: Pythondaki dictionary'lere karşılık gelen yapıdır. KEY ve VALUE isimli iki türden meydana gelir.

        HashMap<String,String> dictionary = new HashMap<>();

        //put metotu ile sözlüğe yeni elemanlar eklenir.
        dictionary.put("book","kitap");
        dictionary.put("table","masa");
        dictionary.put("computer","bilgisayar");

        System.out.println(dictionary);

        //keySet metotu yardımı ile sözlükteki tüm keyleri dolaşabiliz.
        for (String key:dictionary.keySet()){
            System.out.println(key + ": " + dictionary.get(key));
        }

        //get metotu ile sözlüğün key'e karşılık gelen elemanını çekebiliriz.
        System.out.println(dictionary.get("computer"));

        //size metotu ile sözlüğün eleman sayısını çekebiliriz.
        System.out.println(dictionary.size());

        //remove metotu ile verdiğimiz key'e karşılık gelen eleman silinir.
        dictionary.remove("book");

        //clear metotu ile sözlüğün tüm elemanları silinir.
        dictionary.clear();


    }
}