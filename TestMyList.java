package hus.oop.MidtermExam.Exercise3;

import java.util.ArrayList;
import java.util.List;

public class TestMyList {
    public static void main(String[] args) {
        /*
         TODO

         - Chạy demo các hàm test.
         - Lưu kết quả chạy chương trình vào file text có tên <Ten_MaSinhVien_MyList>.txt
           (ví dụ, NguyenVanA_123456_MyList.txt)
         - Nộp kết quả chạy chương trình (file text trên) cùng với các file source code.
         */
        testMyArrayList();
        testMyLinkedList();
    }

    public static void testMyArrayList() {
        /*
         TODO

         - Tạo ra một list kiểu MyArrayList có ít nhất 10 Book.

         - Sử dụng BookManager để
             + Sắp xếp và in ra danh sách các Book theo thứ tự tăng dần theo title.
             + Sắp xếp và in ra danh sách các Book theo thứ tự giảm dần theo title.
             + Sắp xếp và in ra danh sách các Book theo thứ tự tăng dần theo số trang.
             + Sắp xếp và in ra danh sách các Book theo thứ tự giảm dần theo số trang.
         */
        Book book1 = new Book("Muôn kiếp nhân sinh",2019,200);
        Book book2 = new Book("Data Structures Algorithms",2014,500);
        Book book3 = new Book("Hành trình về phương Đông",2015,150);
        Book book4 = new Book("Ám ảnh từ kiếp trước",2018,300);
        Book book5 = new Book("Để có một tương lai",2008,160);
        Book book6 = new Book("Bước tới thảnh thơi",2000,600);
        Book book7 = new Book("Trang tử tinh hoa",1984,180);
        Book book8 = new Book("Oshi No Ko",2023,1000);
        Book book9 = new Book("Từ bi",2004,860);
        Book book10 = new Book("Suối nguồn tâm linh",1976,900);
        List<Book> list = new ArrayList<>();
        list.add(book1);
        list.add(book2);
        list.add(book3);
        list.add(book4);
        list.add(book5);
        list.add(book6);
        list.add(book7);
        list.add(book8);
        list.add(book9);
        list.add(book10);
//        BookManager bookManager = new BookManager(list);
//        bookManager.sortByTitle(true);
//        System.out.println(bookManager);
//        bookManager.sortByTitle(false);
//        System.out.println(bookManager);
//        bookManager.sortByPageNumber(true);
//        System.out.println(bookManager);
//        bookManager.sortByPageNumber(false);
//        System.out.println(bookManager);
    }

    public static void testMyLinkedList() {
        /*
         TODO

         - Tạo ra một list kiểu MyLinkedList có ít nhất 10 Book.

         - Sử dụng BookManager để
             + Sắp xếp và in ra danh sách các Book theo thứ tự tăng dần theo tên sách.
             + Sắp xếp và in ra danh sách các Book theo thứ tự giảm dần theo tên sách.
             + Sắp xếp và in ra danh sách các Book theo thứ tự tăng dần theo số trang.
             + Sắp xếp và in ra danh sách các Book theo thứ tự giảm dần theo số trang.
         */
    }

    public static void testIterator(MyList myList) {
        /*
         TODO

         Sử dụng iterator duyệt qua tất cả các phần tử trong danh sách myList và in ra thông tin về phần tử đó.
         */
    }
}
