import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {
    public static void main(String[] args) {
        String filePath = "person.ser";
        
        // Create a Person object
        Person person = new Person("John Doe", 30);
        
        try {
            // Create FileOutputStream and ObjectOutputStream to write the object to a file
            FileOutputStream fileOut = new FileOutputStream(filePath);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            
            // Serialize the object
            out.writeObject(person);
            System.out.println("Object serialized and written to file: " + filePath);
            
            // Close the streams
            out.close();
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
