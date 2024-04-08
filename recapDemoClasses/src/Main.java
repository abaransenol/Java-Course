public class Main {
    public static void main(String[] args) {
        FourTransactions fourTransactions = new FourTransactions();

        int number1 = 10;
        int number2 = 2;

        System.out.println(fourTransactions.topla(number1,number2));
        System.out.println(fourTransactions.cikar(number1,number2));
        System.out.println(fourTransactions.carp(number1,number2));
        System.out.println(fourTransactions.bol(number1,number2));

    }
}