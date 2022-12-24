package AdvJavaInstruction.Threads;

public class MultiThreading01 {

    public static void main(String[] args) throws InterruptedException {

        long startTime = System.currentTimeMillis();

        CounterWithoutMultiThread counter1 = new CounterWithoutMultiThread(1);
        CounterWithoutMultiThread counter2 = new CounterWithoutMultiThread(2);

        counter1.countMe();
        System.out.println("-----------------------------");
        counter2.countMe();

        long endTime = System.currentTimeMillis();

        System.out.println("WithoutMultiThread ile geçen süre : " + (endTime-startTime));

        System.out.println("******************************");

        long startTime2 = System.currentTimeMillis();
        CounterWithMultiThread counter3 = new CounterWithMultiThread(1);
        CounterWithMultiThread counter4 = new CounterWithMultiThread(2);
        counter3.start();
        System.out.println("------------");
        counter4.start();
        counter3.join(); // counter3 thread i bitesiye kadar bekle
        counter4.join(); // counter4 threadi bitesiye kadar bekle
        long endTime2 = System.currentTimeMillis();
        System.out.println("WithMultiThread ile geçen süre : " + (endTime2-startTime2));





    }

}

class CounterWithoutMultiThread {

    private int threadNum;

    //constructor
    public CounterWithoutMultiThread(int threadNum) {
        this.threadNum = threadNum;
    }

    public void countMe() throws InterruptedException {

        for (int i = 1 ; i<=10 ; i++){

            Thread.sleep(500);//0.5 saniye yavaşlattım main'i

            System.out.println("i"+i + "Thread Number : " + threadNum);

        }

    }

}

class CounterWithMultiThread extends Thread {

    private int threadNum;

    public CounterWithMultiThread(int threadNum) {

        this.threadNum = threadNum;

    }

    @Override
    public void run() {

        try {
            countMe();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void countMe() throws InterruptedException {

        for (int i = 1; i <= 10; i++) {

            Thread.sleep(500);//0.5 saniye yavaşlattım main'i

            System.out.println("i" + i + "Thread Number : " + threadNum);

        }

    }
}
