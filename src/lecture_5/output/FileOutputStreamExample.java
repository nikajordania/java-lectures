package lecture_5.output;

import java.io.FileOutputStream;
import java.io.IOException;

class FileOutputStreamExample {
    public static void main(String[] args) {
        String filePath = "output.txt";

        try {
            FileOutputStream outputStream = new FileOutputStream(filePath);
            String data = "This is a sample text that will be written to a file.";

            byte[] bytes = data.getBytes();
            outputStream.write(bytes);

            outputStream.close();
            System.out.println("Data has been written to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
