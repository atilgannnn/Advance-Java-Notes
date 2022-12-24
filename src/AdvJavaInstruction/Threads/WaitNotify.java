package AdvJavaInstruction.Threads;

public class WaitNotify {

    public static int balance = 0;

    public static void main(String[] args) {

        WaitNotify obj = new WaitNotify();

        // Thread - 1
        Thread thread1 = new Thread(new Runnable() {

            @Override
            public void run() {

                obj.withdraw(800);

            }
        });
        thread1.setName("Withdraw Thread");
        thread1.start();

        // Thread - 2
        Thread thread2 = new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                obj.deposit(2000);


            }
        });
        thread2.setName("Deposit Thread");
        thread2.start();

    }


    // Para Çekme Methodu

    public void withdraw(int amount){


        synchronized (this){

            if (balance <= 0 || balance < 0){

                System.out.println("Balance değeri değişene kadar bekliyorum");
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }//synchronized block sonu

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // wait() işlemi bittikten sonra veya balance değeri yeterli olana kadar
        balance = balance - amount;
        System.out.println("Para çekim işlemi başarıyla gerçekleşmiştir");


    }

    // Para Yatırma Methodu

    public void deposit(int amount){

        balance = balance + amount;

        System.out.println("Para yatırma işleminiz başarıyla gerçekleşmiştir");

        synchronized (this){


            notify();


        }




    }


}
