public class Main {
    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager();
        customerManager.add();
        customerManager.remove();
        customerManager.update();

        /*

        ÇOK ÖNEMLİ KISIM:
        REFERANS TİPLER (ÖRNEĞİN class) NASIL ÇALIŞIR?

        Bellekte (RAM'de) iki adet bölüm vardır: STACK ve HEAP
        Örnek olarak bir nesne tanımlayalım:

        --> CustomerManager customerManager;

        Burada stack bölümünde customerManager ismine bir referans numarası verilir (Burada referans numaramız 101 olsun.).
        Stack bölümünde oluşan bu referans numarası tek başına hiçbir şey yapamaz. Tam olarak bir nesne değildir.
        Sadece tanımı vardır.

        --> customerManager = new CustomerManager();

        Burada ise NEW anahtar kelimesi kullanılarak belleğin heap bölümünde stack bölümünde verilen referans numarasına
        karşılık bir nesne oluşturulur (yani 101 referans numarasına karşılık gelen bir bölüm açılıyor.). Burası asıl nesne
        olarak tarif ettiğimiz kısımdır (customerManager nesnemizdeki add(), remove(), update(), gibi metotlarımızı
        çalıştıran.).

        Şimdi yeni bir örnek yapalım:

        --> CustomerManager customerManager1 = new CustomerManager();
        --> CustomerManager customerManager2 = new CustomerManager();

        Burada customerManager1 (referans numarası 101 olsun) ve customerManager2 (referans numarası 102 olsun) adlı iki
        nesne oluşturduk. İkisi de önce stack kısmında 101 ve 102 referans numaralarını aldılar sonrasında da heap bölümünde
        101 ve 102 referans numarasına karşılık gelen iki yer açıldı.

        --> customerManager1 = customerManager2();

        Bu kodun anlamı şudur: customerManager1'in referans numarasını customerManager2'nin referans numarasına eşitle.
        (Yani 101 numaralı referans kodu iptal edilir ve onun yerine customerManager1'in referans numarası 102 olur.)
        Böyle bir kod yazmamız sonucunda heap bölümündeki 101 referans numarasına karşılık gelen bölüme bağlanan hiçbir
        stack bölümü elemanı kalmamış olur ve 101 referans numarasına karşılık gelen nesne sadece boş yere bellekte yer
        işgal eder. Bu da optimizasyon açısından bir sorundur çünkü bir nesneyi new'lemek bellek adına pahalı bir işlemdir.
        Bir süre sonra Java'nın GARBAGE COLLECTOR'ı (çöp toplayıcısı) gelip bellekten bu 101 referans numarasına karşılık gelen
        yapıyı siler.

        Bu kodun optimize hali şöyle olmalıdır:

        --> CustomerManager customerManager1;
        --> CustomerManager customerManager2 = new CustomerManager();
        --> customerManager1 = customerManager2();

        Böylelikle işe yaramayan new ortadan kaldırılarak bellek gereksiz bir yükten kurtulmuş olur. Artıkher iki stack bölümü
        yapısı da 102 referans numaralıdır ve 102 numaralı heap bölümü nesnesine bağlanırlar.

        *!* Diziler (int[],String[] vs.) birer referans tiptir.
        ----------------------------------------------------------------------------------------------------------------------

        DEĞER TİPLER(ÖRNEĞİN int) NASIL ÇALIŞIR?

        ---> int number1 = 10;

        Burada stack bölümünde bir number1 değişkeni oluşturulur ve buna 10 değeri verilir.

        --> int number2 = 20;

        Burada da aynı şekilde stack bölümünde bir number2 değişkeni oluşturulur ve buna 20 değeri verilir.

        --> number2 = number1;
        --> number1 = 30;

        Bunun çalışma mantığı şöyledir: number2 değişkeninin "değeri" number1'in sahip olduğu değer yani 10 ile değiştirilmiştir.
        Bu değişim belleğin stack bölümünde yapılmış ve kalmıştır. Heap bölümüne hiç uğramaz dolayısıyla herhangi bir referans
        nesneye eşitlenmez. Bu yüzden buradan sonra number1 üzerindeki bir değişiklik number2 değişkenini etkilemez. Çünkü bunlar
        birbirinden bağımsızlardır. Son durumda number1=30 ve number2=10 değerine sahiptir.

        ------------------------------------------------------------------------------------------------------------------------

        --> int[] numbers1 = new int[] {1,2,3};
        --> int[] numbers2 = new int[] {4,5,6};
        --> numbers2 = numbers1;
        --> numbers1[0] = 10;

        Burada ise durum farklıdır. Çünkü buradaki numbers1 ve numbers2 dizileri birer referans tiptir. Biz burada numbers2
        dizisini numbers1 dizisine eşitlersek numbers2 dizisinin referans numarası değişir ve bellekteki heap bölümünde yer
        alan bölümü ile bağlantısı kesilir. Artık numbers1 ve numbers2 dizileri isimleri farklı fakat aynı nesneye karşılık
        gelen iki dizidir. Burada sadece numbers1 dizisinin 0. indisi değişiyor gibi gözükse de aynı anda numbers2 dizisinin
        de 0. indisi değişir. Çünkü onlar artık aynı dizidirler.

        */
    }
}