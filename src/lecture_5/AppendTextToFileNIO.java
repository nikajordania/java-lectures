package lecture_5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class AppendTextToFileNIO {
//    com.exmple.myApp.Math math = new com.exmple.myApp.Math();

    public static void main(String[] args) {
        System.out.println(Math.name);
        System.out.println(java.lang.Math.PI);
        String fileName = "n2.txt";
        String textToAppend = "This is the text you want to append.";

        Path path = Paths.get(fileName);

        try {
            if (!Files.exists(path)) {
                Files.createFile(path);
            }
            Files.write(path, textToAppend.getBytes(),StandardOpenOption.CREATE, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING);
            Files.writeString(path, System.lineSeparator(), StandardOpenOption.APPEND);

            System.out.println("Text appended successfully.");
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}