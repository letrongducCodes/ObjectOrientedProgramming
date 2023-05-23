package hus.oop.lab5.MyPoint;

public class MyPoint {
    private int x = 0;
    private int y = 0;

    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        int[] array = new int[2];
        array[0] = x;
        array[1] = y;
        return array;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public double distance(int x, int y) {
        return Math.sqrt((x - this.x) * (x - this.x) +
                (y - this.y) * (y - this.y));
    }

    public double distance(MyPoint another) {
        return Math.sqrt((another.x - this.x) * (another.x - this.x) +
                (another.y - this.y) * (another.y - this.y));
    }

    public double distance() {
        return Math.sqrt(x * x - y * y);
    }
}
