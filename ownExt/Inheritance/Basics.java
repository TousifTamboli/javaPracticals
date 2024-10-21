//inheritance: ek class ki properties jab koi dusri class lena chati hai

// jo class se property lete hai usse SUB CLASS, CHILD CLASS kehete hai
// jo class properties leta hai usse BASE CLASS, PARENT CLASS

//INHERITANCE 4 TYPES: 
// 1. SINGLE LEVEL
// 2. Multilevel inhertance

class Shape{
    String color;
}

class Triangle extends Shape{
    
} 

public class Basics {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "RED";
        
        System.out.println(t1.color);

        
        
    }
}