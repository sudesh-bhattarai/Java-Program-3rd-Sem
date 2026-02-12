class Animal1{
    void eat(){
        System.out.println("Animal eats food");
    }
}
class Dog1 extends Animal1{
    void bark(){
    System.out.println("Dog barks");
}
}
public class SingleInheritance {
    public static void main(String[] args) {
    Dog1 d = new Dog1();
    d.bark();
    d.eat();
}
}
