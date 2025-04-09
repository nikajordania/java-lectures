package lecture_5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class WriteFileExampleNIO {
    public static void main(String[] args) {
        String data = "Hello, world!";
        Path filePath = Paths.get("output.txt");

        try {
            Files.write(filePath, data.getBytes(), StandardOpenOption.APPEND, StandardOpenOption.WRITE);

            System.out.println("Data has been written to file: " + filePath);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
