package hus.oop.MidtermExam.Exercise1.abstraction;
// Tính trừu tượng  là một tiến trình chỉ nói ra tính năng của người dùng, các khái niệm được định nghĩa trong quá trình
// phát triển, bỏ qua những chi tiết triển khai bên trong. Tính trừu tượng cho phép người lập trình tập trung cốt lõi cần
// thiết của đối tượng thay vì quan tâm sự phức tạo bên trong hoặc cách nó hoạt động.

//Ví dụ thông qua abstract Movable, ta biết lớp abstract Movable có thể thực hiện greets
// mà không cần biết chi tiết lớp triển khai hàm đó như thế nào.
public class Client {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.greets();

        Cat cat = new Cat();
        cat.greets();
    }
}
