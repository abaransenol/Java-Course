public class MySqlDatabaseLogger extends BaseDatabaseLogger{
    @Override
    public void log() {
        System.out.println("Logged to MySql!");
    }
}
