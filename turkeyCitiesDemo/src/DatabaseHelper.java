import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseHelper {

    private String username;
    private String password;
    private String dbUrl;

    public DatabaseHelper(String username, String password, String dbUrl) {
        this.username = username;
        this.password = password;
        this.dbUrl = dbUrl;
    }


    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dbUrl, username, password);
    }

    public void showExceptions(SQLException exception) throws SQLException {
        System.out.println("Error: " + exception.getMessage());
        System.out.println("Error code: " + exception.getErrorCode() + "\n\n");

        exception.printStackTrace();
    }

    public static String returnUpdateQuery(String parameter){
        switch (parameter){
            case "Population":
                return "update cities set Population = ? where id = ?";
            case "Altitude":
                return "update cities set Altitude = ? where id = ?";
            case "Name":
                return "update cities set Name = ? where id = ?";
            default:
                return "";
        }
    }

}
