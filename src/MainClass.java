import java.util.Iterator;

/**
 * Created by Алёна on 27.11.2016.
 */
public class MainClass {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(0,1);
        list.add(1,10);
        list.add(2,16);
        list.add(32);
        list.add(3,46);
        list.add(2,2);
        list.add(99);
        list.add(0,12);

        System.out.print("Collection: ");
        for(Object elem : list)
            System.out.print(elem + " ");
        System.out.println();
        System.out.println("Size of collection: " + list.size());

        System.out.println("Head = " + list.getHead());
        System.out.println("Tail = " + list.getTail());

        System.out.println("Element = " + list.get(1));
        /*Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }*/
    }
}
