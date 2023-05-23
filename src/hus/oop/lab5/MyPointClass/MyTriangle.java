package hus.oop.lab5.MyPointClass;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        v1.getXY(x1,y1);
        v2.getXY(x2,y2);
        v3.getXY(x3,y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString() {
        return "MyTriangle[" +  "v1 = " + v1 + ", v2 = " + v2 +
                ", v3 = " + v3 + ']';
    }

    public double getPerimeter() {
        return 2.0 * Math.PI;
    }

    public String getType() {
        return "x";
    }
}
