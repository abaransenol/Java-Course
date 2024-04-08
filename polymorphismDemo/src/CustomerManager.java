public class CustomerManager {
    private BaseLogger _baseLogger;
    public CustomerManager(BaseLogger baseLogger){
        _baseLogger = baseLogger;

    }

    public void add(){
        System.out.println("Customer added!");
        _baseLogger.log("Log message");
    }
}
