package Polymorphism;

//polymorphism: ek hi kaam ko baar baar agal type se karna
//ek hi function ko alag alag kaam se karna

//types : 
// 1 : function overloading - compiletime 
// 2 : function overriding  - runtime


// this is 1 : function overloading - compiletime 
class Student {
    String name;
    int age; // Added age as a field

    // Overloaded Methods
    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }

    public void printInfo(String name, int age) {
        System.out.println(name + " is " + age + " years old.");
    }
}

public class IntroPoly {
    public static void main(String[] args) {
        // Create Student object
        Student s1 = new Student();
        s1.name = "Raj";
        s1.age = 19;
        
        // Call overloaded methods
        s1.printInfo(s1.name);         
        s1.printInfo(s1.age);          
        s1.printInfo(s1.name, s1.age);  
    }
}
