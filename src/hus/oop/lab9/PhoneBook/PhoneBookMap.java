package hus.oop.lab9.PhoneBook;

import java.util.HashMap;

public class PhoneBookMap implements PhoneBook {
    private HashMap<String, Student> phoneBook;

    public PhoneBookMap() {
        phoneBook = new HashMap<>();
    }

    public void addPerson(Student s) {
        phoneBook.put(s.getPhone(),s);
    }

    public Student searchByName(String name) {
        for (int i = 0; i < phoneBook.size(); i++) {
            if(phoneBook.values().stream().toList().get(i).getName().equals(name)) {
                return phoneBook.values().stream().toList().get(i);
            }
        }
        return null;
    }

    public Student searchByLastname(String lastname) {
        for (int i = 0; i < phoneBook.size(); i++) {
            if(phoneBook.values().stream().toList().get(i).getLastname().equals(lastname)) {
                return phoneBook.values().stream().toList().get(i);
            }
        }
        return null;
    }

    public Student searchByNumber(String phone) {
        return phoneBook.get(phone);
    }

    public void deleteByNumber(String phone) {
            phoneBook.remove(phone);
    }
}
