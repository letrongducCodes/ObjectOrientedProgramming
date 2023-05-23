package hus.oop.MidtermExam.Exercise2;

public class NewtonRaphsonSolver implements RootSolver {
    private double tolerance;
    private int maxIterations;

    /**
     * Khởi tạo giá trị các tham số.
     * @param tolerance
     * @param maxIterations
     */
    public NewtonRaphsonSolver(double tolerance, int maxIterations) {
        /* TODO */
        this.tolerance = tolerance;
        this.maxIterations = maxIterations;
    }

    /**
     * Tìm nghiệm của đa thức sử dụng phương pháp Newton-Raphson.
     * @param polynomial
     * @param lower
     * @param upper
     * @return nghiệm của đa thức.
     */
    @Override
    public double solve(Polynomial polynomial, double lower, double upper) {
        /* TODO */
        int i = 0;
        double x1, fx0, fdx0;
        double x0 = (upper + lower) / 2;
        Polynomial dPoly = polynomial.derivative();
        do {
            fx0 = polynomial.evaluate(x0);
            fdx0 = dPoly.evaluate(x0);
            x1 = x0 - fx0 / fdx0;

            if (x1 < lower || x1 > upper) {
                x0 = (upper + lower) / 2;
            } else {
                x0 = x1;
            }

            i++;
        } while (Math.abs(upper - lower) > this.tolerance && i < this.maxIterations);

        return x0;
    }
}
