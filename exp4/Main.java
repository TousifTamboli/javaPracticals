import animals.Animal;
import animals.Dog;
import animals.Cat;
import actions.AnimalActions;
import actions.DogActions;

public class Main {
    public static void main(String[] args) {
        // Using polymorphism and dynamic method dispatch
        Animal myDog = new Dog();
        myDog.sound(); // Calls Dog's sound() method

        Animal myCat = new Cat();
        myCat.sound(); // Calls Cat's sound() method

        // Using interfaces
        AnimalActions dogActions = new DogActions();
        dogActions.eat();
        dogActions.move();
    }
}
