public class StopwatchThread implements Runnable{

    private Thread thread;
    private String threadName;

    public StopwatchThread(String threadName){
        this.threadName = threadName;
    }

    @Override
    public void run() {
        System.out.println("Çalıştırılıyor: "+ threadName);

        try {
            for (int i=0; i<=10 ; i++){
                System.out.println(threadName + " : "+ i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException exception){
            System.out.println("Bir kesinti ile karşılaşıldı: "+ exception.getMessage());
        }

        System.out.println("Thread bitti: "+ threadName);
    }

    public void start(){
        System.out.println("Thread başlatılıyor: " + threadName);
        if (thread == null){
            thread = new Thread(this,threadName);
        }
        thread.start();
    }
}
