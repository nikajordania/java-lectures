package lecture_5.output;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

class ByteArrayOutputStreamExample {
    public static void main(String[] args) {
        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

            String data = "This is a text that will be written to a byte array.";

            byte[] bytes = data.getBytes();
            outputStream.write(bytes);
            byte[] byteArray = outputStream.toByteArray();
            outputStream.close();

            System.out.println(new String(byteArray));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
