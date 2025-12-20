class Parent {
    void display() {
        System.out.println("Parent class display method");
    }
}
class Child extends Parent{
    void display() {
        System.out.println("Child class display method");
    }
}
public class Overriding {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.display();
    }
    
}
