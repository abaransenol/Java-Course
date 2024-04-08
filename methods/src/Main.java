public class Main {
    public static void main(String[] args) {
        numberFinding();
    }

    public static void numberFinding() {
        int[] numbers = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 7;
        boolean isThere = false;

        for (int number : numbers) {
            if (number == aranacak) {
                isThere = true;
                break;
            }
        }

        giveMessage(isThere);

    }

    public static void giveMessage(boolean isThereHere){
        if (isThereHere) {
            System.out.println("Evet,var.");
        } else {
            System.out.println("Hayır,yok.");
        }
    }
}