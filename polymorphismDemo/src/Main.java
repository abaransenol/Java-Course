public class Main {
    public static void main(String[] args) {

        BaseLogger[] baseLoggers = new BaseLogger[]{new DatabaseLogger(),new FileLogger(),new EmailLogger()};
        for (BaseLogger baseLogger:baseLoggers){
            baseLogger.log("Logging message");
        }

        /*
            POLYMORPHISM: Çok biçimlilik anlamına gelir.

            Yukarıdaki örnekteki gibi elimizdeki bir işlem için birden fazla alternatif olduğu durumlarda bu alternatifleri
            daha kolay yönetebilmek için bir üst sınıf tanımlar ve alternatif türlere bu üst sınıftan kalıtım yaptırırız.
            Kod üzerinde çalışmalarımızı yaparken de bu üst sınıfı kullanarak yaparız. Alternatiflerin kodlarının
            kendilerine özel bölümler içermesi durumunda gerekli metotları kendi kod bloklarında override ederek uyumluluk
            sorununu çözeriz. Bu yönteme "polimorfizm" denir. Sürdürülebilir yazılım açısından oldukça yararlı bir kullanımdır.

        */

        EmailLogger logger = new EmailLogger();
        CustomerManager customerManager = new CustomerManager(logger);

        customerManager.add();
    }
}