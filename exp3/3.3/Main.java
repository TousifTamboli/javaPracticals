// Main class to test inheritance and method overriding
public class Main {
    public static void main(String[] args) {
        // Creating objects of subclasses
        Dog dog = new Dog();
        Cat cat = new Cat();

        // Calling overridden methods
        dog.sound();  // Output: Dog barks
        cat.sound();  // Output: Cat meows
    }
}