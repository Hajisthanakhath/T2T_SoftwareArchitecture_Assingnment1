
// This class implements the Singleton Pattern using the Bill Pugh Inner Static Class method.

import java.text.SimpleDateFormat;
import java.util.Date;

// Public Logger class so other classes (like SingletonDemo) can use it
public class Logger {

    // Private constructor prevents creation of Logger objects from outside this class
    private Logger() {
        System.out.println("Logger initialized...");   // Shown only once → proves Singleton
    }

    // Static inner class that holds the SINGLE instance of Logger
    // It is loaded into memory only when getInstance() is called → lazy initialization
    private static class LoggerHolder {
        private static final Logger INSTANCE = new Logger();  // The one and only Logger object
    }

    // Public method to return the Singleton instance
    // First call triggers loading of LoggerHolder → creates the Logger instance
    public static Logger getInstance() {
        return LoggerHolder.INSTANCE;   // Always returns the same instance
    }

    // Method that prints a message with a timestamp
    public void log(String message) {


        String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
                .format(new Date());

        // Print the final log output
        System.out.println("[" + timeStamp + "] " + message);
    }
}

