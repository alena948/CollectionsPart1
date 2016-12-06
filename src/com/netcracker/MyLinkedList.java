package com.netcracker;

import com.netcracker.ILinkedList;

import java.util.Iterator;

/**
 * Created by Алёна on 27.11.2016.
 */
public class MyLinkedList<E> implements ILinkedList<E> {

    private Node<E> head;
    private Node<E> tail;
    private Node<E> currNode;
    private int size;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
        this.currNode = null;
        this.size = 0;
    }

    @Override
    public void add(Object element) {
        Node<E> newNode = new Node<>();
        newNode.setElement((E) element);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.setNextNode(null);
        } else {
            tail.setNextNode(newNode);
            newNode.setNextNode(null);
            tail = newNode;
        }
        size++;
    }

    @Override
    public void add(int index, Object element) {
        if (index < 0 || index > size() + 1)
            System.out.println("Invalid index!");
        else {
            Node<E> newNode = new Node<>();
            Node<E> currNode = head;
            newNode.setElement((E) element);
            if (head == null) {//if collection have no elements
                head = newNode;
                tail = newNode;
                newNode.setNextNode(null);
            } else {
                if (index != 0) {//if node index is valid and isn't first
                    currNode.setNextNode(head.getNextNode());
                    for (int i = 0; i < index - 1; i++) {
                        currNode = currNode.getNextNode();
                    }
                    newNode.setNextNode(currNode.getNextNode());
                    currNode.setNextNode(newNode);
                    if (index == size)
                        tail = newNode;
                } else if (index == 0) {//if node index is first
                    newNode.setNextNode(head);
                    head = newNode;
                }
            }
            size++;
        }
    }

    @Override
    public void clear() {
        currNode = head.getNextNode();
        Node<E> tmpNode;
        for (int i = 0; i < size - 1; i++) {
            tmpNode = currNode;
            currNode = currNode.getNextNode();
            tmpNode = null;
        }
        currNode = null;
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public E get(int index) {
        currNode = head;
        Node<E> tmpNode = currNode;
        for (int i = 0; i < index; i++) {
            tmpNode = currNode;
            currNode = currNode.getNextNode();
        }
        return tmpNode.getElement();
    }

    @Override
    public int indexOf(E element) {
        int index = 0;
        currNode = head;
        for (int i = 0; i < size; i++) {
            if (currNode.getElement() == element)
                index = i + 1;
            currNode = currNode.getNextNode();
        }
        if (index == 0)
            System.out.println("Collection hasn't this element");
        return index;
    }

    @Override
    public E remove(int index) {
        E elem = head.getElement();
        if (index < 0 || index > size() + 1)
            System.out.println("Invalid index!");
        else {
            currNode = head;
            Node<E> tmpNode = head;
            if (index == 0) {
                head = currNode.getNextNode();
                currNode = null;
            } else {
                for (int i = 0; i < index; i++) {
                    tmpNode = currNode;
                    currNode = currNode.getNextNode();
                }
                if (index == size - 1)
                    tail = tmpNode;
                tmpNode.setNextNode(currNode.getNextNode());
                elem = currNode.getElement();
                currNode = null;
            }
        }
        size--;
        return elem;
    }

    @Override
    public void set(int index, E element) {
        E elem = head.getElement();
        if (index < 0 || index > size() + 1)
            System.out.println("Invalid index!");
        else {
            currNode = head;
            Node<E> tmpNode = head;
            if (index == 0) {
                currNode.setElement(element);
            } else {
                for (int i = 0; i < index; i++) {
                    currNode = currNode.getNextNode();
                }
                currNode.setElement(element);
            }
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<E> iterator() {

        currNode = head;

        Iterator<E> iter = new Iterator<E>() {

            @Override
            public boolean hasNext() {
                if (currNode != null)
                    return true;
                else
                    return false;
            }

            @Override
            public E next() {
                E ret = currNode.getElement();
                currNode = currNode.getNextNode();
                return ret;
            }
        };

        return iter;
    }

    @Override
    public Object[] toArray() {
        Object[] array = new Object[size];
        currNode = head;
        for (int i = 0; i < size; i++) {
            array[i] = currNode.getElement();
            currNode = currNode.getNextNode();
        }
        return array;
    }

    public E getHead() {
        return head.getElement();
    }

    public E getTail() {
        return tail.getElement();
    }
}
