package lecture_5;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;


public class UriExample {
    public static void main(String[] args) throws URISyntaxException {
        // Create a URI for a file
        URI uri = new URI("file:///C:/MyDir/myfile.txt");

        // Create a File object from the URI
        File fileUri = new File(uri);

        // getFileURI
        System.out.println("File URI: " + fileUri.toURI());

    }
}

