package AdvJavaInstruction.Method;


//Generic methodlar hangi durumda bize kolaylık sağlıyor?

public class GenericMethodDemo {

    public static void main(String[] args) {

        GenericMethodDemo obj1 = new GenericMethodDemo();
        Integer[] intArray = {1,23,54,56,45};
        Double[] doubleArray = {1.2 , 2.4 , 5.6 , 9.3};


        obj1.print(intArray);
        obj1.print(doubleArray);

    }

    //KÖTÜ ÖRNEK
    public void print(Integer[] arr){

        // ******


    }

    public void print(Double[] arr){



    }

    // generic method
    public <T> void print(T[] array){

        for (T t: array) {
            System.out.println(t);
        }

    }



}
