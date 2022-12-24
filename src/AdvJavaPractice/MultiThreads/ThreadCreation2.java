package AdvJavaPractice.MultiThreads;

public class ThreadCreation2 {

    public static void main(String[] args) {

        //Task2:Runnable interfaceni implement eden Counter isminde sınıf oluşturup
        //bu sınıftan harfleri a dan z ye kadar yazdıran iki tane thread oluşturunuz.

        //Task3: Threadler başlamadan önce Yarış başlasın ve bitince Yarış bitti yazdırın.

        System.out.println("Yarış başlasın...");

        Counter c1 = new Counter("RoadRunner");
        Counter c2 = new Counter("SpeedyGonzales");

        Thread thread1 = new Thread(c1);
        Thread thread2 = new Thread(c2);
        thread1.start();
        thread2.start();
/*

//thread1 ve thread2 bitene kadar main methodu uyutmak istedik ama bu kesin çözüm değil.
//Bu yüzden join() methodu kullanacağız ve try-catch ile çevreleyeceğiz.

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

*/
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Yarış bitti...");


    }

}
