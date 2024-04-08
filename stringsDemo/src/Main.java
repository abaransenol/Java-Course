public class Main {
    public static void main(String[] args) {
        String message = "Bugün hava çok sıcak.";
        System.out.println(message);

        /*System.out.println("Eleman sayısı: "+ message.length());
        System.out.println("7. elemanı: "+ message.charAt(6));
        System.out.println(message.concat(" Klima almak farz oldu.")); //concat metodu stringe ekleme yapar fakat tanımladığımız ilk stringi değiştirmez.
        System.out.println(message.startsWith("B"));
        System.out.println(message.endsWith("k"));

        char[] characters = new char[10];
        message.getChars(0,10,characters,0);
        System.out.println(characters);

        System.out.println(message.indexOf("ü"));
        System.out.println(message.lastIndexOf("k"));*/

        String newMessage = message.replace(" ","_");
        System.out.println(newMessage);

        for (String word: message.split(" ")) {
            System.out.println(word);
        }

        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim());

    }
}