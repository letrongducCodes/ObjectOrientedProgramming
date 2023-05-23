package hus.oop.MidtermExam.Exercise2;

public class TestPolynomial {
    public static void main(String[] args) {
        /*
         TODO

         - Chạy demo các hàm test.
         - Lưu kết quả chạy chương trình vào file text có tên <Ten_MaSinhVien_MyList>.txt
           (ví dụ, NguyenVanA_123456_MyList.txt)
         - Nộp kết quả chạy chương trình (file text trên) cùng với các file source code.
         */
        testArrayPolynomial();
        System.out.println();
        testListPolynomial();
        System.out.println();
        testRootSolver();
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

    public static void testRootSolver() {
        /*
         TODO

         - Tạo đa thức có nghiệm trong khoảng [a, b] nào đó.
         - Viết chương trình tìm nghiệm của đa thức theo các phương pháp đã cho (Bisection, Newton-Raphson, Secant) sử dụng
           PolynomialRootFinding. Các phương pháp tìm nghiệm của thể thay đổi ở thời gian chạy chương trình.
         - In ra phương pháp sử dụng, đa thức, và nghiệm của đa thức.
         */
        ListPolynomial ap1 = new ListPolynomial();
        ap1.append(1);
        ap1.append(-3);
        ap1.append(3);
        ap1.append(-1);
        System.out.println(ap1);
        RootSolver s1 = new SecantSolver(0.0001, 100);
        RootSolver s2 = new BisectionSolver(0.0001, 100);
        RootSolver s3 = new NewtonRaphsonSolver(0.0001, 100);

        PolynomialRootFinding pRF1 = new PolynomialRootFinding(ap1, s1);
        PolynomialRootFinding pRF2 = new PolynomialRootFinding(ap1, s2);
        PolynomialRootFinding pRF3 = new PolynomialRootFinding(ap1, s3);

        System.out.println("Nghiệm của đa thức theo phương pháp Secant là: " + pRF1.solve(-100, 100));
        System.out.println("Nghiệm của đa thức theo phương pháp Bisection là: " + pRF2.solve(-100, 100));
        System.out.println("Nghiệm của đa thức theo phương pháp Newton-Raphson: " + pRF3.solve(-100, 100));
    }
}
