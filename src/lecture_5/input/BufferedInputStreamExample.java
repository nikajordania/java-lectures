package lecture_5.input;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamExample {
    public static void main(String[] args) {
        String filePath = "largefile.txt";
        long startTime = System.currentTimeMillis();
        System.out.println(startTime);
        try {
            FileInputStream fileInputStream = new FileInputStream(filePath);

            // Wrapper
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

            int data;
            while ((data = fileInputStream.read()) != -1) {
                System.out.print((char) data);
            }

            bufferedInputStream.close();
            System.out.println(System.currentTimeMillis() - startTime);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

