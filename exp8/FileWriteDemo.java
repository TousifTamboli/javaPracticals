import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo {
    public static void main(String[] args) {
        String filePath = "output.txt";
        String content = "This is a sample text written to a file.";
        
        try {
            // Create FileWriter object to write to the file
            FileWriter writer = new FileWriter(filePath);
            
            // Write the content to the file
            writer.write(content);
            System.out.println("Content written to file successfully.");
            
            // Close the FileWriter to save the changes
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
