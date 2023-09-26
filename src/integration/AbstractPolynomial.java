package integration;

public abstract class AbstractPolynomial implements Polynomial {
    /**
     * Mô tả đa thức theo định dạng [a0 + a1x + a2x^2 + ... + anx^n]
     * @return String mô tả về đa thức.
     */
    @Override
    public String toString() {
        /* TODO */
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < degree() + 1; i++) {
            double coefficient = coefficient(i);
            if (coefficient == 0) {
                continue;
            }
            if (i == 0) {
                sb.append(String.format("%.2f", coefficient));
            } else if (i == 1) {
                sb.append(String.format(" + %.2fx", coefficient));
            } else {
                sb.append(String.format(" + %.2fx^%d", coefficient, i));
            }
        }
        return sb.toString();
    }

    /**
     * Lấy đạo hàm đa thức.
     * @return mảng các phần tử là hệ số của đa thức đạo hàm.
     */
    public double[] differentiate() {
        /* TODO */
        double[] coefficients = new double[degree()];
        for (int i = 1; i < degree() + 1; i++) {
            coefficients[i - 1] = coefficient(i) * i;
        }
        return coefficients;
    }
}
