package lecture_5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFileNIO {
    public static void main(String[] args) {
        Path filePath = Paths.get("filename.txt");

        try {
            Files.createFile(filePath);
            System.out.println("File created: " + filePath.getFileName());
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
