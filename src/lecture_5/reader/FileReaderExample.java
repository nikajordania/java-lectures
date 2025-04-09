package lecture_5.reader;

import java.io.FileReader;
import java.io.IOException;

class FileReaderExample {
    public static void main(String[] args) {
        String filePath = "largefile.txt";

        try {
            FileReader fileReader = new FileReader(filePath);

            int data;
            while ((data = fileReader.read()) != -1) {
                System.out.print((char) data);
            }

            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
