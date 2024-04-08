import java.sql.*;
import java.util.ArrayList;

public class MySqlDatabaseManager implements IDatabaseManager{

    private String userName;
    private String password;
    private String dbUrl;

    public MySqlDatabaseManager(String userName,String password,String dbUrl){
        this.userName = userName;
        this.password = password;
        this.dbUrl = dbUrl;
    }

    @Override
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dbUrl,userName,password);
    }

    public void showErrorMessage(SQLException exception){
        System.out.println("Error: "+exception.getMessage());
        System.out.println("Error code: "+exception.getErrorCode());
    }

    @Override
    public ArrayList<Country> selectData(Connection connection) throws SQLException {
        ArrayList<Country> countries = new ArrayList<Country>();
        Statement statement = null;
        ResultSet resultSet;

        statement = connection.createStatement();
        resultSet = statement.executeQuery("select Code,Name,Continent,Region from country");
        while (resultSet.next()){
            Country country = new Country();
            country.setName(resultSet.getString("Name"));
            country.setCode(resultSet.getString("Code"));
            country.setRegion(resultSet.getString("Region"));
            country.setContinent(resultSet.getString("Continent"));
            countries.add(country);
        }

        return countries;
    }

    public void insertData(Connection connection) throws SQLException{
        String sql = "insert into city (Name,CountryCode,District,Population) values(?,?,?,?);";
        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setString(1,"Osmaniye 2");
        statement.setString(2,"TUR");
        statement.setString(3,"Osmaniye");
        statement.setInt(4,364231);

        statement.executeUpdate();
        System.out.println("Şehir, tabloya eklendi.");
        statement.close();

    }

    public void updateData(Connection connection) throws SQLException{
        String sql = "update city set population = 542423, district='Osmaniye' where id=4082;";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.executeUpdate();
        statement.close();

        System.out.println("Şehir güncellendi.");
    }
    public void deleteData(Connection connection) throws SQLException{
        String sql = "delete from city where id=4083;";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.executeUpdate();
        statement.close();

        System.out.println("Şehir silindi.");
    }



}
