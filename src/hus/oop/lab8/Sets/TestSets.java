package hus.oop.lab8.Sets;

import java.util.*;

public class TestSets {
    public static void main(String[] args) {
        Set<Integer> first = new HashSet<>();
        first.add(1);
        first.add(2);
        first.add(3);
        first.add(1);
        Set<Integer> second = new HashSet<>();
        second.add(1);
        second.add(3);
        second.add(5);
        Set<Integer> intersection = Sets.intersection(first,second);
        System.out.println("Intersection: " + intersection.toString());
        Set<Integer> intersectionManual = Sets.intersectionManual(first,second);
        System.out.println("Intersection Manual: " + intersectionManual.toString());
        Set<Integer> union = Sets.union(first,second);
        System.out.println("Union: " + union.toString());
        Set<Integer> unionManual = Sets.unionManual(first,second);
        System.out.println("Union Manual: " + unionManual.toString());
        System.out.println(Sets.toList(first));
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        System.out.println(Sets.removeDuplicates(list));
        System.out.println(Sets.removeDuplicatesManual(list));
        String s = "aabbcdee";
        System.out.println(Sets.firstRecurringCharacter(s));
        System.out.println(Sets.allRecurringChars(s));
        System.out.println(Sets.toArray(first));
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(0);
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
        System.out.println(Sets.getFirst(treeSet));
        System.out.println(Sets.getLast(treeSet));
        System.out.println(Sets.getGreater(treeSet,1));
    }
}
