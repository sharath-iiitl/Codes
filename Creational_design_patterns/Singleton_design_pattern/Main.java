package Singleton_design_pattern;

public class Main {
    public static void main(String[] args){
        Logger logger =  Logger.getLogger();
        logger.printMessage("Hi there!");
        LoggerSyncronized logger1 =  LoggerSyncronized.getInstance();
        logger1.log("Hi there!!");
    }
}
