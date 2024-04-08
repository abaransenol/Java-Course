public class Main {
    public static void main(String[] args) {
        /*
            THROW ifadesi:
            Bir kodda hata çıkabileceği zaman direk if-else bloklarının içerisinde sorunu çözmeye çalışmak fazlasıyla statik
            bir yöntemdir. Bu yüzden çıkabilecek hataları engellemek adına kendi hatalarımızı tanımlamamız ve bunları main
            bloğumuzda try-catch yardımıyla ayıklamamız çok daha iyi olacaktır.

        */

        AccountManager manager = new AccountManager();
        System.out.println("Miktar: " + manager.getBalance());

        manager.deposit(100);
        System.out.println("Miktar: " + manager.getBalance());

        try {
            manager.withdraw(90);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        System.out.println("Miktar: " + manager.getBalance());

        try {
            manager.withdraw(20);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        System.out.println("Miktar: " + manager.getBalance());
    }
}