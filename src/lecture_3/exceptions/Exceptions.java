package lecture_3.exceptions;

public class Exceptions {

    public static void main(String[] args) {
        String s = "textWithNumber123";
        Integer[] numbers = new Integer[3];


//        try {
//            numbers[0] = 45;
//            numbers[0] = Integer.parseInt(s);
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.err.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
//        } catch (NumberFormatException e) {
//            numbers[0] = Integer.parseInt((s).replaceAll("[\\D]", ""));
//            System.err.println("NumberFormatException: " + e.getMessage());
//        } catch (Exception e) {
//            numbers[0] = 0;
//            System.err.println("General Exception: " + e.getMessage());
//        }
//        // Rest of the program
//        System.out.println("Program continues...");


//        FileOutputStream fileOutputStream = null;
//        try {
//            fileOutputStream = new FileOutputStream("example.txt");
//            // Write data to the file
//        } catch (IOException e) {
//            // Handle file-related exception
//        } finally {
//            // Ensure the file stream is closed, even if an exception occurs
//            if (fileOutputStream != null) {
//                try {
//                    fileOutputStream.close();
//                } catch (IOException e) {
//                    // Handle any exceptions that occur during the close operation
//                }
//            }
//        }
//
        try {
            int age = -5;
            if (age < 0) {
                throw new IllegalArgumentException("Age cannot be negative");
            }
        } catch (IllegalArgumentException e) {
            System.err.println("Exception caught: " + e.getMessage());
        }
    }
}