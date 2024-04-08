public class CustomerManager {

    BaseDatabaseLogger _databaseLogger;

    public CustomerManager(BaseDatabaseLogger databaseLogger){
        _databaseLogger = databaseLogger;
    }

    public void logCustomer(){
        _databaseLogger.log();
    }
}
