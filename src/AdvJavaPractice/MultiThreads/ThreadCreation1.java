package AdvJavaPractice.MultiThreads;

/*

1) MultiThreading Programlama Nedir?

Aynı processde iki veya daha fazla iş parçacığının(thread) aynı anda çalışma sürecidir.

2)Threadler 2 şekilde oluşturulur:

        --> Thread sınıfından extend eden alt sınıf oluşturup, onun run() methodu override edilir.
        --> Runnable Interface'ini implement eden bir alt sınıf oluşturup bu interface'deki run() methodu override edilir,
            ardından Thread sınıfının constructionlarına nesne olarak gönderilir.

2a) Hangi yöntem daha kullanışlı?
    Genellikle Runnable interface'ini implement ederek oluşturmak daha çok tercih edilir çünkü
    Java'da sadece bir class extend edebiliriz ve bu hakkımızı Thread ile harcamak istemeyiz.


3) Run methodunu doğrudan Main methodundan çağırabilir miyiz?

 ** Evet ancak Thread oluşturulmaz. Normal bir sınıfın normal bir methodu gibi çalışır.


4) Javada herhangi bir Thread oluşturmazsak uygulamalar nerede/nasıl çalışır?

 ** Java varsayılan olarak tüm uygulamalarda main threadini kullanır.

*/



public class ThreadCreation1 {

    public static void main(String[] args) {


        //Task1: Thread sınıfını extend eden Sayac isminde sınıf oluşturup
        // bu sınıftan sayıları 1 den 100 e kadar yazdıran iki tane thread oluşturunuz.

        Sayac thread1 = new Sayac("Ronaldo");
        Sayac thread2 = new Sayac("Messi");

        thread1.start();
        thread2.start();




    }

}
