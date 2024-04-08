public class Main {
    public static void main(String[] args) {
        char[] thickVowels = {'a', 'ı', 'o', 'u'};
        char[] thinVowels = {'e', 'i', 'ö', 'ü'};
        char letter = 'ü';
        
        for (char i : thickVowels) {
            if (letter == i) {
                System.out.println(letter + " ünlüsü bir kalın ünlüdür");
                return;
            }
        }

        for (char i : thinVowels) {
            if (letter == i) {
                System.out.println(letter + " ünlüsü bir ince ünlüdür");
                return;
            }
        }

        System.out.println(letter + " bir ünlü harf değildir.");

        //Engin hocanın çözümü

        /*switch (letter) {
            case 'a':
            case 'ı':
            case 'o':
            case 'u':
                System.out.println(letter + " ünlüsü bir kalın ünlüdür");
                return;

            case 'e':
            case 'i':
            case 'ö':
            case 'ü':
                System.out.println(letter + " ünlüsü bir ince ünlüdür");
                break;

            default:
                System.out.println(letter + " bir ünlü harf değildir.");
        }*/


    }
}