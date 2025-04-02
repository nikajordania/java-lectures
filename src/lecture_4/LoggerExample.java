package lecture_4;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class LoggerExample {
    private static final Logger logger1 = Logger.getLogger("com.example.MyClass");
    //    private static final Logger logger1 = Logger.getLogger("com.example.MyClass");
    private static final Logger logger2 = Logger.getLogger("com.example.MyClass");

    public static void main(String[] args) {
        System.out.println(logger1 == logger2);
    }
}


class LoggerExample2 {
    public static void main(String[] args) {
        Logger mainLogger = Logger.getLogger("com.example.MainApp");
        Logger componentLogger = Logger.getLogger("com.example.components.ComponentA");
        componentLogger.setLevel(Level.OFF);
        mainLogger.info("This is a log message from the main application.");
        mainLogger.info("This is a log message from the main application.");
        componentLogger.warning("This is a log message from ComponentA.");
    }
}

//        In this example, two loggers are created with different names,
//        allowing you to categorize and configure logging
//        for the main application and a specific component separately.
//        This can be helpful in larger applications where you need
//        to control and filter log messages at different levels.


class LoggerLevelExample {
    private static final Logger logger1 = Logger.getLogger("com.pack");
    private static final Logger logger = Logger.getLogger(LoggerLevelExample.class.getName());

    public static void main(String[] args) {
        logger.setLevel(Level.INFO);

        logger.severe("This is a severe message.");
        logger.warning("This is a warning message.");
        logger.info("This is an info message.");
        logger.config("This is a config message.");
        logger.fine("This is a fine message.");
    }
}


class LoggingConfigExample {
    public static void main(String[] args) {
        try {
            LogManager.getLogManager().readConfiguration(new FileInputStream(System.getProperty("user.dir") + "/logging.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Use loggers and log messages as usual
        Logger logger = Logger.getLogger("com.example.MyClass");
        logger.info("This log message uses the configured properties.");
    }
}

class ThrowsExceptions {
    public void readFile(String filePath) throws IOException {
        // Method code that may throw an IOException
    }
}
