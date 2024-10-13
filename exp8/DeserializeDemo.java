import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeDemo {
    public static void main(String[] args) {
        String filePath = "person.ser";
        
        try {
            // Create FileInputStream and ObjectInputStream to read the object from a file
            FileInputStream fileIn = new FileInputStream(filePath);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            
            // Deserialize the object
            Person person = (Person) in.readObject();
            System.out.println("Object deserialized from file: " + person);
            
            // Close the streams
            in.close();
            fileIn.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
