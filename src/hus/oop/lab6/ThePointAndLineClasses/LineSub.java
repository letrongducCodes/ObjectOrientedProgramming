package hus.oop.lab6.ThePointAndLineClasses;

public class LineSub extends Point {
    Point end;

    public LineSub (int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY);
        this.end = new Point(endX, endY);
    }
    public LineSub (Point begin, Point end) {
        super(begin.getX(), begin.getY());
        this.end = end;
    }

    @Override
    public String toString() {
        return "LineSub(end = " + end + ")";
    }

    public Point getBegin() {
        Point point = new Point(super.getX(),super.getY());
        return point;
    }

    public Point getEnd() {
        return end;
    }

    public void setBegin(Point begin) {
        super.setXY(begin.getX(),begin.getY());
    }

    public void setEnd(Point end) {
        super.setXY(end.getX(),end.getY());
    }

    public int getBeginX() {
        return super.getX();
    }

    public int getBeginY() {
        return super.getY();
    }

    public int getEndX() {
        return end.getX();
    }

    public int getEndY() {
        return end.getY();
    }

    public void setBeginX() {
        super.setX(super.getX());
    }

    public void setBeginY() {
        super.setY(super.getY());
    }

    public void setBeginXY(Point beginXY) {
        super.setXY(beginXY.getX(),beginXY.getY());
    }

    public void setEndX(Point endX) {
        end.setX(endX.getX());
    }

    public void setEndY(Point endY) {
        end.setY(endY.getY());
    }

    public void setEndXY(Point endXY) {
        super.setXY(endXY.getX(),endXY.getY());
    }

    public int getLength() {
        double xDiff = super.getX() - end.getX();
        double yDiff = super.getY() - end.getY();
        return (int) Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public double getGradient() {
        double xDiff = super.getX() - end.getX();
        double yDiff = super.getY() - end.getY();
        return Math.atan2(yDiff,xDiff);
    }
}
