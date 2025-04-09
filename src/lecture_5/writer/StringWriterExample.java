package lecture_5.writer;

import java.io.IOException;
import java.io.StringWriter;

class StringWriterExample {
    public static void main(String[] args) {
        try {
            StringWriter stringWriter = new StringWriter();

            String data = "This is a sample text that will be written to a string.";

            stringWriter.write(data);

            String result = stringWriter.toString();
            stringWriter.close();

            System.out.println("Data has been written to the string:");
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
