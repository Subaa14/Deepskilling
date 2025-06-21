public class Main {
    public static void main(String[] args) {
        //Get the logger instance
        Logger logger1=Logger.getInstance();
        logger1.log("This is the first log message");

        //Getting the logger instance again
        Logger logger2=Logger.getInstance();
        logger2.log("This is the second log message");

        //Check if both the instance are same
        if(logger1==logger2){
            System.out.println("Both logger1 and logger2 refer to the same instance (Singleton confirmed)");
        }
        else{
            System.out.println("Different instance of logger exist (Singleton failed)");
        }
    }
}
