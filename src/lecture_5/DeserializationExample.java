package lecture_5;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

class DeserializationExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("user.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        User user = (User) ois.readObject();

        System.out.println(user.getUserName().equals("user123"));
        System.out.println(user.getPassword().equals("123"));
    }
}
