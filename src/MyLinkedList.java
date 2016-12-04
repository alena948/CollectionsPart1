import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by Алёна on 27.11.2016.
 */
public class MyLinkedList<E> implements ILinkedList<E> {

    private Node<E> head = null;
    private Node<E> tail = null;
    private Node<E> currNode = null;
    private int size = 0;

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
    public int indexOf(Object element) {
        
        return 0;
    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public E set(int index, Object element) {
        return null;
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
    public E[] toArray() {
        return null;
    }

    public E getHead() {
        return head.getElement();
    }

    public E getTail() {
        return tail.getElement();
    }
}
