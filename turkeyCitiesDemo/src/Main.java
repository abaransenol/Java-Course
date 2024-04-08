import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws SQLException {
        String dbUrl = "jdbc:mysql://localhost:3306/turkey?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String username = "root";
        String password = "12345";

        DatabaseHelper databaseHelper = new DatabaseHelper(username, password, dbUrl);
        DatabaseCrud databaseCrud = new DatabaseCrud();
        Connection connection = null;

        City city = new City();
        city.setName("Bursa");
        city.setPopulation(2645795);
        city.setAltitude(12);

        try {
            connection = databaseHelper.getConnection();
            ArrayList<City> cities = databaseCrud.selectData(connection);
            for (City iCity : cities) {
                System.out.println("-------------------------------------");
                System.out.println("Şehir id'si: " + iCity.getId());
                System.out.println("Şehir adı: " + iCity.getName());
                System.out.println("Şehir nüfusu: " + iCity.getPopulation());
                System.out.println("Şehir rakımı: " + iCity.getAltitude());
            }

            //databaseCrud.insertData(connection,city);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            connection.close();
        }
    }
}
