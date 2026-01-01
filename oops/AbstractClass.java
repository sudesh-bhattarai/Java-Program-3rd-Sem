abstract class Shape {
    abstract void draw();
    void display() {
        System.out.println("Displaying the shape");
    }
}
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
        s.display();
    }
}
