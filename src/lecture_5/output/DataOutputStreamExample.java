package lecture_5.output;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class DataOutputStreamExample {
    public static void main(String[] args) {
        String filePath = "data.dat";

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(filePath);
            DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);

            int intValue = 42;
            double doubleValue = 3.14159;
            boolean booleanValue = true;

            dataOutputStream.writeInt(intValue);
            dataOutputStream.writeDouble(doubleValue);
            dataOutputStream.writeBoolean(booleanValue);
            dataOutputStream.close();

            System.out.println("Data has been written to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
