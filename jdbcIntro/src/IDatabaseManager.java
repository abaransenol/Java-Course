import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public interface IDatabaseManager {
    Connection getConnection() throws SQLException;
    void showErrorMessage(SQLException exception);

    ArrayList<Country> selectData(Connection connection) throws SQLException;
    void insertData(Connection connection) throws SQLException;
    void updateData(Connection connection) throws SQLException;
    void deleteData(Connection connection) throws SQLException;
}
