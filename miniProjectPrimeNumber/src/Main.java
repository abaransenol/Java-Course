public class Main {
    public static void main(String[] args) {
        int number = 31;
        boolean isPrime = true;

        if (number == 0 || number == 1) {
            System.out.println(number + " sayısı tanım gereği asal sayı değildir.");
            return; //return ile alttaki kod bloklarına girmek istemediğin zaman programı durdurabilirsin.
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println("Bu bir asal sayı değildir. Bu sayı şuna tam bölünür: " + i);
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Bu sayı bir asal sayıdır.");
        }

    }
}