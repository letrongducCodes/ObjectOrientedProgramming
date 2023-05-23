package oop.collections.exercises;

import java.util.*;

public class Sets {
    public static Set<Integer> intersectionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> intersectionManual = new HashSet<>();
        for (Integer e : second) {
            if (first.contains(e)) {
                intersectionManual.add(e);
            }
        }
        return intersectionManual;
    }

    public static Set<Integer> unionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> unionManual = new HashSet<>(first);
        for (Integer e : second) {
            if (!unionManual.contains(e)) {
                unionManual.add(e);
            }
        }
        return unionManual;
    }

    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second) {
        Set<Integer> intersection = new HashSet<>(first);
        intersection.retainAll(second);
        return intersection;
    }

    public static Set<Integer> union(Set<Integer> first, Set<Integer> second) {
        Set<Integer> union = new HashSet<>(first);
        union.addAll(second);
        return union;
    }

    public static List<Integer> toList(Set<Integer> source) {
        List<Integer> lists = new ArrayList<>(source);
        return lists;
    }

    public static List<Integer> removeDuplicates(List<Integer> source) {
        Set<Integer> rmDuplicates = new LinkedHashSet<>();
        rmDuplicates.addAll(source);
        source.clear();
        source.addAll(rmDuplicates);
        return source;
    }

    public static List<Integer> removeDuplicatesManual(List<Integer> source) {
        List<Integer> rmDuplicates = new ArrayList<>();
        for (Integer e : source) {
            if (!rmDuplicates.contains(e)) {
                rmDuplicates.add(e);
            }
        }
        return source;
    }

    public static String firstRecurringCharacter(String s) {
        Set<Character> firstRecurChar = new HashSet<>();
        for (int i = 0 ; i < s.length() ; i++) {
            if (firstRecurChar.contains(s.charAt(i))) {
                return String.valueOf(s.charAt(i));
            } else {
                firstRecurChar.add(s.charAt(i));
            }
        }
        return null;
    }

    public static Set<Character> allRecurringCharacter(String s) {
        Set<Character> allRecurChar = new HashSet<>();
        for (int i = 0 ; i < s.length() ; i++) {
            if (!allRecurChar.contains(s.charAt(i))) {
                allRecurChar.add(s.charAt(i));
            }
        }
        return allRecurChar;
    }

    public static Integer[] toArray(Set<Integer> source) {
        Integer[] array = new Integer[source.size()];
        List<Integer> listSource = new ArrayList<>();
        listSource.addAll(source);
        for (int i = 0 ; i < listSource.size() ; i++) {
            array[i] = listSource.get(i);
        }
        return array;
    }

    public static int getFirst(TreeSet<Integer> source) {
        return source.first();
    }

    public static int getLast(TreeSet<Integer> source) {
        return source.last();
    }

    public static int getGreater(TreeSet<Integer> source, int value) {
        return source.higher(value);
    }


}
