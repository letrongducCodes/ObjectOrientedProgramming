package hus.oop.lab1;

public class CheckPassFail {
    public static void main(String[] args) {
        int mark = 49;
        checkPS(mark);
        System.out.println("DONE");
    }

    public static void checkPS(int mark) {
        if(mark <= 50) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }
}
