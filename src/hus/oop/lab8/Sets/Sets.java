package hus.oop.lab8.Sets;

import java.util.*;

public class Sets extends Object {

    public static Set<Integer> copySet(Set<Integer> mySet) {
        Set<Integer> result = new HashSet<>();
        for (Integer element : mySet) {
            result.add(element);
        }
        return result;
    }
    public static Set<Integer> intersectionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> result = new HashSet<>();
        for (Integer firstElement : first) {
            if (second.contains(firstElement)) {
                result.add(firstElement);
            }
        }
        return result;
    }

    public static Set<Integer> unionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> result = copySet(first);
        for (Integer secondElement : second) {
            result.add(secondElement);
        }
        return result;
    }

    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second) {
        Set<Integer> result = copySet(first);
        result.retainAll(second);
        return result;
    }

    public static Set<Integer> union(Set<Integer> first, Set<Integer> second) {
        Set<Integer> result = copySet(first);
        result.addAll(second);
        return result;
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

    public static Set<Character> allRecurringChars(String s) {
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();
        for (int i = 0 ; i < s.length() ; i++) {
            if (!set1.contains(s.charAt(i))) {
                set1.add(s.charAt(i));
            } else {
                set2.add(s.charAt(i));
            }
        }
        return set2;
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
