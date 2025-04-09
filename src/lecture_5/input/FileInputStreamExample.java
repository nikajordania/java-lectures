package lecture_5.input;

import java.io.FileInputStream;
import java.io.IOException;

class FileInputStreamExample {
    public static void main(String[] args) {
        String filePath = "filename.txt";

        try {
            FileInputStream inputStream = new FileInputStream(filePath);

            int data;
            while ((data = inputStream.read()) != -1) {
                System.out.print((char) data);
            }

            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
