package hus.oop.lab8.Lists;

import java.util.*;
import java.util.Collections;

public class Lists {
    public static void insertFirst(ArrayList<Integer> list, int value) {
        list.add(0,value);
    }

    public static void insertLast(ArrayList<Integer> list, int value) {
        list.add(value);
    }

    public static void replace(ArrayList<Integer> list, int value) {
        list.set(2,value);
    }

    public static void removeThird(ArrayList<Integer> list) {
        list.remove(2);
    }

    public static void removeEvil(ArrayList<Integer> list) {
        int evilNumber = 666;
        while (list.indexOf(evilNumber) != -1) {
            list.remove(list.indexOf(evilNumber));
        }
    }

    public static ArrayList<Integer> generateSquare() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i * i);
        }
        return list;
    }

    public static boolean contains(ArrayList<Integer> list, int value) {
        if(list.contains(value)) {
            return true;
        }
        return false;
    }

    public static void copy(ArrayList<Integer> source, ArrayList<Integer> target) {
        if(target.isEmpty()) {
          target.addAll(source);
        }
    }

    public static void reverse(ArrayList<Integer> list) {
        Collections.reverse(list);
    }

    public static void reverseManual(ArrayList<Integer> list) {
        int firstIndex = 0;
        int lastIndex = list.size() - 1;
        while (firstIndex < lastIndex) {
            int temp = list.get(firstIndex);
            list.set(firstIndex,list.get(lastIndex));
            list.set(lastIndex,temp);
            firstIndex++;
            lastIndex--;
        }
    }

    public static void insertBeginningEnd(LinkedList<Integer> list, int value) {
        list.addFirst(value);
        list.addLast(value);
    }

    public static void print(List<Integer> list) {
        for (Integer i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
