public class Main {
    public static void main(String[] args) {
        /*
            THREADING yapısı
            Thread, kelime anlamıyla iplik demektir. Programlamada metotlar birbiri ardına gelirler. Örneğin ilk metot 5
            saniye sürer, sonra onun işi biter ve diğer metota geçilir, o da 3 saniye sürer ve onun da işi biter ve diğer
            metota geçilir... Bu böyle devam eder. Bu yapıya "single thread" yapısı denir. Metotlar birbirine bağlıysa
            yani önceki çalışmadan kendisi çalışamıyorsa programlamada bu yapı tercih edilir.

            Bazı uygulamalarda ise metotlar birbirinden bağımsız olarak ayrık işler yaparlar. Bu tür uygulamalarda tek
            bir çizgidense işlemcinin çekirdek sayısına bağlı olarak birden çok yol çizgisi oluşturulur ve hepsi beraber
            yürütülür. Bu tür bir yapıya ise "multi thread" yapısı denir. Birden çok yol oluşturarak programın hızını
            artırır.


        */

        StopwatchThread thread1 = new StopwatchThread("thread1");
        StopwatchThread thread2 = new StopwatchThread("thread2");
        StopwatchThread thread3 = new StopwatchThread("thread3");
        StopwatchThread thread4 = new StopwatchThread("thread4");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

    }
}