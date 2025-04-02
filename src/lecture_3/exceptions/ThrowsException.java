package lecture_3.exceptions;

public class ThrowsException {

    public static void main(String[] args) {
        try {
            printSomeData(15);
            printSomeData(-15);


        } catch (IllegalArgumentException e) {
            System.err.println("IllegalArgumentException: " + e.getMessage());
        } catch (NullPointerException e) {
            System.err.println("NullPointerException: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.err.println("ArithmeticException: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }

        System.out.println("End of program");
    }


    public static void printSomeData(Integer age) throws IllegalArgumentException, NullPointerException, ArithmeticException {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        if (age == null) {
            throw new NullPointerException("Age cannot be null");
        }

        if (age == 0) {
            throw new ArithmeticException("Age cannot be zero");
        }
        System.out.println("age is: " + age);
    }
}