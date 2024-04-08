public class Main {
    public static void main(String[] args) {
        //FOR
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("For döngüsü bitti.");

        //WHILE
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        System.out.println("While döngüsü bitti.");

        //DO-WHILE
        int j = 100;
        do {
            System.out.println(j);
            j++;
        } while (j < 10);
        System.out.println("Do-While döngüsü bitti.");
    }
}