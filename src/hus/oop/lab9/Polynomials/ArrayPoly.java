package hus.oop.lab9.Polynomials;

public class ArrayPoly extends AbstractPoly {
    private final double[] coefficients;

    public ArrayPoly(double[] coefficients) {
        this.coefficients = coefficients;
    }

    @Override
    public int degree() {
        int degree = coefficients.length - 1;
        for (int i = coefficients.length - 1; i > 0 ; i--) {
            if (coefficients[i] == 0) {
                degree--;
            } else {
                break;
            }
        }
        return degree;
    }

    @Override
    public Poly derivative() {
        double[] derivativeCoefficients = derive();
        return new ArrayPoly(derivativeCoefficients);
    }

    @Override
    public double coefficient(int degree) {
        if (degree < 0 || degree >= coefficients.length) {
            return 0;
        }
        return coefficients[degree];
    }

    @Override
    public double[] coefficients() {
        double[] polyCoeffs = coefficients;
        return polyCoeffs;
    }
}
