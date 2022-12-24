package AdvJavaPractice.Serialization;


import java.io.*;

//TASK : Book tipinde nesneler üretip bu nesneleri
//books.txt dosyasına kaydedin ve daha sonrabu dosyadan neseneleri okuyun.
public class SerializationPractice {


    public static void main(String[] args) {

        writeObject();
        readObject();

    }



    public static void writeObject(){

        Book book1 = new Book("Sefiller","Victor Hugo",1945);
        Book book2 = new Book("Suç ve Ceza","Dostoyevski",1955);
        Book book3 = new Book("Savaş ve Barış","Tolstoy",1940);

        // Nesneleri yazdıracağımız dosyayı yazdırmak için
        try {
            FileOutputStream fos = new FileOutputStream("books.txt");

            // Nesneleri yazdırmak için
            ObjectOutputStream write = new ObjectOutputStream(fos);
            write.writeObject(book1);
            write.writeObject(book2);
            write.writeObject(book3);

            write.close();
            fos.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }



    }

    public static void readObject(){

        //Nesneleri okuyacağımız dosyayı okur
        try {
            FileInputStream fis = new FileInputStream("books.txt");

            // Nesneleri okumak için
            ObjectInputStream read = new ObjectInputStream(fis);
            Book book1 = (Book)read.readObject();
            Book book2 = (Book)read.readObject();
            Book book3 = (Book)read.readObject();

            System.out.println(book1);
            System.out.println(book2);
            System.out.println(book3);

            read.close();
            fis.close();


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }




}
