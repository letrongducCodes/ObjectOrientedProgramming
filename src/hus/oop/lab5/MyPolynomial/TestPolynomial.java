package hus.oop.lab5.MyPolynomial;

public class TestPolynomial {
    public static void main(String[] args) {
        double[] coeffs = {1,2,3,4};
        MyPolynomial myPolynomial1 = new MyPolynomial(coeffs);
        System.out.println(myPolynomial1);
        System.out.println("Test degree: " + myPolynomial1.getDegree());
        System.out.println("Test evaluate: " + myPolynomial1.evaluate(2));

        double[] coeffs2 = {2,2,1};
        MyPolynomial rightPolynomial = new MyPolynomial(coeffs2);
        MyPolynomial addPolynomial = myPolynomial1.add(rightPolynomial);
        System.out.println("My Polynomial: " + myPolynomial1);
        System.out.println("Right Polynomial: " + rightPolynomial);
        System.out.println("Add Polynomial: " + addPolynomial);
        MyPolynomial multiplyPolynomial = myPolynomial1.multiply(rightPolynomial);
        System.out.println("Multiply Polynomial: " + multiplyPolynomial);
    }
}
