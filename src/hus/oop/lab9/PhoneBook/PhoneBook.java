package hus.oop.lab9.PhoneBook;

public interface PhoneBook {
    void addPerson(Student p);
    Student searchByName(String name);
    Student searchByLastname(String lastname);
    Student searchByNumber(String phone);
    void deleteByNumber(String phone);
}
