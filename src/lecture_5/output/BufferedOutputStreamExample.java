package lecture_5.output;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamExample {
    public static void main(String[] args) {
        String filePath = "largefile1.txt";

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(filePath);

            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

            String data = "This is a large sample text that will be written to a file.";

            byte[] bytes = data.getBytes();
            bufferedOutputStream.write(bytes);

            bufferedOutputStream.close();

            System.out.println("Data has been written to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

