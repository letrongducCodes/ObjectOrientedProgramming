package hus.oop.lab9.Polynomials;

import java.util.LinkedList;

public class ListPoly extends AbstractPoly {
    private LinkedList<Double> coefficients = new LinkedList<>();

    public ListPoly(double[] coeffs) {
        for (int i = 0 ; i < coeffs.length; i++) {
            this.coefficients.add(coeffs[i]);
        }
    }

    @Override
    public int degree() {
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

    @Override
    public Poly derivative() {
        double[] derivativeCoefs = super.derive();
        return new ListPoly(derivativeCoefs);
    }

    @Override
    public double coefficient(int degree) {
        if (degree < 0 || degree >= coefficients.size()) {
            return 0;
        }
        return coefficients.get(degree);
    }

    @Override
    public double[] coefficients() {
        double[] polyCoeffs = new double[coefficients.size()];
        for (int i = 0 ; i < polyCoeffs.length ; i++) {
            polyCoeffs[i] = coefficients.get(i);
        }
        return polyCoeffs;
    }
}
