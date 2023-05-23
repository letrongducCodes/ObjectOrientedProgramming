package hus.oop.lab6.ThePointAndLineClasses;

public class Line {
    private Point begin;
    private Point end;

    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public Line(int beginX, int beginY, int endX, int endY) {
        begin = new Point(beginX,beginY);
        end = new Point(endX,endY);
    }

    @Override
    public String toString() {
        return "Line(" + begin + "," + end + ")";
    }

    public Point getBegin() {
        return begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public int getBeginX() {
        return begin.getX();
    }

    public int getBeginY() {
        return begin.getY();
    }

    public int getEndX() {
        return end.getX();
    }

    public int getEndY() {
        return end.getY();
    }

    public void setBeginX(Point begin, int x) {
        begin.setX(x);
    }

    public void setBeginY(Point begin, int y) {
        begin.setY(y);
    }

    public void setBeginXY(Point begin, int x, int y) {
        begin.setXY(x,y);
    }

    public void setEndX(Point end, int x) {
        end.setX(x);
    }

    public void setEndY(Point end, int y) {
        end.setY(y);
    }

    public void setEndXY(Point end, int x, int y) {
        end.setXY(x,y);
    }

    public int getLength() {
        double xDiff = begin.getX() - end.getX();
        double yDiff = begin.getY() - end.getY();
        return (int) Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public double getGradient() {
        double xDiff = begin.getX() - end.getX();
        double yDiff = begin.getY() - end.getY();
        return Math.atan2(yDiff,xDiff);
    }
}
