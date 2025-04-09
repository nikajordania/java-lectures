package lecture_5.input;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

class ImageDownloader {
    public static void main(String[] args) {
        String imageUrl = "https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_1280.jpg";
        String savePath = "downloaded_image.jpg";
        try {
            URL url = new URL(imageUrl);
            URLConnection connection = url.openConnection();

            try (InputStream in = connection.getInputStream();
                 FileOutputStream out = new FileOutputStream(savePath)) {

                byte[] buffer = new byte[1024];
                int bytesRead;

                while ((bytesRead = in.read(buffer)) != -1) {
                    out.write(buffer, 0, bytesRead);
                }

                System.out.println("Image downloaded successfully.");
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Image download failed: " + e.getMessage());
        }
    }
}
