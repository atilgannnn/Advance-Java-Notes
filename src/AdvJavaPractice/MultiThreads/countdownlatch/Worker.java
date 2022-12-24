package AdvJavaPractice.MultiThreads.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class Worker extends Thread{
    private String name;
    private CountDownLatch latch;

    public Worker(String name, CountDownLatch latch) {
        this.name = name;
        this.latch = latch;
    }

    @Override
    public void run() {
        System.out.println(name+" - threadi başladı.");
        System.out.println(name+" bazı işlemler yapıyor...");
        System.out.println(name+" - threadi bitti.");
        latch.countDown();
    }
}
