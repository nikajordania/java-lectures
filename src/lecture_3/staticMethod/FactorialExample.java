package lecture_3.staticMethod;

import lecture_3.exceptions.FactorialException;

public class FactorialExample {
    public static void main(String[] args) {

        try {
            MethodCall.gf3(); // This method is called without any instance of the class
        } catch (FactorialException e) {
            throw new RuntimeException(e);
        }

    }
}
