package hus.oop.MidtermExam.Exercise1.encapsulation;

// Tính đóng gới nhằm bảo vệ đối tượng không bị truy cập từ code ngoài để thay thế giá trị các thuộc tính, và chỉ có sự
// cho phép của người viết ra lớp thì mới được truy cập thông qua hàm dựng. Tính chất đảm bảo sự bảo mật, toàn vẹn của
// đối tượng.
public class Client {
    public static void main(String[] args) {
        Zoo tiger = new Zoo("Kai","Tiger");
        System.out.println(tiger);
        tiger.setName("Bruce");
        System.out.println(tiger);
    }
}
