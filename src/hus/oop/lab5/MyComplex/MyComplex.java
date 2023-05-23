package hus.oop.lab5.MyComplex;

public class MyComplex {
    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex() {

    }
    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        return "(" + real + " + " + imag + "i)";
    }
    public boolean isReal() {
        if(imag == 0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean isImaginary() {
        if(real == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean equals(double real, double imag) {
        if(real == imag) {
            return true;
        } else {
            return false;
        }
    }

    public boolean equals(MyComplex another) {
        return (this.real == another.getReal() && this.imag == another.getImag());
    }

    public double magnitude() {
        return Math.sqrt(real * real + imag * imag);
    }

    public MyComplex addInto(MyComplex right) {
        this.real += right.real;
        this.imag += right.imag;
        return this;
    }

    public MyComplex addNew(MyComplex right) {
        MyComplex newComplex = new MyComplex(this.real + right.real,this.imag + right.imag);
        return newComplex;
    }

    public MyComplex substract(MyComplex right) {
        this.real -= right.real;
        this.imag -= right.imag;
        return this;
    }

    public MyComplex substractNew(MyComplex right) {
        MyComplex newComplex = new MyComplex(this.real - right.real,this.imag - right.imag);
        return newComplex;
    }

    public MyComplex multiply(MyComplex right) {
        MyComplex newComplex = new MyComplex(this.real * right.real - this.imag * right.imag,
                this.real * right.imag + this.imag * right.real);
        return newComplex;
    }

    public MyComplex divide(MyComplex right) {
        MyComplex newComplex = new MyComplex((this.real * right.real + this.imag * right.imag) /
                (right.real * right.real + right.imag * right.imag),
                (this.imag * right.real - this.real * right.imag) /
                (right.real * right.real + right.imag * right.imag));
        return newComplex;
    }

    public MyComplex conjugate() {
        MyComplex newComplex = new MyComplex(this.real,- this.imag);
        return newComplex;
    }
}
