package com.netcracker;

import java.util.Iterator;

/**
 * Created by Алёна on 26.11.2016.
 */
public interface ILinkedList<E> extends Iterable {
    public void add(E element);
    public void add(int index, E element);
    public void clear();
    public E get(int index);
    public int indexOf(E element);
    public E remove(int index);
    public void set(int index, E element);
    public int size();
    public Iterator<E> iterator();
    public Object[] toArray();
    public String toString();
}
