package lecture_5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class SerializationExample {

    public static void main(String[] args) throws IOException {
        User user = new User();
        user.setUserName("user123");
        user.setPassword("123");

        FileOutputStream fos = new FileOutputStream("user.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(user);
    }
}
