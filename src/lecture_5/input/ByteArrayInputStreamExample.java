package lecture_5.input;

import java.io.ByteArrayInputStream;

class ByteArrayInputStreamExample {
    public static void main(String[] args) {
        byte[] data = {72, 101, 108, 108, 111, 32, 87, 111, 114, 108, 100};

        ByteArrayInputStream inputStream = new ByteArrayInputStream(data);

        int value;
        while ((value = inputStream.read()) != -1) {
            System.out.print((char) value);
        }
    }
}
