class Animal3 {
    void Sound() {
        System.out.println("Animal makes sound");
    }
}
class Dog3 extends Animal3 {
    void bark() {
        System.out.println("Dog barks");
    }
}
public class Downcasting {
    public static void main(String[] args) {
        Animal3 animal = new Dog3(); // Upcasting
        Dog3 dog = (Dog3) animal; // Downcasting
        dog.Sound();
        dog.bark();
    }}
