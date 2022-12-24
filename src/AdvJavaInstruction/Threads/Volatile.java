package AdvJavaInstruction.Threads;

public class Volatile {

    /*

    Volatile keyword thread'lerin işlem sırasında "cach" e gitmesini engeller ve doğrudan "RAM" e yönlendirir.
    Aşağıdaki örnekte eğer volatile kullanmasaydık while loop hep thread1 de 0 verecekti ve infinite loop a girip
    Stack Overflow a sebep olacaktı!!!

    */

    volatile public static int flag = 0;

    public static void main(String[] args) {

        // Thread - 1
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {

                while (true){

                    if (flag == 0){

                        System.out.println("Thread 1 çalışıyor");

                    }else{

                        break;

                    }



                }


            }
        });

        thread1.start();

        // Thread - 2
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                flag=1;
                System.out.println("Flag değeri 1 olarak değiştirildi");


            }
        });

        thread2.start();

    }



}
