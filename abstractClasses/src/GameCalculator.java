public abstract class GameCalculator {

    //ABSTRACT SINIFLAR

    /*
        Bu tür sınıfların yapısal olarak klasik sınıflardan hiçbir farkı yoktur. Yani yine referans tiplerdir. Ancak
        şöyle özellikleri vardır:

        -Abstract metotlar abstract sınıflar içerisinde tanımlanabilirler.

        -Bir sınır abstract metotların olduğu abstract sınıfı inherit ediyorsa bu abstract metotu override etmek zorundadır.
        Aksi takdirde kod hata verecektir.

        -Abstract bir sınıf new'lenerek kullanılamaz. Kullanılsa bile içerisindeki abstract metot new'lendiği blokta
        tanımlanmalıdır. Fakat şöyle bir kullanım mümkündür:
            ---> GameCalculator gameCalculator = new KidGameCalculator();
            Yani abstract sınıfın türünde bir nesne tanımlanırken new'lendiği bölüme bu abstract sınıfı inherit eden bir
            sınıf kullanılabilir.

        Bu özellikleri haricinde normal sınıf gibi kullanılabilirler. Örneğin abstract olmayan metotlar da içerebilirler.
    */
    public abstract void calculate();
}
