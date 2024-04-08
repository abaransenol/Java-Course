import java.io.*;
import java.util.Scanner;

public class FileManager {
    private File file;

    public FileManager(File file) {
        this.file = file;
    }

    public void createFile() {
        try {
            if (file.createNewFile()) {
                System.out.println("Dosya oluşturuldu.");
            } else {
                System.out.println("Dosya zaten mevcut.");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void getFileInfo() {
        if (file.exists()) {
            String isReadable;
            String isWritable;

            if (file.canRead()) {
                isReadable = "Evet";
            } else {
                isReadable = "Hayır";
            }

            if (file.canWrite()) {
                isWritable = "Evet";
            } else {
                isWritable = "Hayır";
            }

            System.out.println("Dosya adı: " + file.getName());
            System.out.println("Dosya yolu: " + file.getAbsolutePath());
            System.out.println("Dosya boyutu (byte): " + file.length());
            System.out.println("Dosya okunabilir mi: " + isReadable);
            System.out.println("Dosya yazılabilir mi: " + isWritable);
        } else {
            System.out.println("Dosya mevcut değil.");
        }
    }

    public void read(){
        try {
            System.out.println("Dosyanın içerisindekiler: \n");

            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()){
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Okunacak bir dosya bulunamadı.");
        }
    }

    public void write(){
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file.getAbsolutePath(),true));

            bufferedWriter.newLine();
            bufferedWriter.write("myNigga aBBas");

            System.out.println("Dosyaya yazıldı.");
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
