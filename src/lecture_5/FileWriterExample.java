package lecture_5;

import java.io.FileWriter;
import java.io.IOException;

class FileWriterExample {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("output.txt");
            String data = "This is the data to be written to the file.";

            writer.append(data).append(System.lineSeparator());
            writer.append("Hello");

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
