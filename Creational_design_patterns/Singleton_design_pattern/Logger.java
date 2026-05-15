package Singleton_design_pattern;

public class Logger{
    private static Logger logger=null;

    private Logger(){}

    public static Logger getLogger(){
        if(logger==null){
            return new Logger();
        }
        return logger;
    }
    public void printMessage(String s){
        System.out.print(s);
    }
}