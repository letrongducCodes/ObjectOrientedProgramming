package integration;

public class SimpsonRule implements Integrator {
    private double precision;
    private int maxIterations;

    public SimpsonRule(double precision, int maxIterations) {
        /* TODO */
        this.precision = precision;
        this.maxIterations = maxIterations;
    }

    /**
     * Phương thức tính xấp xỉ giá trị tích phân. Giá trị xấp xỉ được chấp nhận nếu phép tính đạt độ chính xác đã cho,
     * hoặc có số vòng vượt quá ngưỡng quy định.
     * Độ chính xác được xác định như sau, chọn n0 tùy ý, sau đó tính I_n với n = n0, 2n0, 4n0, ...
     * Việc tính toán dừng lại khi |I_2n - In|/3 < eps (precision), hoặc số lần chia đôi vượt quá ngưỡng quy định (maxIterations).
     * @param poly
     * @param lower
     * @param upper
     * @return
     */
    @Override
    public double integrate(Polynomial poly, double lower, double upper) {
        /* TODO */
        int n = 2; // số lượng khoảng phân hoạch đều ban đầu
        double I_n = integrate(poly, lower, upper, n); // tính giá trị xấp xỉ với số lượng khoảng phân hoạch đều ban đầu
        double I_2n = integrate(poly, lower, upper, 2*n); // tính giá trị xấp xỉ với số lượng khoảng phân hoạch đều gấp đôi
        int iterations = 0; // số lần tính toán
        while (iterations < maxIterations && Math.abs(I_2n - I_n)/3 >= precision) { // kiểm tra độ chính xác và số lần tính toán
            n *= 2; // tăng số lượng khoảng phân hoạch đều lên gấp đôi
            I_n = I_2n; // cập nhật giá trị xấp xỉ cũ
            I_2n = integrate(poly, lower, upper, 2*n); // tính giá trị xấp xỉ mới
            iterations++; // tăng số lần tính toán
        }
        return I_2n;
    }

    /**
     * Phương thức tính xấp xỉ giá trị tích phân với numOfSubIntervals (số chẵn) khoảng phân hoạch đều.
     * @param poly
     * @param lower
     * @param upper
     * @param numOfSubIntervals
     * @return giá trị xấp xỉ giá trị tích phân.
     */
    private double integrate(Polynomial poly, double lower, double upper, int numOfSubIntervals) {
        /* TODO */
        double h = (upper - lower) / numOfSubIntervals; // độ dài của mỗi khoảng phân hoạch đều
        double sum = poly.evaluate(lower) + poly.evaluate(upper); // tính tổng giá trị đầu và cuối
        for (int i = 1; i < numOfSubIntervals; i++) { // tính tổng giá trị ở các điểm giữa
            double x_i = lower + i*h; // tính giá trị x tại điểm giữa thứ i
            double y_i = poly.evaluate(x_i); // tính giá trị y tại điểm giữa thứ i
            if (i % 2 == 1) { // nếu i lẻ
                sum += 4*y_i; // thêm 4*y_i vào tổng
            } else { // nếu i chẵn
                sum += 2*y_i; // thêm 2*y_i vào tổng
            }
        }
        return sum * h / 3; // tính giá trị xấp xỉ của tích phân bằng công thức Simpson's Rule
    }
}
