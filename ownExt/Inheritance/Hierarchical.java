//hierarchical inheritance - ek base class bohot sare sub class

class Shape{
    public void area(){
        System.out.println("Displaying area");
    }
}

class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println("Area of Triangle is " +0.5*l*h);
    }
}

class Circle extends Shape{
    public void area(int r){
        System.out.println("Area of Circle is " +3.14*r*r);
    }
}

public class Hierarchical {
    public static void main(String[] args){
        Triangle t1 = new Triangle();
        t1.area(10, 5);

        Circle c1 = new Circle();
        c1.area(5);

    }
    
}
