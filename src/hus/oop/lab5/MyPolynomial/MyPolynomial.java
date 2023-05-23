package hus.oop.lab5.MyPolynomial;

import java.util.Arrays;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double[] coeffs) {
        this.coeffs = coeffs;
    }

    public double[] getCoeffs() {
        return coeffs;
    }

    public void setCoeffs(double[] coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        return this.coeffs.length - 1;
    }

    public MyPolynomial add(MyPolynomial right) {
        int maxDegree = Math.max(this.getDegree(), right.getDegree());
        int minDegree = Math.min(this.getDegree(), right.getDegree());
        double[] newCoeffs = new double[maxDegree + 1];
        for (int i = 0; i < minDegree; i++) {
            newCoeffs[i] = this.coeffs[i] + right.coeffs[i];
        }
        if (this.getDegree() > right.getDegree()) {
            for (int i = minDegree; i <= maxDegree; i++) {
                newCoeffs[i] = this.coeffs[i];
            }
        }
        if(this.getDegree() < right.getDegree()) {
            for (int i = minDegree; i <= maxDegree; i++) {
                newCoeffs[i] = right.getDegree();
            }
        }
        this.setCoeffs(newCoeffs);
        return new MyPolynomial((newCoeffs));
    }

    public MyPolynomial multiply(MyPolynomial right) {
        double[] newCoeffs = new double[this.getDegree() + right.getDegree() + 1];
        for (int i = 0; i < this.coeffs.length; i++) {
            for (int j = 0; j < right.coeffs.length; j++) {
                newCoeffs[i + j] += this.coeffs[i] * right.coeffs[j];
            }
        }
        return new MyPolynomial(newCoeffs);
    }

    public double evaluate(double x0) {
        double result = this.coeffs[this.coeffs.length - 1];
        for (int i = this.coeffs.length - 2; i >= 0; i--) {
            result = result * x0 + this.coeffs[i];
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = this.coeffs.length - 1; i > 0; i--) {
            result.append(this.coeffs[i])
                    .append("x^")
                    .append(i)
                    .append(" + ");
        }
        result.append(this.coeffs[0]);
        return result.toString();
    }
}
