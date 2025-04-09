package lecture_5;

import java.io.FileReader;
import java.io.IOException;

class FileReaderExample {
    public static void main(String[] args) {
        try {
//            Path p = Path.of("input.txt");
//            List<String> strings = Files.readAllLines(p);
//
//            for (String s : strings) {
//                System.out.println(s);
//            }

            FileReader reader = new FileReader("input.txt");

            int data;
            while ((data = reader.read()) != -1) {
//                System.out.println(data);
                char character = (char) data;
                System.out.print(character);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
