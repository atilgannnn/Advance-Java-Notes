package AdvJavaInstruction.Threads;

public class ThreadCreationWays {

    public static void main(String[] args) {

        //İlk çalışan thread "main thread"dir, kontrol edelim :
        System.out.println("Current Thread : " +Thread.currentThread().getName());//Current Thread : main

        MyThread thread1 = new MyThread();
        //thread1.run();
        thread1.start();// Thread sınıfında run() methodunda yazılanlar işlenmeye başlar
        //run() diyerek çağırdığımızda method yine çalışıyor. start() ile çağırmamız ile
        //run() ile çağırmamız arasındaki fark şu: run() ile çağırıldığında thread değişmez,sadece method çalışır.
        //start() da ise önce thread ayağa kalkar(oluşur) daha sonra içindeki run() methodu çalışır.

        //Runnable Interface türü olduğu için önce interface obje yaptık. Ardından class objesi yapıp içine interface objesini koyup run() methodunu kullanabildik.
        MyRunnable runnable = new MyRunnable();
        Thread thread2 = new Thread(runnable);
        thread2.start();

        //!! İsimsiz olarak thread oluşturma,anonymous (İsimsiz Interface)
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);// 5 saniye uyu
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Current Thread : " + Thread.currentThread().getName());
                System.out.println("Bu isimsiz sınıf yoluyla oluşturulan iş parçacığıdır");
            }
        });

        thread3.setName("Thread3");//Thread 3 e isim verdik
        thread3.start();

        //!!! isimsiz olarak thread oluşturalım (2. YOL)
        Thread thread4 = new Thread(() -> {

            System.out.println("Lambda ile yazıldı");

        });

        thread4.start();

        System.out.println("Main methodu bitti");//bu yazının çıktının neresinde gözükeceği ile ilgili kesin bir şey diyemeyiz
        Thread thread5 = new Thread(()->{

            System.out.println("Thread5 çalıştı");

        });

        thread5.start();

    }





}

//1. YOL : Thread class'ini extend ederek
class MyThread extends Thread{

    @Override
    public void run() {
        System.out.println("MyThread threadi çalışıyor");
    }
}

//2. YOL : Runnable Interface'i implement ederek
class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("Runnable Interface'den türetilen thread çalıştı");
    }
}
