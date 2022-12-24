package AdvJavaInstruction.Threads;


//Thread'ler aynı kaynağa erişmek isterlerse ne olacak?
public class MultiThreading02 {

    public static int counter = 0;
    public static void main(String[] args) {

    //!!! Ayrı 2 tane thread oluşturup aynı kaynağa erişmesini sağlayalım

    Thread thread1 = new Thread(new Runnable() {
        @Override
        public void run() {

            Counter.count();
            System.out.println("Thread1 çalıştı");


        }
    });

    thread1.start();

           // thread1.join();


        //2.thread oluşturuyoruz

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {

                Counter.count();
                System.out.println("Thread2 çalıştı");



            }
        });
        thread2.start();

    }
}

class Counter {

    public synchronized static void count(){ //synchonized ile bu methoda giren threadleri sıraya koymuş olduk.
                                             //method içine aynı anda sadece 1 thread girebilecek.

        for (int i = 1; i <= 1000 ; i++) {

            MultiThreading02.counter++; //1000

        }

        System.out.println("Counter : " +MultiThreading02.counter); // 1000

    }


}
