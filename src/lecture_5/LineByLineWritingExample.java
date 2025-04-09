package lecture_5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class LineByLineWritingExample {
    public static void main(String[] args) {
        String[] lines = {
                "This is the first line.",
                "Here's the second line.1111",
                "And here's the third line."
        };

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            for (String line : lines) {
                writer.append(line); // Write the line
                writer.newLine();   // Move to the next line
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
