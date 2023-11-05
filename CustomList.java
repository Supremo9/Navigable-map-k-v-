package com.mycompany.assignment1;
import java.util.AbstractList;
public abstract class CustomList<E> extends AbstractList<E> {
    
    private Object[] elements;
    public CustomList(Object[] elements) {
        this.elements = elements;
    }
    
    public E get(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size());
        }
        return (E)elements[index];
    }
    
    public int size() {
        return elements.length;
    }
}
