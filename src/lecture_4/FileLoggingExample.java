package lecture_4;

import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

public class FileLoggingExample {
    public static void main(String[] args) {
        try {
            Logger logger = Logger.getLogger("MyLogger");
            FileHandler fileHandler = new FileHandler("myLogFile.log");
            fileHandler.setFormatter(new XMLFormatter());

            logger.addHandler(fileHandler);

            logger.info("Logging to a file.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

