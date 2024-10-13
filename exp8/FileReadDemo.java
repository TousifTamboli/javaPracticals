import java.io.FileReader;
import java.io.IOException;

public class FileReadDemo {
    public static void main(String[] args) {
        String filePath = "output.txt";
        
        try {
            // Create FileReader object to read from the file
            FileReader reader = new FileReader(filePath);
            
            // Reading the content character by character
            int character;
            System.out.println("Reading file content:");
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            
            // Close the FileReader
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
