// Generic class
class Box<T> {
    private T data;

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}

public class GenericDemo {
    public static void main(String[] args) {
        // Using the generic class with Integer type
        Box<Integer> integerBox = new Box<>();
        integerBox.setData(100);
        System.out.println("Integer Value: " + integerBox.getData());

        // Using the generic class with String type
        Box<String> stringBox = new Box<>();
        stringBox.setData("Hello Generics");
        System.out.println("String Value: " + stringBox.getData());
    }
}
