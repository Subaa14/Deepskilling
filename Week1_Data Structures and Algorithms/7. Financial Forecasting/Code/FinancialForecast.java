public class FinancialForecast {
    
    //Recursive method to calculate future value
    public static double calculateFutureValue(double currentValue, double growthRate, int years){
        if(years==0){
            return currentValue;
        }
        return calculateFutureValue(currentValue*(1+growthRate), growthRate, years-1);
    }
    public static void main(String[] args) {
        double currentValue=1000.0;
        double growthRate=0.05; //5% annual growth
        int years=5;

        double futureValue=calculateFutureValue(currentValue, growthRate, years);
        System.out.println("Future Value after "+years+" years: "+futureValue);;
    }
}
