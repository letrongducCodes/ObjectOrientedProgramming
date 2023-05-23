package hus.oop.lab5.MyPointClass;

public class MyPoint {
    private int x;
    private int y;

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

    public int[] getXY(int x1, int y1) {
        int[] array = new int[2];
        array[0] = x;
        array[1] = y;
        return array;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public double distance(MyPoint center) {
        return Math.sqrt((center.x - this.x) * (center.x - this.x) +
                (center.y - this.y) * (center.y - this.y));
    }
}
