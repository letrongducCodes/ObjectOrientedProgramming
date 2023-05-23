package hus.oop.lab5.MyPointClass;

public class MyLine {
    private MyPoint begin;
    private MyPoint end;

    public MyLine(int x1, int y1, int x2, int y2) {
        begin.setXY(x1,y1);
        end.setXY(x2,y2);
    }

    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    public MyPoint getBegin() {
        return begin;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }

    public int getBeginX() {
        return begin.getX();
    }

    public void setBeginX(int x) {
        begin.setX(x);
    }

    public int getBeginY() {
        return begin.getY();
    }

    public void setBeginY(int y) {
        begin.setY(y);
    }

    public int getEndX() {
        return end.getX();
    }

    public void setEndX(int x) {
        end.setX(x);
    }

    public int getEndY() {
        return end.getY();
    }

    public void setEndY(int y) {
        end.setY(y);
    }

    public int[] getBeginXY() {
        int[] array = new int[2];
        array[0] = begin.getX();
        array[1] = begin.getY();
        return array;
    }

    public void setBeginXY(int x, int y) {
        this.begin.setXY(x,y);
    }

    public int[] getEndXY() {
        int[] array = new int[2];
        array[0] = end.getX();
        array[1] = end.getY();
        return array;
    }

    public void setEndXY(int x, int y) {
        this.end.setXY(x,y);
    }

    public double getLength() {
        return Math.sqrt((end.getX() - begin.getX()) *
                (end.getY() - begin.getY()));
    }

    public double getGradient() {
        return Math.atan2(this.getEndY() - this.getBeginY(),
                this.getEndX() - this.getBeginX());
    }

    @Override
    public String toString() {
        return "MyLine[begin = " + begin +
                ", end = " + end + ")";
    }
}
