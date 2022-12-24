package AdvJavaPractice.MultiThreads;

public class Counter implements Runnable{

    private String name;

    public Counter(String name) {
        this.name = name;
    }

    @Override
    public void run() {

        System.out.println(this.name+" başladı.");

        for (char i = 'a'; i <= 'z' ; i++) {

            System.out.println(this.name+" "+i);


        }

        System.out.println(this.name+" bitti.");

    }
}
