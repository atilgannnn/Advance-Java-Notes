package AdvJavaInstruction.InterfaceType;

//Eğer bir "Generic Interface" implement ederseniz Class da "Generic" olmalı
public class GenericClassImpl<T> implements GenericInterface<T> {


    @Override
    public void setValue(T t) {

    }

    @Override
    public T getvalue() {
        return null;
    }
}
