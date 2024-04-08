import maths.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //BUILD-IN: Javanın içerisinde olan paketlere denir.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz: ");
        String name = scanner.nextLine();

        System.out.println("Merhaba "+name);

        Operations operation = new Operations();
        Logarithms logarithm = new Logarithms();

        System.out.println(operation.sumThem(31,69));
        System.out.println(logarithm.takeLogarithm(420));


    }
}