package AdvJavaInstruction.InterfaceType;

/*

Generic yapıda bir Interface kullanarak bir Class oluşturmak istediğimde
1) Ya hem class hem interface generic olmak zorunda
2) Ya da class klasik yapıda kalacak ve Interface generic olmayacak (T, E gibi bir ifade yerine String,Integer gibi daha kesin bir değer alacak)

*/

public class GenericClassStringImpl implements GenericInterface<String>{


    @Override
    public void setValue(String s) {

    }

    @Override
    public String getvalue() {
        return null;
    }
}
