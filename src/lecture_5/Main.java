package lecture_5;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;

class Main {
    public static void main(String[] args) throws URISyntaxException {
        System.out.println("Hello world!");


        File dir1 = new File("C://MyDir");


        File f1 = new File("C://MyDir/asdasda.txt");
        if (!dir1.exists()) {
            dir1.mkdir();
        }


        File file1 = new File("C://MyDir", "Hello.txt");
        File file2 = new File(dir1, "Hello2.txt");
        File file = new File(new URI("file:///C:/MyDir/myfile.txt"));
//        Uniform Resource Identifier (URI).
//        This can be useful when working with URIs, especially for web resources.
    }
}
