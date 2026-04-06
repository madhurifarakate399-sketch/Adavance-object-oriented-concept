
class OddNumberException extends Exception {
    public OddNumberException(String message) {
        super(message);
    }

public class OddNumberTest {


    static void checkNumber(int num) throws OddNumberException {
        if (num % 2 != 0) {
            throw new OddNumberException("Number is odd! Exception thrown.");
        } else {
            System.out.println("Number is even: " + num);
        }
    }

    public static void main(String[] args) {
        int number = 5;  

        try {
            checkNumber(number);
        } catch (OddNumberException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
}
