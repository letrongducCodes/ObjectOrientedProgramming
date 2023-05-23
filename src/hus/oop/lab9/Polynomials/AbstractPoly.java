package hus.oop.lab9.Polynomials;

import java.util.Objects;

public abstract class AbstractPoly implements Poly {
    double[] derive() {
        double[] polyCoefs = this.coefficients();
        int polyDegree = this.degree();
        double[] derivativeCoefs = new double[polyDegree];
        for (int i = 0; i < polyDegree; i++) {
            derivativeCoefs[i] = polyCoefs[i + 1] * (i + 1);
        }
        return derivativeCoefs;
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Poly)) {
            return false;
        }
        Poly p = (Poly) o;
        if ( this.coefficients().length != p.coefficients().length) {
            return false;
        }

        for (int i = 0; i < this.coefficients().length; i++) {
            if (this.coefficients()[i] != p.coefficients()[i]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(coefficients());
    }

    @Override
    public String toString() {
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
}
