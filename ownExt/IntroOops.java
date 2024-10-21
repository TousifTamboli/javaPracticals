class Student {
    int id;
    String name;
    
    //Method
    public void printInfo(){
        System.out.println(this.id);
        System.out.println(this.name);
    }
    
    //Constructor //parametirized
    Student(int id, String name){
        this.id = id;
        this.name = name;
    }
}

//main class
public class IntroOops{
    public static void main(String[] args){
        Student s1 = new Student(1, "Raj");
        
        s1.printInfo();
    }
}