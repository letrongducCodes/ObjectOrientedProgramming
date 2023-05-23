package hus.oop.lab5.AuthorAndBookAgain;

public class TestBook {
    public static void main(String[] args) {
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');
        System.out.println(authors);
        Book dummyBook = new Book("Java for dummy", authors, 19.95, 99);
        System.out.println(dummyBook);
        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);
        System.out.println("name is: " + dummyBook.getName());
        System.out.println("price is: " + dummyBook.getPrice());
        System.out.println("qty is: " + dummyBook.getQty());
        System.out.println("Author is: " + dummyBook.getAuthors());
        System.out.println("Author's name is: " + dummyBook.getAuthorNames());
        System.out.println("Author's email is: " + dummyBook.getAuthorEmails());
        Book anotherBook = new Book("more Java",authors, 29.95);
        System.out.println(anotherBook);
    }
}
