package hus.oop.MidtermExam.Exercise3;

import java.util.ArrayList;

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
        testIterator(books());
    }

    public static MyList books() {
        Book book1 = new Book("Head First Design Patterns",2020,681);
        Book book2 = new Book("Learn Java The Hard Way",2016,309);
        Book book3 = new Book("Big Java - Early Objects",2019,1444);
        Book book4 = new Book("The Java Language Specification - Java SE 8 Edition",2015,782);
        Book book5 = new Book("To Kill a Mockingbird",1960,281);
        Book book6 = new Book("Pride and Prejudice",1813,432);
        Book book7 = new Book("The Great Gatsby",1925,180);
        Book book8 = new Book("The Lord of the Rings",1955,1178);
        Book book9 = new Book("Harry Potter and the Philosopher's Stone",1997,223);
        Book book10 = new Book("1984",1949,328);
        MyLinkedList books = new MyLinkedList();
        books.append(book1);
        books.append(book2);
        books.append(book3);
        books.append(book4);
        books.append(book5);
        books.append(book6);
        books.append(book7);
        books.append(book8);
        books.append(book9);
        books.append(book10);
        return books;
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
        Book book1 = new Book("Head First Design Patterns",2020,681);
        Book book2 = new Book("Learn Java The Hard Way",2016,309);
        Book book3 = new Book("Big Java - Early Objects",2019,1444);
        Book book4 = new Book("The Java Language Specification - Java SE 8 Edition",2015,782);
        Book book5 = new Book("To Kill a Mockingbird",1960,281);
        Book book6 = new Book("Pride and Prejudice",1813,432);
        Book book7 = new Book("The Great Gatsby",1925,180);
        Book book8 = new Book("The Lord of the Rings",1955,1178);
        Book book9 = new Book("Harry Potter and the Philosopher's Stone",1997,223);
        Book book10 = new Book("1984",1949,328);
        MyList books = new MyArrayList();
        books.append(book1);
        books.append(book2);
        books.append(book3);
        books.append(book4);
        books.append(book5);
        books.append(book6);
        books.append(book7);
        books.append(book8);
        books.append(book9);
        books.append(book10);
        BookManager bookManager = new BookManager(books);
        System.out.println(bookManager.sortByTitle(true));
        System.out.println();
        System.out.println(bookManager.sortByTitle(false));
        System.out.println();
        System.out.println(bookManager.sortByPageNumber(true));
        System.out.println();
        System.out.println(bookManager.sortByPageNumber(false));
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
        Book book1 = new Book("Head First Design Patterns",2020,681);
        Book book2 = new Book("Learn Java The Hard Way",2016,309);
        Book book3 = new Book("Big Java - Early Objects",2019,1444);
        Book book4 = new Book("The Java Language Specification - Java SE 8 Edition",2015,782);
        Book book5 = new Book("To Kill a Mockingbird",1960,281);
        Book book6 = new Book("Pride and Prejudice",1813,432);
        Book book7 = new Book("The Great Gatsby",1925,180);
        Book book8 = new Book("The Lord of the Rings",1955,1178);
        Book book9 = new Book("Harry Potter and the Philosopher's Stone",1997,223);
        Book book10 = new Book("1984",1949,328);
        MyLinkedList books = new MyLinkedList();
        books.append(book1);
        books.append(book2);
        books.append(book3);
        books.append(book4);
        books.append(book5);
        books.append(book6);
        books.append(book7);
        books.append(book8);
        books.append(book9);
        books.append(book10);
        BookManager bookManager = new BookManager(books);
        System.out.println(bookManager.sortByTitle(true));
        System.out.println();
        System.out.println(bookManager.sortByTitle(false));
        System.out.println();
        System.out.println(bookManager.sortByPageNumber(true));
        System.out.println();
        System.out.println(bookManager.sortByPageNumber(false));
    }

    public static void testIterator(MyList myList) {
        /*
         TODO

         Sử dụng iterator duyệt qua tất cả các phần tử trong danh sách myList và in ra thông tin về phần tử đó.
         */
        MyIterator myIterator = new MyArrayListIterator(new Object[]{myList});
        System.out.println(myIterator);
    }
}
