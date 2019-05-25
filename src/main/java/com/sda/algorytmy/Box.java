package com.sda.algorytmy;

//T is meant to be a Type
//E is meant to be an Element (List<E>: a list of Elements)
//K is Key (in a Map<K,V>)
//V is Value (as a return value or mapped value)

public class Box<T> {

    private T element;
    private T[] tablica;

    public Box(T element) {
        this.element = element;
    }

    public T getElement(){
        return element;
    }
}
