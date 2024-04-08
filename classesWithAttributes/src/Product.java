public class Product {

    public Product(int id, String name,String description,double price,int stockAmount){
        /*
           CONSTRUCTOR: Yapıcı blok anlamına gelir. Nesnenin adı ile aynı isimli bir metot olarak tanımlanır. Nesne main
           bloğunda tanımlandığı anda otomatik olarak çalışır.
       */

        _id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockAmount = stockAmount;
    }

    public Product(){
        //OVERLOADING: Aşırı yükleme anlamına gelir. Aynı metot ismiyle iki farklı metot tanımladığımız durumu ifade eder.
    }


    //ATTRIBUTE veya FIELD

//    int id;
//    String name;
//    String description;
//    double price;
//    int stockAmount;

    /*
        PUBLIC VE PRIVATE NEDİR? ÖZELLİKLERİ NELERDİR?

        Yukarıda tanımladığımız tüm attribute'lar java dilinde otomatik olarak PUBLIC erişim türüne sahiptir. Public bir
        attribute her yerden erişilebilirdir. Yani bu dosyada tanımladığımız public bir attribute, Main.java veya
        ProductManager.java dosyalarında geçerlidir.

        Fakat örneğin C# dilinde bu attribute'lar otomatik olarak PRIVATE erişim türündedir. Private türü ise sadece ama
        sadece tanımlandığı blok içerisinde geçerlidir.

        --> private double kdvAmount;

        Örneğin buradaki kdvAmount değişkeni sadece tanımlandığı blok olan Product bloğunda geçerlidir ve diğer
        dosyalardan bu değişkene erişim sağlanamaz.

        --> if(...) {
        ...
        --> private int number1;
        ...
        }

        Burada ise sadece tanımlandığı blok olan if bloğu içerisinde geçerlidir. Yani daha dışarıdaki herhangi bir blok
        tarafından da erişim sağlanamaz.
    */


    //this: içerisinde bulunduğum class anlamına gelir.
    //ENCAPSULATION: Kapsülleme demektir.


    /*
        Kodumuzdaki fieldların her zaman dışarıdan tamamen erişilebilir olmasını istemeyiz. Ayrıca kodları yazarken her
        zaman sürdürülebilir yazılıma uygun kod yazmak ve esnek bir biçim kullanmak isteriz. Bunun için "encapsulation"
        yöntemini kullanırız. Buna göre yazdığımız attributeları public değil private olarak tanımlarız. Fakat bu
        şekilde o kodlara erişmemiz mümkün değildir. Bu yüzden onlara erişmek için GETTER ve SETTER türü metotlar
        tanımlarız. "getter" metotu READONLY'dir yani sadece okunabilirdir. "setter" metotu ise WRITEONLY'dir yani
        sadece yazılabilirdir. Biz genel olarak ikisini de beraber tanımlarız. Fakat field'ın sadece okunur ya da sadece
        yazılır olmasını istediğimiz zamanlarda ona göre getter ve setter'larımızı tanımlarız.

        Kapsüllemede iki türlü kod yazma yöntemi vardır:

        1- IntelliJ IDEA'nın da kullandığı yöntem

        --> private int id;

        --> public int getId(){
        -->     return this.id;
        --> }

        --> public void setId(int id){
        -->     this.id = id;
        --> }

        Bu yöntemde id isimli iki değişken vardır. Bunların birbirine karışmaması için yukarıda private olarak
        tanımlanan id değişkeninin önüne  "this" anahtar kelimesi eklenir. this, içinde bulunduğumuz class'ı temsil eder.



        2- Best Practise

        --> private int _id;

        --> public int getId(){
        -->     return _id;
        --> }

        --> public void setId(int id){
        -->     _id = id;
        --> }

        Burada ise yine bu değişkenlerin karışmaması için field olan değişkenin başına "_" eklendiğini görüyoruz. Bu sayede
        kodun okunabilirliği daha çok artmakta ve kod yazarken değişkenleri karıştırma olasılığımız düşmektedir.

    */

    private int _id;
    public int getId(){    //GETTER
        return _id;
    }

    public void setId(int id){  //SETTER
        _id = id;
    }

    private String name;
    private String description;
    private double price;
    private int stockAmount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    private String kod;
    public String getKod(){
        return this.name.substring(0,1) + _id;
    }
}
