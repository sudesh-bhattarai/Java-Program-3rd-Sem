abstract class Animal4 {
    String name;
    Animal4(String name) {
        this.name = name;
    }
    abstract void sound();
    void sleep() {
        System.out.println(name + " is sleeping");
    }
}
interface Pet {
    void play();
}
class Dog extends Animal4  implements Pet {
    Dog(String name) {
        super(name);
    }
    void sound() {
        System.out.println(name + "Says Woof");
    }
    public void play() {
        System.out.println(name + " Loves to play fetch");
    }
}
public class AbstractTest {
    public static void main(String[] args) {
        Dog d = new Dog("Buddy");
        d.sound();
        d.sleep();
        d.play();
    }
}
