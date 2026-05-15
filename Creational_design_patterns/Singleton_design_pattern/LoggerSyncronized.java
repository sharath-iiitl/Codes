package Singleton_design_pattern;

public class LoggerSyncronized {
    private static volatile LoggerSyncronized instance; // volatile keyword ensures visibility across threads
    private LoggerSyncronized() {} // Private constructor to prevent instantiation

    public static LoggerSyncronized getInstance() {
        if (instance == null) { // First check (no synchronization needed here)
            synchronized (LoggerSyncronized.class) { // Synchronize only when creating the instance
                if (instance == null) { // Second check (inside synchronized block)
                    instance = new LoggerSyncronized(); // Create the instance if it's still null
                }
            }
        }
        return instance; // Return the single instance
    }

    public void log(String message) {
        System.out.println("Log: " + message);
    }
}