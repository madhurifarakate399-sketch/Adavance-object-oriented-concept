
class DivisionException extends Exception {
    public DivisionException(String message) {
        super(message);
    }
}


class Calculator {

    public int divide(int a, int b) throws DivisionException {
        if (b == 0) {
            throw new DivisionException("Error: Division by zero is not allowed.");
        }
        return a / b;
    }
}


public class ExceptionHandlingDemo {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        try {
            int result = calc.divide(10, 0);   
            System.out.println("Result: " + result);
        } 
        catch (DivisionException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}