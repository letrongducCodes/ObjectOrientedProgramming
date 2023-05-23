package hus.oop.lab9.PhoneBook;

public class TestApp {
    public static void main(String[] args) {
        PhoneBook pb = new PhoneBookMap();

        // Comment this line for switching implementation
        // PhoneBook pb = new PhoneBookArray();
        pb.addPerson(new Student("Nicola","Bicocchi","34567"));
        pb.addPerson(new Student("Marco","Rizzo","45243"));
        pb.addPerson(new Student("Luisa","Poppi","24564"));

        System.out.println(pb.searchByName("Marco"));
        System.out.println(pb.searchByLastname("Poppi"));

        // Do not exist!
        System.out.println(pb.searchByNumber("1111"));

        // Delete an element!
        pb.deleteByNumber("24564");
        System.out.println(pb.searchByLastname("Poppi"));

        PhoneBook pb1 = new PhoneBookList();

        // Comment this line for switching implementation
        // PhoneBook pb = new PhoneBookArray();
        pb1.addPerson(new Student("Nicola","Bicocchi","34567"));
        pb1.addPerson(new Student("Marco","Rizzo","45243"));
        pb1.addPerson(new Student("Luisa","Poppi","24564"));

        System.out.println(pb1.searchByName("Marco"));
        System.out.println(pb1.searchByLastname("Poppi"));

        // Do not exist!
        System.out.println(pb1.searchByNumber("1111"));

        // Delete an element!
        pb1.deleteByNumber("24564");
        System.out.println(pb1.searchByLastname("Poppi"));
    }
}
