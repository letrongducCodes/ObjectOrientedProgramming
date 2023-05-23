package hus.oop.MidtermExam.Exercise3;

public class PageComparison implements BookComparator{
    @Override
    public int compare(Book left, Book right) {
        if (left.getPages() - right.getPages() > 0) {
            return 1;
        }
        if(left.getPages() - right.getPages() == 0) {
            return 0;
        } else {
            return -1;
        }
    }
}
