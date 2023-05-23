package hus.oop.MidtermExam.Exercise2;

import java.util.ArrayList;
import java.util.List;

public class ListPolynomial extends AbstractPolynomial {
    private List<Double> coefficients;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public ListPolynomial() {
        /* TODO */
        coefficients = new ArrayList<>();
    }

    public ListPolynomial(List<Double> coefficients) {
        this.coefficients = new ArrayList<>(coefficients);
    }

    /**
     * Lấy hệ số của đa thức tại vị trí index.
     * @return
     */
    @Override
    public double coefficient(int index) {
        /* TODO */
        if (index < 0 || index >= coefficients.size()) {
            throw new IllegalArgumentException("Index out of bounds");
        }
        return coefficients.get(index);
    }

    /**
     * Lấy các hệ số của đa thức.
     * @return
     */
    @Override
    public double[] coefficients() {
        /* TODO */
        double[] coeffs = new double[coefficients.size()];
        for (int i = 0; i < coefficients.size(); i++) {
            coeffs[i] = coefficients.get(i);
        }
        return coeffs;
    }

    /**
     * Thêm phần tử có hệ số coefficient vào cuối đa thức hiện tại.
     * @param coefficient
     * @return đa thức hiện tại.
     */
    public ListPolynomial append(double coefficient) {
        /* TODO */
        coefficients.add(coefficient);
        return this;
    }

    /**
     * Thêm phần tử có hệ số coefficient vào vị trí index.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public ListPolynomial insert(double coefficient, int index) {
        /* TODO */
        coefficients.add(index,coefficient);
        return this;
    }

    /**
     * Sửa hệ số của phần tử index là coefficient.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public ListPolynomial set(double coefficient, int index) {
        /* TODO */
        coefficients.set(index,coefficient);
        return this;
    }

    /**
     * Lấy ra bậc của đa thức.
     * @return
     */
    @Override
    public int degree() {
        /* TODO */
        int degree = coefficients.size() - 1;
        for (int i = coefficients.size() - 1; i > 0 ; i--) {
            if (coefficients.get(i) == 0) {
                degree--;
            } else {
                break;
            }
        }
        return degree;
    }

    /**
     * Tính giá trị của đa thức khi biết giá trị của x.
     * @return
     */
    @Override
    public double evaluate(double x) {
        /* TODO */
        double result = this.coefficients.get(this.coefficients.size() - 1);
        for (int i = this.coefficients.size() - 2; i >= 0; i--) {
            result = result * x + this.coefficients.get(i);
        }
        return result;
    }

    /**
     * Lấy đạo hàm của đa thức.
     * @return Đa thức kiểu ListPolynomial là đa thức đạo hàm của đa thức ban đầu.
     */
    @Override
    public Polynomial derivative() {
        /* TODO */
        List<Double> derivCoeffs = new ArrayList<>();

        for (int i = 1; i < coefficients.size(); i++) {
            double coef = coefficients.get(i);
            double derivCoef = coef * i;
            derivCoeffs.add(derivCoef);
        }

        return new ListPolynomial(derivCoeffs);
    }

    /**
     * Cộng đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ListPolynomial plus(ListPolynomial another) {
        /* TODO */
        List<Double> sumCoeffs = new ArrayList<>();
        int maxDegree = Math.max(coefficients.size(), another.coefficients.size());
        for (int i = 0; i < maxDegree; i++) {
            double coef1 = (i < coefficients.size()) ? coefficients.get(i) : 0.0;
            double coef2 = (i < another.coefficients.size()) ? another.coefficients.get(i) : 0.0;
            sumCoeffs.add(coef1 + coef2);
        }
        return new ListPolynomial(sumCoeffs);
    }

    /**
     * Trừ đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ListPolynomial minus(ListPolynomial another) {
        /* TODO */
        List<Double> sumCoeffs = new ArrayList<>();
        int maxDegree = Math.max(coefficients.size(), another.coefficients.size());
        for (int i = 0; i < maxDegree; i++) {
            double coef1 = (i < coefficients.size()) ? coefficients.get(i) : 0.0;
            double coef2 = (i < another.coefficients.size()) ? another.coefficients.get(i) : 0.0;
            sumCoeffs.add(coef1 - coef2);
        }
        return new ListPolynomial(sumCoeffs);
    }

    /**
     * Nhân đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ListPolynomial multiply(ListPolynomial another) {
        /* TODO */
        List<Double> productCoeffs = new ArrayList<>();
        int maxDegree = coefficients.size() + another.coefficients.size() - 1;
        for (int i = 0; i < maxDegree; i++) {
            double coef = 0.0;
            for (int j = 0; j <= i; j++) {
                if (j < coefficients.size() && (i - j) < another.coefficients.size()) {
                    coef += coefficients.get(j) * another.coefficients.get(i - j);
                }
            }
            productCoeffs.add(coef);
        }
        return new ListPolynomial(productCoeffs);
    }
}
