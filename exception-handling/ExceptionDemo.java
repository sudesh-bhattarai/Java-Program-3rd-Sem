public class ExceptionDemo {

    public void divide(int a, int b) {
        try {
            int res = a / b;
            System.out.println("Result: " + res);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurred: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Other Exception occurred");
        } finally {
            System.out.println("Finally block");
        }
    }

    public void divideA(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        int res = a / b;
        System.out.println("Result: " + res);
    }

    public void divideB(int a, int b) throws Exception {
        if (b == 0) {
            throw new Exception("Division by zero not allowed");
        }
        int res = a / b;
        System.out.println("Result: " + res);
    }

    public static void main(String[] args) {
        ExceptionDemo obj = new ExceptionDemo();

        obj.divide(2, 2);
        obj.divide(2, 0);

        try {
            obj.divideA(2, 0);
        } catch (ArithmeticException e) {
            System.out.println("Handled divideA exception");
        }

        try {
            obj.divideB(2, 3);
        } catch (Exception e) {
            System.out.println("Handled divideB exception");
        }
    }
}
