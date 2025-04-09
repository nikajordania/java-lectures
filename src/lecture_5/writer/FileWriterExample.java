package lecture_5.writer;

import java.io.FileWriter;
import java.io.IOException;

class FileWriterExample {
    public static void main(String[] args) {
        String filePath = "FileWriterExample.txt";

        try {
            FileWriter fileWriter = new FileWriter(filePath);

            String data = "written to a file.";
            fileWriter.write(data);
            fileWriter.close();

            System.out.println("Data has been written to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
