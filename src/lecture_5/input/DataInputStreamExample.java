package lecture_5.input;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

class DataInputStreamExample {
    public static void main(String[] args) {
        String filePath = "data.dat";

        try {
            FileInputStream fileInputStream = new FileInputStream(filePath);
            //Wrapper
            DataInputStream dataInputStream = new DataInputStream(fileInputStream);

            int intValue = dataInputStream.readInt();
            double doubleValue = dataInputStream.readDouble();
            boolean booleanValue = dataInputStream.readBoolean();

            // Close the DataInputStream
            dataInputStream.close();

            System.out.println("Read Integer: " + intValue);
            System.out.println("Read Double: " + doubleValue);
            System.out.println("Read Boolean: " + booleanValue);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
