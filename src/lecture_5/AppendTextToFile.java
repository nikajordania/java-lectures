package lecture_5;

import java.io.FileWriter;
import java.io.IOException;

public class AppendTextToFile {
    public static void main(String[] args) {
        String fileName = "t1.txt";
        String textToAppend = "This is the text you want to append.";

        try {
            FileWriter writer = new FileWriter(fileName, true);
            writer.append(textToAppend).append(System.lineSeparator());
            writer.close();
            System.out.println("Text appended successfully.");
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}