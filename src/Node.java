/**
 * Created by Алёна on 27.11.2016.
 */
public class Node<E> {
    private E element = null;
    private Node nextNode = null;

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public Node<E> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}
