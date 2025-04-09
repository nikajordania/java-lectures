package lecture_5.writer;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
    public static void main(String[] args) {
        String filePath = "largefile2.txt";

        try {
            FileWriter fileWriter = new FileWriter(filePath);

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter, 2048);

            String data = "This is a large sample text that will be written to a file with buffering.";

            bufferedWriter.write(data);
            bufferedWriter.close();

            System.out.println("Data has been written to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

