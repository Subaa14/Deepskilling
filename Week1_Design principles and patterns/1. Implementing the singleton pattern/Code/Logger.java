public class Logger {
    //Create a private static instance of same class
    private static Logger instance;

    //Make the constructor private
    private Logger(){
        System.out.println("Logger Initialized");
    }

    //Provide a public static method to get the instance
    public static Logger getInstance(){
        if(instance==null){
            instance=new Logger();
        }
        return instance;
    }

    //A simple log method
    public void log(String message){
        System.out.println("Log: "+message);
    }
}
