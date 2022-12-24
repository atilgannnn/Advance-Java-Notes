package AdvJavaPractice.MultiThreads;

public class ThreadCreation3 {

    public static void main(String[] args) {

        //Task4: anonymous class kullanarak thread oluşturunuz.
        //lambda expression kullanarak thread oluşturunuz.

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
               Thread.currentThread().setName("Tweety");
                String name = Thread.currentThread().getName();
                for (int i = 1; i <= 100 ; i++) {

                    System.out.println(name+ " : kaçıyorum...");

                }

            }
        });

        Thread thread2 = new Thread(()-> {

            Thread.currentThread().setName("Sylvester");
            String name = Thread.currentThread().getName();
            for (int i = 1; i <= 100 ; i++) {

                System.out.println(name+ " : yakalayacağım...");

            }

        });

        thread1.start();
        thread2.start();


    }


}
