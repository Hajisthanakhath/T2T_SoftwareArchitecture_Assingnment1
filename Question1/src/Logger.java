
// This class implements the Singleton Pattern using the Bill Pugh Inner Static Class method.

import java.text.SimpleDateFormat;
import java.util.Date;

// Public Logger class so other classes (like SingletonDemo) can use it
public class Logger {

    // The constructor is private so no one else can create the Logger object.
    private Logger()  {
        System.out.println("Logger initialized...");   // Shown only once → proves Singleton
    }
    // This message will appear only ONCE,
    // proving that only one Logger object is created.

    // This is a special inner class. It will hold our one and only Logger object.
    // The beauty is: this inner class loads only when someone calls getInstance().
    private static class LoggerHolder {
        private static final Logger INSTANCE = new Logger();  // The one and only Logger object
    }

    // Public method to return the Singleton instance
    // First call triggers loading of LoggerHolder → creates the Logger instance
    public static Logger getInstance() {
        return LoggerHolder.INSTANCE;   // Always returns the same instance
    }

    // This method prints a message along with the current date and time.
    public void log(String message) {

        // Prepare a timestamp in a readable format.
        String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
                .format(new Date());

        // Print the final log output
        System.out.println("[" + timeStamp + "] " + message);
    }
}

