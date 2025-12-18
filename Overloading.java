class Calculate{
    void add(int a, int b){
        System.out.println("Sum of two number : " +(a+b));
    }
    void add(int a, int b, int c){
        System.out.println("Sum of three numbers :" +(a+b+c)); 
    }
}
class Overloading{
    public static void main(String [] args){
        Calculate obj = new Calculate();
        obj.add(10,20);
        obj.add(10,20,30);
    }
}