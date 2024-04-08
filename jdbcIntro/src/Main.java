import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws SQLException {
//        İlk sql script dosyam:
//
//        --> select * from country;
//        /*veritabanındaki country tablosunda bulunan tüm dataları getirir.*/
//
//        --> select Code,Name,Continent from country;
//        /*veritabanındaki country tablosunda bulunan dataların kodunu,ismini ve kıtasını getirir.*/
//
//        --> select * from country where continent = 'Asia';
//        /*country tablosudaki datalardan kıtası asya olanları getirir.*/
//
//        --> select * from country where continent = 'Asia' and region = 'Middle East';
//        /*country tablosudaki datalardan kıtası asya ve bölgesi ortadoğu olanları getirir.*/
//
//        /*Crud operasyonları: select,insert,update,delete */
//
//        --> insert into city (Name,CountryCode,District,Population) values('Osmaniye','TUR','Osmaniye',149698);
//        /*city tablosuna yeni bir satır açar ve sırasıyla isim, ülke kodu, eyalet, nüfus şeklinde bir veri eklemesi yapar
//        Dosyayı çalıştırmadan önce fareyle hangi kod bloğunu seçersek o çalışır*/
//
//        --> set sql_safe_updates = 0;
//        --> update city set Population = 336274 where Name = 'Düzce';
//        /*Şehir tablosundan adı düzce olan verinin nüfus bilgisini 336274 yap anlamına gelir. MySql olası hatalara karşı
//        bir koruma olarak 1175 kodlu hatayı gönderebilir. Buna karşılık eğer işlemimizden eminsek "set sql_safe_updates = 0;"
//        komutunu da ek olarak yazarak kodumuzu çalıştırabiliriz.*/
//
//        --> delete from city where id=4081;
//        /*şehir tablosundan id'si 4081 olan veriyi tamamen siler.*/

        String userName = "root";
        String password = "12345";
        String dbUrl = "jdbc:mysql://localhost:3306/world?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";


        IDatabaseManager databaseManager = new MySqlDatabaseManager(userName,password,dbUrl);
        Connection connection = null;

        try {
            connection = databaseManager.getConnection();
//            ArrayList<Country> countries = databaseManager.selectData(connection);
//            for (Country country:countries){
//                String info = "Ülke adı: "+country.getName() + "\nÜlke kodu: " +country.getCode()+ "\nÜlkenin bulunduğu kıta: "+ country.getContinent() + "\nÜlkenin bulunduğu bölge: " + country.getRegion();
//                System.out.println(info);
//                System.out.println("---------------------------");
//            }
//
//            System.out.println("Listelenen toplam ülke sayısı: " + countries.size());

            databaseManager.updateData(connection);


        } catch (SQLException exception) {
            databaseManager.showErrorMessage(exception);
            throw new SQLException(exception);
        } finally {
            connection.close();
        }

    }
}