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
    public E set(int index, E element);
    public int size();
    public Iterator<E> iterator();
    public E[] toArray();
    public String toString();
}
