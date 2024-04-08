public class MsSqlDatabaseLogger extends BaseDatabaseLogger{
    @Override
    public void log() {
        System.out.println("Logged to MsSql!");
    }
}
