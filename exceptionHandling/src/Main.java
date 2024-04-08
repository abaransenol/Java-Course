import java.awt.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        /*
            EXCEPTION ve ERROR
            Exceptionlar bizim try-catch bloklarıyla tespit edip kontrol altına alabildiğimiz hatalar iken error'lar
            java'nın sanal makinesi gibi bizim kontrol edemediğimiz hatalardır.


        */
        try {
            int[] numbers = new int[]{1, 2, 3};
            System.out.println(numbers[3]);
        } catch (StringIndexOutOfBoundsException exception) {
            System.out.println("Bir hata ile karşılaştık:");
            System.out.println(exception);
        } catch (Exception exception) {
            System.out.println("Bilinmeyen bir hata ile karşılaşıldı:");
            System.out.println(exception);
        } finally {
            System.out.println("e");
        }

        //finally bloğu catch ile tespit edemediğimiz bir exception olduğunda dahi çalışır.


    }
}