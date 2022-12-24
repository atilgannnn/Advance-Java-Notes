package AdvJavaPractice.MultiThreads.deadlock;

public class WithoutDeadlock {
    public static void main(String[] args) {
        String kalem = "kalem";
        String cetvel = "cetvel";
        String silgi=  "silgi";
        Thread t1=new Thread(new SyncThread2(kalem,cetvel),"Dog");
        Thread t2=new Thread(new SyncThread2(silgi,kalem),"Tom");
        Thread t3=new Thread(new SyncThread2(cetvel,silgi),"Jerry");
        t1.start();
        t2.start();
        t3.start();



    }
}
class SyncThread2 implements Runnable{

    private String obj1;
    private String obj2;

    public SyncThread2(String obj1, String obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    @Override
    public void run() {
        String name=Thread.currentThread().getName();
        System.out.println(name+" "+obj1+ "i istiyor. ");
        synchronized (obj1) {
            System.out.println(name + " " + obj1 + "i aldı. ");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(name + " " + obj1 + "i bıraktı. ");
        }
        System.out.println(name+" "+obj2+ "i istiyor. ");
        synchronized (obj2) {
            System.out.println(name + " " + obj2 + "i aldı. ");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(name + " " + obj2 + "i bıraktı. ");
        }
        System.out.println(name+" çalışmayı tamamladı.");

    }
}


