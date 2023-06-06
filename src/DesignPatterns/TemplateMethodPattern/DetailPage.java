package DesignPatterns.TemplateMethodPattern;

public class DetailPage extends PageTemplate {

    @Override
    protected void showBody() {
        System.out.println("Content of detail");
    }
}
