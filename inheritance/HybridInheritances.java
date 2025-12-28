//Java donot support Hybrid Inheritances directly through classes. But we can achieve it using Interfaces.

interface A {
    void showA();
}
interface B {
    void showB();
}
class C implements A , B{
    public void showA(){
        System.out.println("Show A");
    }
    public void showB(){
        System.out.println("Show B");
    }
}
public class HybridInheritances {
    public static void main(String [] args){
        C obj = new C();
        obj.showA();
        obj.showB();
    }
    
}
