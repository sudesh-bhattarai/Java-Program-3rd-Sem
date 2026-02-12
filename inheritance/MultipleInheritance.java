//Java does not support multiple inheritance with classes to avoid complexity and ambiguity. so we use Interfaces to achieve it.
interface A1 {
    void methodA1();
}
interface B1 {
    void methodB1();
}
class C1 implements A1, B1 {
    public void methodA1(){
        System.out.println("Method A from Interface A");
    }
    public void methodB1(){
        System.out.println("Method B from Interface B");
    }
}
public class MultipleInheritance {
    public static void main(String [] args){
        C1 obj = new C1();
        obj.methodA1();
        obj.methodB1();
    }
}
