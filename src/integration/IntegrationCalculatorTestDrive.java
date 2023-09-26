package integration;

public class IntegrationCalculatorTestDrive {
    public static void main(String[] args) {
        /*
         TODO

         - Chạy demo các hàm test.
         - Lưu kết quả chạy chương trình vào file text có tên <TenSinhVien_MaSinhVien_Integration>.txt
           (ví dụ, NguyenVanA_123456_Integration.txt)
         - Nộp file kết quả chạy chương trình (file text trên) cùng với các file source code.
         */
        testArrayPolynomial();
        testListPolynomial();
        testIntegrationCalculator();
    }

    public static void testArrayPolynomial() {
        /*
         TODO

         - Viết chương trình test các chức năng của ArrayPolynomial (thêm phần tử vào đa thức, xóa phần tử trong đa thức,
           sửa hệ số tại một phần tử, cộng 2 đa thức, trừ 2 đa thức, nhân 2 đa thức, tính giá trị của đa thức khi biết
           giá trị của x).
         */
        ArrayPolynomial ap1 = new ArrayPolynomial();
        ap1.append(1);
        ap1.append(3);
        ap1.append(4);
        ap1.append(8);
        System.out.println("Đa thức: " + ap1);
        Polynomial dap = ap1.derivative();
        System.out.println("Đa thức đã đạo hàm: " + dap);

        ArrayPolynomial ap2 = new ArrayPolynomial();
        ap2.append(2);
        ap2.append(2);
        System.out.println("Đa thức 1: " + ap1);
        System.out.println("Đa thức 2: " + ap2);

        System.out.println("Tổng của 2 đa thức là: " + ap1.plus(ap2));
        System.out.println("Hiệu của 2 đa thức là: " + ap1.minus(ap2));
        System.out.println("Tích của 2 đa thức là: " + ap1.multiply(ap2));
    }

    public static void testListPolynomial() {
        /*
         TODO

         - Viết chương trình test các chức năng của ListPolynomial (thêm phần tử vào đa thức, xóa phần tử trong đa thức,
           sửa hệ số tại một phần tử, cộng 2 đa thức, trừ 2 đa thức, nhân 2 đa thức, tính giá trị của đa thức khi biết
           giá trị của x).
         */
        ListPolynomial listPolynomial = new ListPolynomial();
        listPolynomial.append(1);
        listPolynomial.append(3);
        listPolynomial.append(4);
        listPolynomial.append(8);
        System.out.println("Đa thức 1: " + listPolynomial);
        System.out.println("Đa thức 1 sau khi sửa hệ số tại 1 phần tử là: " + listPolynomial.set(2,1));
        ListPolynomial listPolynomial1 = new ListPolynomial();
        listPolynomial1.append(1);
        listPolynomial1.append(3);
        listPolynomial1.append(4);
        listPolynomial1.append(5);
        System.out.println("Đa thức 2: " + listPolynomial1);
        System.out.println("Tổng của 2 đa thức là: " + listPolynomial.plus(listPolynomial1));
        System.out.println("Hiệu của 2 đa thức là: " + listPolynomial.minus(listPolynomial1));
        System.out.println("Tích của 2 đa thức là: " + listPolynomial.multiply(listPolynomial1));
        System.out.println("Giá trị của đa thức 1 tại x = 2.0 là: " + listPolynomial.evaluate(2.0));
        System.out.println("Giá trị của đa thức 2 tại x = 2.0 là: " + listPolynomial1.evaluate(2.0));
    }

    public static void testIntegrationCalculator() {
        /*
         TODO

         - Tạo một đa thức.
         - Viết demo chương trình tính tích phân xác định của đa thức theo các phương pháp đã cho (MidpointRule, TrapezoidRule, SimpsonRule) sử dụng
           IntegrationCalculator. Các phương pháp tính tích phân có thể thay đổi ở thời gian chạy chương trình.
         - In ra thông tin phương pháp sử dụng, đa thức, và giá trị tích phân của đa thức.
         */
        ListPolynomial ap1 = new ListPolynomial();
        ap1.append(1);
        ap1.append(-3);
        ap1.append(3);
        ap1.append(-1);
        System.out.println(ap1);
        Integrator i1 = new MidpointRule(0.0001, 100);
        Integrator i2 = new TrapezoidRule(0.0001, 100);
        Integrator i3 = new SimpsonRule(0.0001, 100);

        IntegrationCalculator integrationCalculator1 = new IntegrationCalculator(i1,ap1);
        IntegrationCalculator integrationCalculator2 = new IntegrationCalculator(i2,ap1);
        IntegrationCalculator integrationCalculator3 = new IntegrationCalculator(i3,ap1);

        System.out.println("Nghiệm của đa thức theo phương pháp MidPointRule là: " + integrationCalculator1.integrate(-100, 100));
        System.out.println("Nghiệm của đa thức theo phương pháp TrapezoidRule là: " + integrationCalculator2.integrate(-100, 100));
        System.out.println("Nghiệm của đa thức theo phương pháp SimpsonRule là: " + integrationCalculator3.integrate(100, 100));
    }
}
