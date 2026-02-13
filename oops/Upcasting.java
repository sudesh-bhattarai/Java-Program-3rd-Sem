class Animal2 {
    void Sound() {
        System.out.println("Animal makes sound");
    }
}
class Dog2 extends Animal2 {
    void bark() {
        System.out.println("Dog barks");
    }
}
public class Upcasting {
    public static void main(String[] args) {
        Dog2 dog = new Dog2();
        Animal2 animal = dog;
        animal.Sound();
       // animal.bark();  // This line would cause a compile-time error. we cannot call bark() method using animal reference.
    }
}
