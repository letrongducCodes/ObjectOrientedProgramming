package hus.oop.MidtermExam.Exercise2;

import java.util.*;

public class ArrayPolynomial extends AbstractPolynomial {
    private static final int DEFAULT_CAPACITY = 2;
    private double[] coefficents;
    private int size;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public ArrayPolynomial() {
        coefficents = new double[DEFAULT_CAPACITY];
        coefficents[0] = 0;
        coefficents[1] = 0;
        size = 0;
    }

    /**
     * Lấy hệ số của đa thức tại phần tử index
     * @return hệ số tại phần tử index.
     */
    @Override
    public double coefficient(int index) {
        return coefficents[index];
    }

    /**
     * Lấy mảng các hệ số của đa thức.
     * @return mảng các hệ số của đa thức.
     */
    @Override
    public double[] coefficients() {
        return coefficents;
    }

    /**
     * Thêm một phần tử có hệ số coefficient vào cuối đa thức.
     * @param coefficient
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial append(double coefficient) {
        if (this.size >= coefficents.length - 1) {
            enlarge();
        }
        coefficents[size] = coefficient;
        size++;
        return this;
    }

    /**
     * Thêm một phần tử có hệ số coefficient vào vị trí index.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial insert(double coefficient, int index) {
        if (this.size >= coefficents.length - 1) {
            enlarge();
        }
        for (int i = size; i > index ; i--) {
            coefficents[i] = coefficents[i - 1];
        }
        coefficents[index] = coefficient;
        this.size++;
        return this;
    }

    /**
     * Thay đổi hệ số của đa thức tại phần tử index.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial set(double coefficient, int index) {
        coefficents[index] = coefficient;
        return null;
    }

    /**
     * Lấy bậc của đa thức.
     * @return bậc của đa thức.
     */
    @Override
    public int degree() {
        int degree = coefficients().length - 1;
        for (int i = coefficients().length - 1; i > 0 ; i--) {
            if (coefficients()[i] == 0) {
                degree--;
            } else {
                break;
            }
        }
        return degree;
    }

    /**
     * Tính giá trị của đa thức khi biết giá trị của x.
     * @return giá trị của đa thức.
     */
    @Override
    public double evaluate(double x) {
        double evaluate = 0;
        for (int i = coefficients().length - 1 ; i >= 0; i--) {
            evaluate = evaluate * x + coefficients()[i];
        }
        return evaluate;
    }

    /**
     * Lấy đạo hàm của đa thức.
     * @return Đa thức kiểu ArrayPolynomial là đa thức đạo hàm của đa thức hiện tại.
     */
    @Override
    public Polynomial derivative() {
        /* TODO */
        double[] derivativeCoefs = super.differentiate();
        ArrayPolynomial result = new ArrayPolynomial();
        for (int i = 0 ; i < derivativeCoefs.length; i++) {
            result.append(derivativeCoefs[i]);
        }
        return result;
    }

    /**
     * Cộng một đa thức khác vào đa thức hiện tại.
     * @param another
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial plus(ArrayPolynomial another) {
        int maxDegree = Math.max(this.degree(), another.degree());
        int minDegree = Math.min(this.degree(), another.degree());
        ArrayPolynomial newCoeffs = new ArrayPolynomial();
        for (int i = 0; i <= minDegree ; i++) {
            newCoeffs.append(this.coefficients()[i] + another.coefficients()[i]);
        }

        if (this.degree() > another.degree()) {
            for (int i = minDegree + 1; i <= maxDegree ; i++) {
                newCoeffs.append(this.coefficients()[i]);
            }
        }

        if (this.degree() < another.degree()) {
            for (int i = minDegree + 1; i <= maxDegree ; i++) {
                newCoeffs.append(another.coefficients()[i]);
            }
        }
        return newCoeffs;
    }

    /**
     * Trừ đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial minus(ArrayPolynomial another) {
        int maxDegree = Math.max(this.degree(), another.degree());
        int minDegree = Math.min(this.degree(), another.degree());
        ArrayPolynomial newCoeffs = new ArrayPolynomial();
        for (int i = 0; i <= minDegree ; i++) {
            newCoeffs.append(this.coefficients()[i] - another.coefficients()[i]);
        }

        if (this.degree() > another.degree()) {
            for (int i = minDegree + 1; i <= maxDegree ; i++) {
                newCoeffs.append(this.coefficients()[i]);
            }
        }

        if (this.degree() < another.degree()) {
            for (int i = minDegree + 1; i <= maxDegree ; i++) {
                newCoeffs.append(- another.coefficients()[i]);
            }
        }
        return newCoeffs;
    }

    /**
     * Nhân đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial multiply(ArrayPolynomial another) {
        double[] newCoeffs = new double[this.degree() + another.degree() + 1];
        for (int i = 0; i <= this.degree(); i++) {
            for (int j = 0 ; j <= another.degree() ; j++) {
                newCoeffs[i + j] += this.coefficients()[i] * another.coefficients()[j];
            }
        }
        ArrayPolynomial result = new ArrayPolynomial();
        for (int i = 0 ; i < newCoeffs.length; i++) {
            result.append(newCoeffs[i]);
        }
        return result;
    }

    /**
     * Thêm kích thước để lưu đa thức khi cần thiết.
     */
    private void enlarge() {
        double[] tmp = new double[coefficents.length * 2];
        System.arraycopy(coefficents,0, tmp,0,coefficents.length);
        coefficents = tmp;
    }
}