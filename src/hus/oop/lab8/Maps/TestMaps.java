package hus.oop.lab8.Maps;

import java.util.*;
public class TestMaps {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 25);
        map.put(2, 50);
        map.put(3, 75);

        System.out.println(Maps.count(map));

        System.out.println(Maps.contains(map, 2));

        System.out.println(Maps.containsKeyValue(map, 1, 25));

        System.out.println(Maps.keySet(map));
        System.out.println(Maps.values(map));
        System.out.println(Maps.getColor(2));

        Maps.empty(map);
        System.out.println(Maps.count(map));
    }
}
