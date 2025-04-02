package lecture_4;

import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class FileLogExample {
    final static Logger logger = Logger.getLogger("MyLogger");
    public static void main(String[] args) {
        try {

            FileHandler fileHandler = new FileHandler("myLogFile.log", true);
            fileHandler.setFormatter(new SimpleFormatter());

            logger.addHandler(fileHandler);
            throw new RuntimeException();
//            logger.info("Logging to a file.");
        } catch (Exception e) {
            logger.warning("Logging" + e.getMessage());


        }
    }
}
