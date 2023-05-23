package hus.oop.MidtermExam.Exercise1.inheritance;

// Tính kế thừa cho phép chúng ta cải tiến chương trình bằng cách kế thừa lại lớp cũ và phát triển những tính năng mới.
// Lớp con sẽ kế thừa tất cả những thành phần của lớp cha, nhờ sự chia sẻ này mới có thể mở rộng những đặc tính sẵn có
// mà không cần phải định nghĩa lại.

public class Client {
    public static void main(String[] args) {
        Employee Newperson = new Employee(1000.0);
        System.out.println("Newperson: " + Newperson);
        Programmer progammer = new Programmer(1000,150); //kế thừa salary và bonus
        System.out.println("Programmer: " + progammer);
    }
}
