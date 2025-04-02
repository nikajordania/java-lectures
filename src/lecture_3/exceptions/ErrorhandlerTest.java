package lecture_3.exceptions;

public class ErrorhandlerTest {
    public static void main(String[] args) {
        String s = "textWithNumber";
        Integer[] numbers = new Integer[3];
        try {
            numbers[0] = 45;
            numbers[3] = Integer.parseInt(s);
//            throw new ArithmeticException();

        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("ArrayIndexOutOfBoundsException: " + e.getMessage());

        } catch (NumberFormatException e) {
            numbers[0] = getResult(s);
            System.err.println("NumberFormatException: " + e.getMessage());

        } catch (Exception e) {
            numbers[0] = 0;
            System.err.println("General Exception: " + e.getMessage());
        }
        // Rest of the program
        System.out.println("Program continues...");
    }

    public static Integer getResult(String s) {
        Integer result = 0;
        try {
            result = Integer.parseInt((s).replaceAll("[\\D]", ""));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;

    }
}
