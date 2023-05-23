package hus.oop.MidtermExam.Exercise3;

public class PageComparison implements BookComparator{
    @Override
    public int compare(Book left, Book right) {
        return left.getPages() - right.getPages();
    }
}
