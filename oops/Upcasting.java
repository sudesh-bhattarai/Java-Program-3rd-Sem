class Animal {
    void Sound() {
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}
public class Upcasting {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Animal animal = dog;
        animal.Sound();
       // animal.bark();  // This line would cause a compile-time error. we cannot call bark() method using animal reference.
    }
}
