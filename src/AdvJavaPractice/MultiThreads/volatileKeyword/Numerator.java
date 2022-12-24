package AdvJavaPractice.MultiThreads.volatileKeyword;

public class Numerator {

    private volatile static int counter=0;
    //volatile keywordü değişkenin main memoryde saklanmasını garanti eder ancak
    //tüm threadlerin değişkene aynı anda ulaşmasından kaynaklı çakışmaya çözme garantisi yoktur.
    //bunun için synchronized keywordü de kullanılmalı

    public void getOrder(){
        String name=Thread.currentThread().getName();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        synchronized(this) {
            counter++;
            System.out.println("Sayın " + name + " sıranız: " + counter);
        }

    }
}
