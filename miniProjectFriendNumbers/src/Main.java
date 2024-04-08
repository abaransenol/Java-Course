public class Main {
    public static void main(String[] args) {
        int num1 = 17296;
        int total1 = 0;

        int num2 = 18416;
        int total2 = 0;

        for (int i = 1; i<=num1;i++) {
            if (num1 % i == 0){
                total1 += i;
            }
        }

        for (int i = 1; i<=num2;i++) {
            if (num2 % i == 0){
                total2 += i;
            }
        }

        if (total1 == total2) {
            System.out.println(num1 + " ve " + num2 + " sayıları arkadaş sayılardır.");
        }
        else{
            System.out.println(num1 + " ve " + num2 + " sayıları arkadaş sayılar değillerdir.");
        }
    }
}