//multilevel inheritance -  A class inherits from another 
// class, which inherits from another class, and so on.

class Shape{
    public void area(){
        System.out.println("Enter With L and H");
    }
}

class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println(0.5*l*h);
    }
}

class EquilateralTriangle extends Triangle{
    public void area(int l, int h){
        System.out.println(0.5*l*h);
    }
}

public class Multilevel {
    public static void main(String[] args){
        EquilateralTriangle t1 = new EquilateralTriangle();
        t1.area();
        t1.area(10, 20);
    }
}