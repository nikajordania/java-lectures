package lecture_5.reader;

import java.io.IOException;
import java.io.StringReader;

class StringReaderExample {
    public static void main(String[] args) {
        String data = "This is a sample text that will be read from a string.";

        try {
            StringReader stringReader = new StringReader(data);

            int value;
            while ((value = stringReader.read()) != -1) {
                System.out.print((char) value);
            }

            stringReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
