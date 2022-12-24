package AdvJavaInstruction.Threads;

public class MultiThreading03 {

    public static void main(String[] args) {

        Brackets brackets = new Brackets();

        //1. Thread
        Thread thread1 = new Thread(new Runnable() {

            @Override
            public void run() {

                for (int i = 1 ; i <= 7 ; i++) {

                    brackets.generateBrackets();

                }


            }
        });

        thread1.start();

        //2. Thread

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {

                for (int i = 1; i <= 7 ; i++) {

                    brackets.generateBrackets();

                }

            }
        });

        thread2.start();

    }



}

class Brackets{

    // çıktının düzgün gözükebilmesi için generateBrackets() methoduna aynı anda sadece 1 threadin
    // girebiliyor olması için "synchronized" kullanıldı.

    public synchronized void generateBrackets(){

        for (int i = 1; i <= 10 ; i++) {

            if (i <= 5){

                System.out.print("[");

            }else{

                System.out.print("]");
            }

        }

        System.out.println("");

    }

}
