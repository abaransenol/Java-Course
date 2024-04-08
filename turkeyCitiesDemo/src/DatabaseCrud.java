import java.sql.*;
import java.util.ArrayList;

public class DatabaseCrud {

    public ArrayList<City> selectData(Connection connection) throws SQLException {
        ArrayList<City> cities = new ArrayList<City>();
        Statement statement = null;
        ResultSet resultSet;

        statement = connection.createStatement();
        resultSet = statement.executeQuery("select * from cities");

        while (resultSet.next()) {
            City city = new City();

            city.setId(resultSet.getInt("ID"));
            city.setName(resultSet.getString("Name"));
            city.setAltitude(resultSet.getInt("Altitude"));
            city.setPopulation(resultSet.getInt("Population"));

            cities.add(city);
        }

        return cities;

    }

    public void insertData(Connection connection, City city) throws SQLException {
        String sql = "insert into cities (Name,Altitude,Population) values(?,?,?)";
        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setString(1, city.getName());
        statement.setInt(2, city.getAltitude());
        statement.setInt(3, city.getPopulation());

        statement.executeUpdate();
        statement.close();

        System.out.println("City "+city.getName() +", added to table which named cities!");
    }

    public void updateData(Connection connection, int id, String parameter, Object newValue) throws SQLException {
        String sql = DatabaseHelper.returnUpdateQuery(parameter);
        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setObject(1, newValue);
        statement.setInt(2, id);

        statement.executeUpdate();
        statement.close();

        System.out.println("City updated!");
    }

    public void deleteData(Connection connection, int id) throws SQLException {
        String sql = "delete from cities where id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setInt(1, id);

        statement.executeUpdate();
        statement.close();

        System.out.println("City deleted!");
    }
}
