package DesignPatterns.TemplateMethodPattern;

public class TemplateMethodPatternDemo {
    public static void main(String[] args) {
        PageTemplate homePage = new HomePage();
        homePage.showPage();

        System.out.println();
        PageTemplate detailPage = new DetailPage();
        detailPage.showPage();

        System.out.println();
        PageTemplate contactPage = new ContactPage();
        contactPage.showPage();
    }
}
