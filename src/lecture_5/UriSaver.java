package lecture_5;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Logger;


public class UriSaver {
    final static Logger logger = Logger.getLogger(UriSaver.class.getName());

    public static void main(String[] args) {
        try {
            // Step 1: Convert URI to File
            URI uri = new URI("https://static.vecteezy.com/system/resources/thumbnails/025/220/125/small_2x/picture-a-captivating-scene-of-a-tranquil-lake-at-sunset-ai-generative-photo.jpg");

            // Open connection to the URI
            URL url = uri.toURL();
            URLConnection connection = url.openConnection();

            // Get the input stream
            InputStream inputStream = connection.getInputStream();

            // Define the local file to save to
            File file = new File("local_file_name.jpg");

            // Create FileOutputStream to save the file locally
            FileOutputStream outputStream = new FileOutputStream(file);

            // Buffer to read data in chunks
            byte[] buffer = new byte[2048];
            int bytesRead;

            // Read from the input stream and write to the output stream
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                System.out.println("hello");
                outputStream.write(buffer, 0, bytesRead);
            }

            // Close streams
            inputStream.close();
            outputStream.close();

            System.out.println("File saved successfully as: " + file.getAbsolutePath());


        } catch (URISyntaxException e) {
            e.printStackTrace();
            logger.warning(e.getMessage());
            logger.warning("Something went wrong when trying to save the file");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
