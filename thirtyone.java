class thirtyone {
    public MyClass() {
        System.out.println("Zero-argument constructor called!");
    }
    public void displayMessage() {
        System.out.println("This is a method in the MyClass.");
    }
}
public class thirtyone {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.displayMessage();
    }
}

