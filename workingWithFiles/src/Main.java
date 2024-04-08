import java.io.File;

public class Main {
    public static void main(String[] args) {

        File file = new File("D:\\javademos\\files\\students.txt");
        FileManager fileManager = new FileManager(file);

        //fileManager.createFile();
        //fileManager.getFileInfo();
        fileManager.read();
        fileManager.write();
        fileManager.read();
    }
}