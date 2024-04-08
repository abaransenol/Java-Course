
import java.util.ArrayList;
import java.sql.*;

public class DatabaseManager {
    
    public ArrayList<City> selectData(){
        ArrayList<City> cities = new ArrayList<City>();
        DbHelper dbHelper = new DbHelper();
        Statement statement = null;
        Connection connection = null;
        ResultSet resultSet;
        
        try{
            connection = dbHelper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from cities");
            City city;
            
            while(resultSet.next()){
                city = new City(
                    resultSet.getString("Name"),
                resultSet.getInt("Population"),
                 resultSet.getInt("Altitude")
                );
                
                city.setId(resultSet.getInt("ID"));
                cities.add(city);
            }
            
        } catch(SQLException exception){
            dbHelper.showErrorMessage(exception);
        } finally {
            try {
                statement.close();
                connection.close();
            } catch (SQLException exception) {
                dbHelper.showErrorMessage(exception);
            }
        }
        
        return cities;
    }
    
    public void insertData(City city){
        DbHelper dbHelper = new DbHelper();
        PreparedStatement statement = null;
        Connection connection = null;
        
        try{
            connection = dbHelper.getConnection();
            statement = connection.prepareStatement("insert into cities (Name,Altitude,Population) values(?,?,?)");
            
            statement.setString(1, city.getName());
            statement.setInt(2, city.getAltitude());
            statement.setInt(3, city.getPopulation());

            statement.executeUpdate();
            
        } catch(SQLException exception){
            dbHelper.showErrorMessage(exception);
        } finally {
            try {
                statement.close();
                connection.close();
            } catch (SQLException exception) {
                dbHelper.showErrorMessage(exception);
            }
        }
    }
    
    
}
