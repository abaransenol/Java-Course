import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        /*
            CHECKED EXCEPTION: Hata çıkabileceği için try-catch blokları içerisine alınarak veya THROWS ile belirtilerek
        hatanın çıkacağı gösterilmek zorunda olunan exceptionlardır. RuntimeException haricindeki tüm exception türleri
        checked exception'dır.
        */

        BufferedReader reader = null;
        int total = 0;
        String line = null;

        try {
            reader = new BufferedReader(new FileReader("D:\\javademos\\readingFileDemo\\src\\numbers.txt"));
            while ((line = reader.readLine()) != null){     //readLine() metotu satırın boş olup olmadığı hakkında bir veri döndürür.
                total += Integer.valueOf(line);     //Integer.valueOf() metotu bir veriyi mümkünse integer'a çevirmeye yarar.
            }

            System.out.println(total);

        } catch (FileNotFoundException exception) {
            throw new RuntimeException(exception);
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        } catch (NumberFormatException exception){
            System.out.println("\""+line+"\" verisi sayıya dönüştürülemez.");
        }

        finally {
            try {
                reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}