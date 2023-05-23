package hus.oop.MidtermExam.Exercise2;

public class SecantSolver implements RootSolver {
    private double tolerance;
    private int maxIterations;

    /**
     * Khởi tạo giá trị các tham số.
     * @param tolerance
     * @param maxIterations
     */
    public SecantSolver(double tolerance, int maxIterations) {
        /* TODO */
        this.tolerance = tolerance;
        this.maxIterations = maxIterations;
    }

    /**
     * Tìm nghiệm của đa thức theo phương pháp Secant
     * @param polynomial
     * @param lower
     * @param upper
     * @return nghiệm của đa thức trong khoảng [lower, upper]
     */
    @Override
    public double solve(Polynomial polynomial, double lower, double upper) {
        /* TODO */
        double fx0 = f(polynomial,lower);
        double fx1 = f(polynomial,upper);
        double x2 = 0;

        for (int i = 0; i < maxIterations; i++) {
            if (Math.abs(fx1) < tolerance) {
                return upper;
            }

            x2 = upper - ((fx1 * (upper - lower)) / (fx1 - fx0));
            fx0 = fx1;
            fx1 = f(polynomial,x2);
            lower = upper;
            upper = x2;
        }

        return x2;
    }

    public static double f(Polynomial polynomial, double x) {
        return polynomial.evaluate(x); // Đa thức cần tìm nghiệm
    }
}
