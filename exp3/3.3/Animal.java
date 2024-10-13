// Animal.java

// Base class (superclass)
class Animal {
    // Method to be overridden
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Derived class (subclass) Dog inherits from Animal
class Dog extends Animal {
    // Overriding the sound method in the subclass
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

// Derived class (subclass) Cat inherits from Animal
class Cat extends Animal {
    // Overriding the sound method in the subclass
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}
