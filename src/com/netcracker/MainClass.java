package com.netcracker;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

/**
 * Created by Алёна on 27.11.2016.
 */
public class MainClass {
    public static void main(String[] args) {
        Random rand = new Random();
        MyLinkedList<Integer> myList = new MyLinkedList<>();
        java.util.LinkedList<Integer> list = new LinkedList<>();

        //Add to myList
        long startTimeOfAddToMyList = System.nanoTime();
        for (int i = 0; i < 10000 - 1; i++) {
            myList.add(rand.nextInt());
        }
        myList.add(666666);
        long estimatedTimeOfAddToMyList = System.nanoTime() - startTimeOfAddToMyList;

        //Add to list
        long startTimeOfAddToList = System.nanoTime();
        for (int i = 0; i < 10000 - 1; i++) {
            list.add(rand.nextInt());
        }
        list.add(666666);
        long estimatedTimeOfAddToList = System.nanoTime() - startTimeOfAddToMyList;

        System.out.println("Time of add to myList =  " + estimatedTimeOfAddToMyList);
        System.out.println("Time of add to list =  " + estimatedTimeOfAddToList);

        //Search in myList
        long startTimeOfSearchInMyList = System.nanoTime();
        myList.get(9999);
        long estimatedTimeOfSearchInMyList = System.nanoTime() - startTimeOfSearchInMyList;

        //Search in list
        long startTimeOfSearchInList = System.nanoTime();
        list.get(9999);
        long estimatedTimeOfSearchInList = System.nanoTime() - startTimeOfSearchInMyList;

        System.out.println("Time of search in myList = " + estimatedTimeOfSearchInMyList);
        System.out.println("Time of search in list = " + estimatedTimeOfSearchInList);

        //Deletion of myList
        long startTimeOfDeletionOfMyList = System.nanoTime();
        myList.remove(5000);
        long estimatedTimeOfDeletionOfMyList = System.nanoTime() - startTimeOfDeletionOfMyList;

        //Deletion of list
        long startTimeOfDeletionOfList = System.nanoTime();
        list.remove(5000);
        long estimatedTimeOfDeletionOfList = System.nanoTime() - startTimeOfDeletionOfList;

        System.out.println("Time of deletion of myList = " + estimatedTimeOfDeletionOfMyList);
        System.out.println("Time of deletion of list = " + estimatedTimeOfDeletionOfList);

        System.out.println("Size of myList = " + myList.size());
        System.out.println("Size of list = " + list.size());

        /*
        myList.add(0, 1);
        myList.add(1, 10);
        myList.add(2, 16);
        myList.add(32);
        myList.add(3, 46);
        myList.add(2, 2);
        myList.add(99);
        myList.add(0, 12);
        System.out.print("Collection: ");
        for (Object elem : list)
            System.out.print(elem + " ");
        System.out.println();
        System.out.println("Size of collection: " + list.size());

        System.out.println("Head = " + list.getHead());
        System.out.println("Tail = " + list.getTail());


        System.out.println("Array: ");
        for (Object i : list.toArray()) {
            System.out.print(i + " ");
        }*/

        /*Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }*/
    }
}
