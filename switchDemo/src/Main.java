public class Main {
    public static void main(String[] args) {

        //"ctrl + shift + alt + L" kombinasyonu ile bir dosyayı formatlayabilirsin. (Karışmış bir kodun şeklini düzeltme.)

        char grade = 'E';
        switch (grade) {
            case 'A':
                System.out.println("Mükemmel : Geçtiniz!");
                break;
            case 'B':
            case 'C':
                System.out.println("İyi : Geçtiniz!");
                break;
            case 'D':
                System.out.println("Fena değil : Geçtiniz!");
                break;
            case 'F':
                System.out.println("Maalesef : Kaldınız.");
                break;
            default:
                System.out.println("Geçersiz bir not girdiniz.");
                break;
        }
    }
}