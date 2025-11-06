
// This class demonstrates the Singleton behavior of the Logger class.

public class SingletonDemo {

    // main() method → entry point of the program
    public static void main(String[] args) {

        // Get the Logger instance for the first time
        Logger logger1 = Logger.getInstance();

        // Get the Logger instance again
        // Should return the SAME instance as logger1
        Logger logger2 = Logger.getInstance();

        // Log some messages using both references
        logger1.log("Application started.");
        logger2.log("User logged in.");

        // Compare the two references to prove they refer to the same object
        if (logger1 == logger2) {
            System.out.println("Both logger1 and logger2 refer to the SAME instance.");
        } else {
            System.out.println("Different instances exist.");
        }
    }
}

