package com.levik.collection;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample<T> {

    public static void main(String[] args) {
        final CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();
        for(int i=0; i< 100; i++){
            list.add("" + i);
        }


        Iterator<String> iter = list.iterator();
        while (iter.hasNext()){
            System.out.printf("Read from CopyOnWriteArrayList : %s %n", iter.next());
            iter.remove(); //not supported in CopyOnWriteArrayList in Java
        }
    }


}
