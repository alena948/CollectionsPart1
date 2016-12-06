package com.netcracker;

import java.util.*;

/**
 * Created by Алёна on 06.12.2016.
 */
public class TestClass {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> arrayList = new ArrayList();
        LinkedList<Integer> linkedList = new LinkedList();

        HashSet<Integer> hashSet = new HashSet<>();
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        HashMap<Integer, Integer> hashMap = new HashMap();
        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap();
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        System.out.println("///Comparison arrayList and linkedList:");
        //Add to arrayList
        long startTimeOfAddToArrayList = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(rand.nextInt());
        }
        long estimatedTimeOfAddToArrayList = System.nanoTime() - startTimeOfAddToArrayList;

        //Add to linkedList
        long startTimeOfAddToLinkedList = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(rand.nextInt());
        }
        long estimatedTimeOfAddToLinkedList = System.nanoTime() - startTimeOfAddToLinkedList;

        System.out.println("Time of add to arrayList = " + estimatedTimeOfAddToArrayList);
        System.out.println("Time of add to linkedList = " + estimatedTimeOfAddToLinkedList);

        //Insert into arrayList
        long startTimeOfInsertIntoArrayList = System.nanoTime();
        arrayList.add(50000, 0);
        long estimatedTimeOfInsertIntoArrayList = System.nanoTime() - startTimeOfInsertIntoArrayList;

        //Insert into linkedList
        long startTimeOfInsertIntoLinkedList = System.nanoTime();
        linkedList.add(50000, 0);
        long estimatedTimeOfInsertIntoLinkedList = System.nanoTime() - startTimeOfInsertIntoLinkedList;

        System.out.println("Time of insert into arrayList = " + estimatedTimeOfInsertIntoArrayList);
        System.out.println("Time of insert into linkedList = " + estimatedTimeOfInsertIntoLinkedList);

        //Deletion of arrayList
        long startTimeOfDeletionOfArrayList = System.nanoTime();
        arrayList.remove(100000);
        long estimatedTimeOfDeletionOfArrayList = System.nanoTime() - startTimeOfDeletionOfArrayList;

        //Deletion of linkedList
        long startTimeOfDeletionOfLinkedList = System.nanoTime();
        linkedList.remove(100000);
        long estimatedTimeOfDeletionOfLinkedList = System.nanoTime() - startTimeOfDeletionOfLinkedList;

        System.out.println("Time of deletion of arrayList = " + estimatedTimeOfDeletionOfArrayList);
        System.out.println("Time of deletion of linkedList = " + estimatedTimeOfDeletionOfLinkedList);

        System.out.println("///Comparison hashSet, linkedHashSet and treeSet:");
        //Add to hashSet
        long startTimeOfAddToHashSet = System.nanoTime();
        for (int i = 0; i < 100000 - 1; i++) {
            hashSet.add(rand.nextInt());
        }
        hashSet.add(666666);
        long estimatedTimeOfAddToHashSet = System.nanoTime() - startTimeOfAddToHashSet;

        //Add to linkedHashSet
        long startTimeOfAddToLinkedHashSet = System.nanoTime();
        for (int i = 0; i < 100000 - 1; i++) {
            linkedHashSet.add(rand.nextInt());
        }
        linkedHashSet.add(666666);
        long estimatedTimeOfAddToLinkedHashSet = System.nanoTime() - startTimeOfAddToLinkedHashSet;

        //Add to treeSet
        long startTimeOfAddToTreeSet = System.nanoTime();
        for (int i = 0; i < 100000 - 1; i++) {
            treeSet.add(rand.nextInt());
        }
        treeSet.add(666666);
        long estimatedTimeOfAddToTreeSet = System.nanoTime() - startTimeOfAddToTreeSet;

        System.out.println("Time of add to hashSet = " + estimatedTimeOfAddToHashSet);
        System.out.println("Time of add to linkedHashSet = " + estimatedTimeOfAddToLinkedHashSet);
        System.out.println("Time of add to treeSet = " + estimatedTimeOfAddToTreeSet);

        //Insert into hashSet
        long startTimeOfInsertIntoHashSet = System.nanoTime();
        hashSet.add(0);
        long estimatedTimeOfInsertIntoHashSet = System.nanoTime() - startTimeOfInsertIntoHashSet;

        //Insert into linkedHashSet
        long startTimeOfInsertIntoLinkedHashSet = System.nanoTime();
        linkedHashSet.add(0);
        long estimatedTimeOfInsertIntoLinkedHashSet = System.nanoTime() - startTimeOfInsertIntoLinkedHashSet;

        //Insert into treeSet
        long startTimeOfInsertIntoTreeSet = System.nanoTime();
        treeSet.add(0);
        long estimatedTimeOfInsertIntoTreeSet = System.nanoTime() - startTimeOfInsertIntoTreeSet;

        System.out.println("Time of insert into hashSet = " + estimatedTimeOfInsertIntoHashSet);
        System.out.println("Time of insert into linkedHashSet = " + estimatedTimeOfInsertIntoLinkedHashSet);
        System.out.println("Time of insert into treeSet = " + estimatedTimeOfInsertIntoTreeSet);

        //Deletion of hashSet
        long startTimeOfDeletionOfHashSet = System.nanoTime();
        hashSet.remove(666666);
        long estimatedTimeOfDeletionOfHashSet = System.nanoTime() - startTimeOfDeletionOfHashSet;

        //Deletion of linkedHashSet
        long startTimeOfDeletionOfLinkedHashSet = System.nanoTime();
        linkedHashSet.remove(666666);
        long estimatedTimeOfDeletionOfLinkedHashSet = System.nanoTime() - startTimeOfDeletionOfLinkedHashSet;

        //DeletionOf treeSet
        long startTimeOfDeletionOfTreeSet = System.nanoTime();
        treeSet.remove(666666);
        long estimatedTimeOfDeletionOfTreeSet = System.nanoTime() - startTimeOfDeletionOfTreeSet;

        System.out.println("Time of deletion of hashSet = " + estimatedTimeOfDeletionOfHashSet);
        System.out.println("Time of deletion of linkedHashSet = " + estimatedTimeOfDeletionOfLinkedHashSet);
        System.out.println("Time of deletion of treeSet = " + estimatedTimeOfDeletionOfTreeSet);

        System.out.println("///Comparison hashMap, linkedHashMap and treeMap:");
        //Add to hashMap
        long startTimeOfAddToHashMap = System.nanoTime();
        for (int i = 0; i < 100000 - 1; i++) {
            hashMap.put(i, rand.nextInt());
        }
        hashMap.put(99999, 666666);
        long estimatedTimeOfAddToHashMap = System.nanoTime() - startTimeOfAddToHashMap;

        //Add to linkedHashMap
        long startTimeOfAddToLinkedHashMap = System.nanoTime();
        for (int i = 0; i < 100000 - 1; i++) {
            linkedHashMap.put(i, rand.nextInt());
        }
        linkedHashMap.put(99999, 666666);
        long estimatedTimeOfAddToLinkedHashMap = System.nanoTime() - startTimeOfAddToLinkedHashMap;

        //Add to treeMap
        long startTimeOfAddToTreeMap = System.nanoTime();
        for (int i = 0; i < 100000 - 1; i++) {
            treeMap.put(i, rand.nextInt());
        }
        treeMap.put(99999, 666666);
        long estimatedTimeOfAddToTreeMap = System.nanoTime() - startTimeOfAddToTreeMap;

        System.out.println("Time of add to hashMap = " + estimatedTimeOfAddToHashMap);
        System.out.println("Time of add to linkedHashMap = " + estimatedTimeOfAddToLinkedHashMap);
        System.out.println("Time of add to treeMap = " + estimatedTimeOfAddToTreeMap);

        //Insert into hashMap
        long startTimeOfInsertIntoHashMap = System.nanoTime();
        hashMap.put(50000, 0);
        long estimatedTimeOfInsertIntoHashMap = System.nanoTime() - startTimeOfInsertIntoHashMap;

        //Insert Into linkedHashMap
        long startTimeOfInsertIntoLinkedHashMap = System.nanoTime();
        linkedHashMap.put(50000, 0);
        long estimatedTimeOfInsertIntoLinkedHashMap = System.nanoTime() - startTimeOfInsertIntoLinkedHashMap;

        //Insert Into treeMap
        long startTimeOfInsertIntoTreeMap = System.nanoTime();
        treeMap.put(50000, 0);
        long estimatedTimeOfInsertIntoTreeMap = System.nanoTime() - startTimeOfInsertIntoTreeMap;

        System.out.println("Time of insert into hashMap = " + estimatedTimeOfInsertIntoHashMap);
        System.out.println("Time of insert into linkedHashMap = " + estimatedTimeOfInsertIntoLinkedHashMap);
        System.out.println("Time of insert into treeMap = " + estimatedTimeOfInsertIntoTreeMap);

        //Deletion of hashMap
        long startTimeOfDeletionOfHashMap = System.nanoTime();
        hashMap.remove(99999);
        long estimatedTimeOfDeletionOfHashMap = System.nanoTime() - startTimeOfDeletionOfHashMap;

        //Deletion Of linkedHashMap
        long startTimeOfDeletionOfLinkedHashMap = System.nanoTime();
        linkedHashMap.remove(99999);
        long estimatedTimeOfDeletionOfLinkedHashMap = System.nanoTime() - startTimeOfDeletionOfLinkedHashMap;

        //InsertInto treeMap
        long startTimeOfDeletionOfTreeMap = System.nanoTime();
        treeMap.remove(99999);
        long estimatedTimeOfDeletionOfTreeMap = System.nanoTime() - startTimeOfDeletionOfTreeMap;

        System.out.println("Time of deletion of hashMap = " + estimatedTimeOfDeletionOfHashMap);
        System.out.println("Time of deletion of linkedHashMap = " + estimatedTimeOfDeletionOfLinkedHashMap);
        System.out.println("Time of deletion of treeMap = " + estimatedTimeOfDeletionOfTreeMap);

    }
}
