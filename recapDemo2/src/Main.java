public class Main {
    public static void main(String[] args) {
        double[] myList = {0.8, 1.9, 1.3, 1.5};
        double sum = 0;
        double greatest = myList[0];

        for (double number : myList) {
            if (number > greatest) {
                greatest = number;
            }
            sum += number;
            System.out.println(number);
        }

        System.out.println("---------------");
        System.out.println(sum);
        System.out.println(greatest);
    }
}