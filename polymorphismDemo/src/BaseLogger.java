public class BaseLogger {
    public void log(String message){
        System.out.println("Default log: "+ message);
    }

    public final void generalLog(){
        /*
            final keyword'ü: Bu keyword ile beraber yazdığımız metotları kalıtım yaptığımız sınıfta override edemeyiz.
            Fonksiyon tanımlandığı gibi kalır.

        */
    }
}
