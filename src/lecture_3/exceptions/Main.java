package lecture_3.exceptions;

public class Main {
    public static void main(String[] args) {
        int result;
        try {
            result = 10 / 0;
        } catch (ArithmeticException e) {
            result = 0;
            System.err.println("An arithmetic exception occurred: " + e.getMessage());
        }


        System.out.println("finish");
    }
}
