package matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SquareMatrix {
    private int[][] data;

    /**
     * Hàm dựng, khởi tạo một ma trận có các phần tử được sinh ngẫu nhiên trong khoảng [1, 100]
     * @param size
     */
    public SquareMatrix(int size) {
        initRandom(size);
    }

    /**
     * Phương thức khởi tạo ma trận, các phần tử của ma trận được sinh ngẫu nhiên trong khoảng [1, 100]
     * @param size
     */
    private void initRandom(int size) {
        /* TODO */
        data = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                data[i][j] = (int) (Math.random() * 100) + 1;
            }
        }
    }

    /**
     * Phương thức lấy ra các phần tử trên đường chéo chính của ma trận.
     * @return đường chéo chính của ma trận.
     */
    public int[] principalDiagonal() {
        /* TODO */
        int[] diagonal = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            diagonal[i] = data[i][i];
        }
        return diagonal;
    }

    /**
     * Phương thức lấy ra các phần tử trên đường chéo phụ của ma trận.
     * @return đường chéo phụ của ma trận.
     */
    public int[] secondaryDiagonal() {
        /* TODO */
        int[] diagonal = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            diagonal[i] = data[i][data.length - i - 1];
        }
        return diagonal;
    }

    /**
     * Phương thức lấy ra các số là số nguyên tố trong ma trận.
     * @return các số nguyên tố trong ma trận.
     */
    private boolean[] findPrimeNumbersInRow(int[] row) {
        boolean[] isPrime = new boolean[row.length];
        for (int i = 0; i < row.length; i++) {
            isPrime[i] = isPrime(row[i]);
        }
        return isPrime;
    }

    private int[] getPrimeNumbersInRow(int[] row) {
        boolean[] isPrime = findPrimeNumbersInRow(row);
        int count = 0;
        for (int i = 0; i < isPrime.length; i++) {
            if (isPrime[i]) {
                count++;
            }
        }
        int[] primes = new int[count];
        int index = 0;
        for (int i = 0; i < isPrime.length; i++) {
            if (isPrime[i]) {
                primes[index] = row[i];
                index++;
            }
        }
        return primes;
    }

    /**
     * Phương thức lấy ra các số là số nguyên tố trong ma trận.
     * @return các số nguyên tố trong ma trận.
     */
    public int[] primes() {
        int[] primes = new int[data.length * data.length];
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            int[] row = data[i];
            int[] primesInRow = getPrimeNumbersInRow(row);
            for (int j = 0; j < primesInRow.length; j++) {
                primes[count] = primesInRow[j];
                count++;
            }
        }
        return Arrays.copyOf(primes, count);
    }

    private boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Phương thức sắp xếp các phần tử của ma trận theo thứ tự tăng dần.
     * @return ma trận có các phần tử là phần tử của ma trận ban đầu được sắp xếp theo thứ tự tăng dần.
     * Các phần tử được sắp xếp theo thứ tự từ trái sang phải ở mỗi hàng, và từ trên xuống dưới.
     */
    public SquareMatrix getSortedMatrix() {
        /* TODO */
        SquareMatrix sortedMatrix = new SquareMatrix(data.length);
        int[] flattenedData = new int[data.length * data.length];
        int k = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                flattenedData[k++] = data[i][j];
            }
        }
        Arrays.sort(flattenedData);
        k = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                sortedMatrix.set(i, j, flattenedData[k++]);
            }
        }
        return sortedMatrix;
    }

    /**
     * Lấy giá trị phần tử ở vị trí (row, col).
     * @param row
     * @param col
     * @return
     */
    public int get(int row, int col) {
        /* TODO */
        return data[row][col];
    }

    /**
     * Sửa giá trị phần tử ở vị trí (row, col) thành value.
     * @param row
     * @param col
     * @param value
     */
    public void set(int row, int col, int value) {
        /* TODO */
        data[row][col] = value;
    }

    /**
     * Phương thức cộng ma trận hiện tại với một ma trận khác.
     * @param that
     * @return ma trận mới là ma trận tổng của 2 ma trận.
     */
    public SquareMatrix add(SquareMatrix that) {
        /* TODO */
        SquareMatrix sumMatrix = new SquareMatrix(data.length);
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                int sum = this.get(i, j) + that.get(i, j);
                sumMatrix.set(i, j, sum);
            }
        }
        return sumMatrix;
    }

    /**
     * Phương thức trừ ma trận hiện tại cho một ma trận khác.
     * @param that
     * @return ma trận mới là ma trận hiệu của ma trận hiện tại và ma trận truyền vào.
     */
    public SquareMatrix minus(SquareMatrix that) {
        /* TODO */
        SquareMatrix diffMatrix = new SquareMatrix(data.length);
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                int diff = this.get(i, j) - that.get(i, j);
                diffMatrix.set(i, j, diff);
            }
        }
        return diffMatrix;
    }

    /**
     * Phương thức nhân ma trận hiện tại với một ma trận khác.
     * @param that
     * @return ma trận mới là ma trận nhân của ma trận hiện tại với ma trận truyền vào.
     */
    public SquareMatrix multiply(SquareMatrix that) {
        /* TODO */
        SquareMatrix productMatrix = new SquareMatrix(data.length);
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                int sum = 0;
                for (int k = 0; k < data.length; k++) {
                    sum += this.get(i, k) * that.get(k, j);
                }
                productMatrix.set(i, j, sum);
            }
        }
        return productMatrix;
    }

    /**
     * Phương thức nhân ma trận với một số vô hướng.
     * @param value
     * @return ma trận mới là ma trận hiện tại được nhân với một số vô hướng.
     */
    public SquareMatrix scaled(int value) {
        /* TODO */
        SquareMatrix scaledMatrix = new SquareMatrix(data.length);
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                int product = this.get(i, j) * value;
                scaledMatrix.set(i, j, product);
            }
        }
        return scaledMatrix;
    }

    /**
     * Phương thức lấy ma trận chuyển vị.
     * @return ma trận mới là ma trận chuyển vị của ma trận hiện tại.
     */
    public SquareMatrix transpose() {
        /* TODO */
        SquareMatrix transposeMatrix = new SquareMatrix(data.length);
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                transposeMatrix.set(j, i, data[i][j]);
            }
        }
        return transposeMatrix;
    }

    /**
     * Mô tả ma trận theo định dạng biểu diễn ma trận, ví dụ
     *   1 2 3
     *   4 5 6
     *   7 8 9
     * @return một chuỗi mô tả ma trận.
     */
    @Override
    public String toString() {
        /* TODO */
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                sb.append(data[i][j]).append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
