package matrix;

import java.util.Arrays;
import java.util.Random;

public class SquareMatrixTestDrive {
    public static void main(String[] args) {
        /* TODO
        Tạo ra 2 ma trận có cùng kích thước là một số ngẫu nhiên nằm trong đoạn [5, 10].
        Viết code thực hiện test các chức năng sau của các ma trận:
          - In ra 2 ma trận và 2 ma trận chuyển vị tương ứng.
          - In ra các đường chéo chính và đường chéo phụ của 2 ma trận.
          - In ra ma trận là ma trận tổng của 2 ma trận.
          - In ra ma trận là ma trận là hiệu của ma trận thứ nhất cho ma trận thứ 2.
          - In ra ma trận là ma trận tích của 2 ma trận.
          - In ra các số nguyên tố có trong 2 ma trận.

         Lưu kết quả chạy chương trình trên terminal vào file text và nộp cùng source code chương trình.
         File text kết quả được đặt tên như sau: <TenSinhVien_MaSinhVien_Matrix.txt> (Ví dụ, NguyenVanA_123456_Matrix.txt).
         */
        Random random = new Random();
        int size = random.nextInt(6) + 5;
        SquareMatrix matrix1 = new SquareMatrix(size);
        SquareMatrix matrix2 = new SquareMatrix(size);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix1.set(i, j, random.nextInt(6) + 5);
                matrix2.set(i, j, random.nextInt(6) + 5);
            }
        }

        // In ra 2 ma trận và 2 ma trận chuyển vị tương ứng.
        System.out.println("Matrix 1:");
        System.out.println(matrix1);
        System.out.println("Transpose of matrix 1:");
        System.out.println(matrix1.transpose());
        System.out.println("Matrix 2:");
        System.out.println(matrix2);
        System.out.println("Transpose of matrix 2:");
        System.out.println(matrix2.transpose());

        // In ra các đường chéo chính và đường chéo phụ của 2 ma trận.
        System.out.println("Main diagonal of matrix 1:");
        System.out.println(Arrays.toString(matrix1.principalDiagonal()));
        System.out.println("Secondary diagonal of matrix 1:");
        System.out.println(Arrays.toString(matrix1.secondaryDiagonal()));
        System.out.println("Main diagonal of matrix 2:");
        System.out.println(Arrays.toString(matrix2.principalDiagonal()));
        System.out.println("Secondary diagonal of matrix 2:");
        System.out.println(Arrays.toString(matrix2.secondaryDiagonal()));

        // In ra ma trận là ma trận tổng của 2 ma trận.
        System.out.println("Sum of matrix 1 and matrix 2:");
        System.out.println(matrix1.add(matrix2));

        // In ra ma trận là ma trận là hiệu của ma trận thứ nhất cho ma trận thứ 2.
        System.out.println("Minus of matrix 1 and matrix 2:");
        System.out.println(matrix1.minus(matrix2));

        // In ra ma trận là ma trận tích của 2 ma trận.
        System.out.println("Product of matrix 1 and matrix 2:");
        System.out.println(matrix1.multiply(matrix2));

        // In ra các số nguyên tố có trong 2 ma trận.
        int[] primeNumbersMatrix1 = matrix1.primes();
        System.out.println("Prime numbers in matrix 1: " + Arrays.toString(primeNumbersMatrix1));
        int[] primeNumbersMatrix2 = matrix2.primes();
        System.out.println("Prime numbers in matrix 2: " + Arrays.toString(primeNumbersMatrix2));
    }
}
