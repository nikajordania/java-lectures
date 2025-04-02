package lecture_3.staticMethod;

import lecture_3.exceptions.FactorialException;

public class MethodCall {

    public static Integer gf3() throws FactorialException {
        System.out.println("get factorial of 3");
        return Factorial.getFactorial(3);
    }
}
