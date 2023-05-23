package hus.oop.lab5.MyPointClass;

public class MyCircle {
    private MyPoint center;
    private int radius = 1;

    public MyCircle() {
    }

    public MyCircle(int x, int y, int radius) {
        center = new MyPoint(x,y);
        this.radius = radius;
    }

    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getCenterX() {
        return center.getX();
    }

    public void setCenterX(MyPoint center) {

    }

    public int getCenterY() {
        return center.getY();
    }

    public void setCenterY(MyPoint center) {

    }

    public int[] getCenterXY() {
        int[] array = new int[2];
        array[0] = center.getX();
        array[1] = center.getY();
        return array;
    }

    public void setCenterXY(int x, int y) {

    }

    public String toString() {
        return "MyCircle[radius = " + radius + ", center = "
                + center + "]";
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2.0 * Math.PI * radius;
    }

    public double distance(MyCircle another) {
        return center.distance(another.center);
    }
}
