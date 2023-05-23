package hus.oop.MidtermExam.Exercise2;

public class BisectionSolver implements RootSolver {
    private double tolerance;
    private int maxIterations;

    /**
     * Khởi tạo giá trị các tham số.
     * @param tolerance
     * @param maxIterations
     */
    public BisectionSolver(double tolerance, int maxIterations) {
        /* TODO */
        this.tolerance = tolerance;
        this.maxIterations = maxIterations;
    }

    /**
     * Tìm nghiệm của đa thức theo phương pháp chia đôi (Bisection)
     * @param polynomial
     * @param lower
     * @param upper
     * @return
     */
    @Override
    public double solve(Polynomial polynomial, double lower, double upper) {
        /* TODO */
        double c = 0;

        for (int i = 0; i < maxIterations; i++) {
            c = (lower + upper) / 2;

            if (Math.abs(f(polynomial,c)) < tolerance) {
                return c;
            }

            if (f(polynomial,c) * f(polynomial,lower) < 0) {
                upper = c;
            } else {
                lower = c;
            }
        }

        return c;
    }

    public static double f(Polynomial polynomial, double x) {
        return polynomial.evaluate(x); // Đa thức cần tìm nghiệm
    }
}
