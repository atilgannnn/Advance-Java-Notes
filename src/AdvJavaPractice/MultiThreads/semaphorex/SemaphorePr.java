package AdvJavaPractice.MultiThreads.semaphorex;

import java.util.concurrent.Semaphore;

/*
Semaphore bir kaynağa erişebilen iş parçacığı sayısını kısıtlamak için kullanılır.
Yani, synchronized sadece bir iş parçacığının kilitlenmesi ve
senkronize blok / yöntemi yürütmesine izin verirken, Semaphore n iş parçacığına kadar izin verir
ve diğerlerini engeller.

senaryo:deneme kabini/ödeme kasası
Mağazanın 3 deneme kabini var. 5 kişi mağazanın deneme kabinini
kullanmak istiyor. Bu 5 tane işlem için 5 thread kullanılsın.
*/
public class SemaphorePr {
    public static void main(String[] args) {
        Semaphore semaphore=new Semaphore(3);
        Person person1=new Person("Fred",semaphore);
        Person person2=new Person("Wilma",semaphore);
        Person person3=new Person("Betty",semaphore);
        Person person4=new Person("Çakıl",semaphore);
        Person person5=new Person("Dino",semaphore);
        person1.start();
        person2.start();
        person3.start();
        person4.start();
        person5.start();

    }

}
class Person extends Thread{
    private String name;
    private Semaphore semaphore;

    public Person(String name, Semaphore semaphore) {
        this.name = name;
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        System.out.println(name+" kabine girmek istiyor...");
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(name+ " kabine girdi.");
        System.out.println(name+ " kabini kullanıyor.");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(name+" kabinden çıkıyor...");
        semaphore.release();

    }
}
