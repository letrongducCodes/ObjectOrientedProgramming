package hus.oop.lab9.MyList;

public class TestApp {
    public static void main(String[] args) {
        testArrayList();
        testLinkedList();
    }

    public static void testLinkedList() {
        MyList linkedList = new MyLinkedList();
        linkedList.add("a",0);
        linkedList.add("b");
        linkedList.add("c",0);
        linkedList.add("c",3);
        linkedList.remove(3);
        System.out.println(linkedList.size());
        System.out.println(linkedList);
    }

    public static void testArrayList() {
        MyList l = new MyArrayList();
        l.add("a",0);
        l.add("b");
        l.add("c",0);
        l.add("c",3);
        System.out.println(l.size());
        System.out.println(l);
        l.remove(3);
    }
}
