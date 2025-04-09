package lecture_5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyFileExample {
    public static void main(String[] args) {
        Path sourcePath = Paths.get("t1.txt");
        Path targetPath = Paths.get("target.txt");

        try {
            Files.copy(sourcePath, targetPath);

            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while copying the file.");
            e.printStackTrace();
        }
    }
}
