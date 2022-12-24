package AdvJavaPractice.MultiThreads.synchronization;
//Multithreading programlamada birden fazla Thread aynı anda ortak bir kaynağa erişmeye çalışırsa
//istenmeyen sonuçlar oluşacaktır. Bu durumda threadlere sırayla erişim vermek gerekecektir.
// Bir thread kaynağı kullanıyorken diğerleri onu beklemelidirler. Bu "synchronized" keywordü ile sağlanır.
//synchronized keywordü metot ve bloklarda kullanılır.
/*
Task: Bir randevu oluşturma uygulaması tasarlayınız.(AppoinmentCenter)
      Uygulama herbir talep için bir gün sonrasına tarih
      vermelidir.
*/
public class AppoinmentApp {
    public static void main(String[] args) {

        String[] users={"Tolstoy","VictorHugo","Balzac","Dostoyevski","JohnSteinbeck"};
        AppoinmentCenter appoinmentCenter=new AppoinmentCenter();
        for(String user:users) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    Thread.currentThread().setName(user);
                    String name = Thread.currentThread().getName();
                    System.out.format("Sayın %-16s, Randevu tarihiniz: %10s %n", name, appoinmentCenter.getAppoinmentDate());
                }
            });
            thread.start();
        }

    }
}
