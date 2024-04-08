public class Main {
    public static void main(String[] args) {
        add();
        delete();
        update();

        int total = topla(8, 9);
        System.out.println(total);

        int total2 = topla2(234, 432, 423, 4, 234, 23, 42, 34, 23, 4);
        System.out.println(total2);
    }

    public static void add() {
        System.out.println("Eklendi.");
    }

    public static void delete() {
        System.out.println("Silindi.");
    }

    public static void update() {
        System.out.println("Güncellendi.");
    }

    public static int topla(int num1, int num2) {
        return num1 + num2;
    }

    public static int topla2(int... numbers) {
        //int... ifadesine VARIABLE ARGUMENTS denir. Buradaki "numbers" parametresi sanki bir int[] imiş gibi çalışıyor.
        //Pek tercih edilen bir ifade değildir çünkü kodun test edilebilirliğini zayıflatır.

        int total = 0;
        for (int num : numbers) {
            total += num;
        }

        return total;

    }
}