package hus.oop.lab9.MyMap;

public class TestApp {
    public static void main(String[] args) {
        MyMap m = new MyHashMap();
        m.put(11,"Nicola");
        m.put(11,"Nicola");
        m.put(21,"Marzia");
        m.put(33,"Agata");
        System.out.println(m.size());
        System.out.println(m);
        m.remove(21);
        System.out.println(m.contains(11));
        System.out.println(m.contains(77));
        System.out.println(m.size());
        System.out.println(m);
        }
}
