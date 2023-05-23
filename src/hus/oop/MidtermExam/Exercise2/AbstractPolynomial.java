package hus.oop.MidtermExam.Exercise2;

public abstract class AbstractPolynomial implements Polynomial {
    /**
     * Mô tả đa thức theo định dạng [a0 + a1x + a2x^2 + ... + anx^n]
     * @return String mô tả về đa thức.
     */
    @Override
    public String toString() {
        /* TODO */
        StringBuilder result = new StringBuilder();
        for (int i = 0 ; i < coefficients().length - 1; i++) {
            result.append(coefficients()[i])
                    .append("x^")
                    .append(i)
                    .append(" + ");
        }
        result.append(coefficients()[coefficients().length - 1])
                .append("x^")
                .append(coefficients().length - 1);
        return result.toString();
    }

    /**
     * Lấy đạo hàm đa thức.
     * @return mảng các phần tử là hệ số của đa thức đạo hàm.
     */
    public double[] differentiate() {
        /* TODO */
        double[] polyCoefs = this.coefficients();
        int polyDegree = this.degree();
        double[] derivativeCoefs = new double[polyDegree];
        for (int i = 0; i < polyDegree; i++) {
            derivativeCoefs[i] = polyCoefs[i + 1] * (i + 1);
        }
        return derivativeCoefs;
    }
}
