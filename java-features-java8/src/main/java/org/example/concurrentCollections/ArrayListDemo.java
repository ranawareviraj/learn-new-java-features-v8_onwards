package org.example.concurrentCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Iterator<Integer> iterator = list.iterator();

/*  java.util.ConcurrentModificationException
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            list.add(4);
        }
*/

        CopyOnWriteArrayList<Integer> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add(1);
        copyOnWriteArrayList.add(2);
        copyOnWriteArrayList.add(3);

        Iterator<Integer> iterator1 = copyOnWriteArrayList.iterator();
        while (iterator1.hasNext()) {
            System.out.print(iterator1.next() + " ");
            copyOnWriteArrayList.add(4);
        }
        System.out.println();

        System.out.println("copyOnWriteArrayList: " + copyOnWriteArrayList);
    }
}
