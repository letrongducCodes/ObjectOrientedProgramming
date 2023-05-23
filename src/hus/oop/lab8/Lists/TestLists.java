package hus.oop.lab8.Lists;

import java.util.ArrayList;
import java.util.List;

public class TestLists {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(666);
        Lists.insertFirst((ArrayList<Integer>) list, 12);
        Lists.print(list);
        Lists.insertLast((ArrayList<Integer>) list, 10);
        Lists.print(list);
        Lists.replace((ArrayList<Integer>) list, 666);
        Lists.print(list);
        Lists.removeEvil((ArrayList<Integer>) list);
        Lists.print(list);
        Lists.insertFirst((ArrayList<Integer>) list, 20);
        Lists.insertFirst((ArrayList<Integer>) list, 400);
        Lists.removeThird((ArrayList<Integer>) list);
        List<Integer> squareNumbers = Lists.generateSquare();
        Lists.print(squareNumbers);
        System.out.println(list.contains(100));
        List<Integer> list2 = new ArrayList<>();
        Lists.copy((ArrayList<Integer>) list, (ArrayList<Integer>) list2);
        System.out.println(list2);
        Lists.reverse((ArrayList<Integer>) list);
        System.out.println(list);
        Lists.reverseManual((ArrayList<Integer>) list2);
        System.out.println(list2);
    }
}
