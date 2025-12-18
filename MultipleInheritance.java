//Java does not support multiple inheritance with classes to avoid complexity and ambiguity. so we use Interfaces to achieve it.

interface A {
    void methodA();
}
interface B {
    void methodB();
}
class C implements A, B {
    public void methodA(){
        System.out.println("Method A from Interface A");
    }
    public void methodB(){
        System.out.println("Method B from Interface B");
    }
}
public class MultipleInheritance {
    public static void main(String [] args){
        C obj = new C();
        obj.methodA();
        obj.methodB();
    }
}
