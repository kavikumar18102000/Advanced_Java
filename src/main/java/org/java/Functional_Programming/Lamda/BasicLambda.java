package org.java.Functional_Programming.Lamda;

public class BasicLambda {

    public static void main(String[] args) {
        Arithmetic add = (a, b) -> a + b;
        Arithmetic sub = (a, b) -> a - b;
        Arithmetic mul = (a, b) -> a * b;

        System.out.println(add.add(10, 20));

    }

    public interface Arithmetic {
        int add(int a, int b);
    }
}
