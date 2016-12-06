package com.netcracker;

import com.netcracker.MyLinkedList;

import java.util.Iterator;

/**
 * Created by Алёна on 27.11.2016.
 */
public class MyLinkedListIterator<E> implements Iterator<E> {
    private MyLinkedList<E> list = new MyLinkedList<>();
    private Node<E> currNode;

    @Override
    public boolean hasNext() {
        if (currNode.getNextNode() != null)
            return true;
        else return false;
    }

    @Override
    public E next() {
        currNode = currNode.getNextNode();
        return currNode.getElement();
    }
}
