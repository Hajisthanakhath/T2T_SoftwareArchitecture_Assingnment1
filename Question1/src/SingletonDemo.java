
// This class demonstrates the Singleton behavior of the Logger class.

public class SingletonDemo {


    public static void main(String[] args) {

        // First request for the Logger object.
        Logger logger1 = Logger.getInstance();

        // Second request for the Logger object.
        // Should return the SAME object as logger1.
        Logger logger2 = Logger.getInstance();

        // Log some messages using both references
        logger1.log("Application started.");
        logger2.log("User logged in.");

        // Check whether both references point to the same object in memory.
        if (logger1 == logger2) {
            System.out.println("Both logger1 and logger2 refer to the SAME instance.");
        } else {
            System.out.println("Different instances exist.");
        }
    }
}

