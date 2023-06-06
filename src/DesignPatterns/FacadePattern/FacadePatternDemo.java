package DesignPatterns.FacadePattern;

public class FacadePatternDemo {
    public static void main(String[] args) {
        PersonFacade person = new PersonFacade();
        person.setInformation();
        person.display();
    }
}
