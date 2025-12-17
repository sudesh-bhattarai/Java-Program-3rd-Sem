class Animal{
    void eat(){
        System.out.println("Animal eats food");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog barks");
    }
}
class Cat extends Dog{
    void meow(){
        System.out.println("Cat meows");
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.meow();
        c.bark();
        c.eat();
    }
    
}
