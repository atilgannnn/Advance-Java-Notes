package AdvJavaPractice.Generics.Classes;

public class StudentList {


    /*
    ==Generic Types==
    -Java 5 ile geldi
    -Farklı data tipleri ile aynı yapıyı kullanabilme
    -Tip güvenliği sağlar, castinge gerek olmaz
    -CTE verir.
    -AdvJavaInstruction.Generics primitive data tipi ile çalışmaz.

    Task: 1) Java dersi için, öğrencileri isim, vize notu ve final notunu  ile birlikte listeleyen bir program yazınız.
          2) Kütüphane için, öğrencileri isim, okul no ve mail adresi ile birlikte listeleyen bir program yazınız.
    */
        public static void main(String[] args) {

            System.out.println("** Java dersi vize ve final notları **");
            listGrade();

            System.out.println(" == Kütüphane Üye Listesi == ");
            listMemberLibrary();


        }
    //öğrencilerin notlarını listeleyen bir method yazınız.

    public static void listGrade(){

            Student<String,Double,Double> std1 = new Student("Wilma",76.8,80.0);
            Student<String,Double,Double> std2 = new Student("Fred",89.9,90.9);
            Student<String,Double,Double> std3 = new Student("Barnie",56.8,70.0);

        System.out.printf("%-10s || %4s || %4s %n",std1.getS(),std1.getU(),std1.getV());
        System.out.printf("%-10s || %4s || %4s %n",std2.getS(),std2.getU(),std2.getV());
        System.out.printf("%-10s || %4s || %4s %n",std3.getS(),std3.getU(),std3.getV());


    }


    //kütüphane üye öğrenci listesini yazdıran bir method yazınız.

    public static void listMemberLibrary(){

    Student<String,Integer,String > std1 = new Student<>("Çakıl",567,"cakil@gmail.com");
    Student<String,Integer,String > std2 = new Student<>("Bambam",568,"bambam@gmail.com");
    Student<String,Integer,String > std3 = new Student<>("Betty",569,"betty@gmail.com");


        System.out.printf("%-10s || %4d || %20s %n",std1.getS(),std1.getU(),std1.getV());
        System.out.printf("%-10s || %4d || %20s %n",std2.getS(),std2.getU(),std2.getV());
        System.out.printf("%-10s || %4d || %20s %n",std3.getS(),std3.getU(),std3.getV());



    }

    }





