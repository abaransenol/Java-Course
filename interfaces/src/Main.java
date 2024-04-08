public class Main {
    public static void main(String[] args) {

//        ICustomerDal customerDal = new MySqlCustomerDal();
//        customerDal.add();

        /*
            INTERFACE'LER
            Bu yapılar sınıflar gibi referans tutucu olmalarına rağmen birer sınıf değillerdir. İçerisine yazılan
            metotlar tıpkı abstract metotlar gibidir. New'lenebilirler ama içerisindeki metotları her new için tanımlamak
            gerekir. Kalıtılamazlar ama implemente edilebilirler. Bu ikisinin farkı ise katılımda tek bir sınıf
            kalıtılabilirken implementasyon işleminde birden fazla interface implemente edilebir. Aynı sınıf aynı anda
            hem bir sınıftan inherit edilebilir hem de istediği kadar interface bu sınıfa implemente edilebilir.


        */

        CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
        customerManager.add();
    }
}