package lecture_5;

import java.io.File;

public class WorkWithDirectory {
    public static void main(String[] args) {
        String directory = System.getProperty("user.dir");

        System.out.println(directory);

        String currentDirectory = System.getProperty("user.dir");
        String fileName = "newFile.txt";
        String filePath = currentDirectory + File.separator + fileName;
        File file = new File(filePath);
        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());
    }
}
