//inheritance: ek class ki properties jab koi dusri class lena chati hai

// jo class property lete hai usse SUB CLASS, CHILD CLASS kehete hai
// jo class properties deta hai usse BASE CLASS, PARENT CLASS

//INHERITANCE 4 TYPES: 
// 1. SINGLE LEVEL -  A class inherits from a single parent class. This is the simplest type of inheritance.
// 2. Multilevel inhertance -  A class inherits from another class, which inherits from another class, and so on.
// 3. Hierarchical inheritance - Child classes inherit from a single base class.

//BASE CLASS, parent class
class Shape{
    String color;
}

//SUB CLASS, child class
class Triangle extends Shape{
    
} 

public class Basics {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "RED";
        
        System.out.println(t1.color);

        
        
    }
}