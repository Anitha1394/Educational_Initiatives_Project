package creational.singleton.src;



public class Logger {

    // Private static instance
    private static Logger instance;

    // Private constructor to prevent instantiation
    private Logger() {
    }

    // Public method to provide access to the instance
    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
            System.out.println("Logger instance created.");
        }
        return instance;
    }

    // Logging method
    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}
