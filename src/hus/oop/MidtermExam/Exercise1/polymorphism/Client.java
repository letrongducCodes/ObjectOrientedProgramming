package hus.oop.MidtermExam.Exercise1.polymorphism;

// Tính đa hình à một khái niệm mà chúng ta có thể thực hiện một hành động bằng nhiều cách khác nhau.
// Tính đa hình có thể nói luôn tồn tại song song với tính kế thừa. Khi có nhiều lớp con kế thừa lớp cha nhưng có những
// tính chất khác nhau.

public class Client {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.show();

        shape = new Rectangle();
        shape.show();

        shape = new Square();
        shape.show();
    }
}
