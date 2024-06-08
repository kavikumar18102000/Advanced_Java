package org.java.Functional_Programming.Method_Reference;


import org.java.Functional_Programming.Lamda.BasicLambda;

public class BasicMethodReference {

    public static void main(String[] args) {
        BasicLambda.Arithmetic add = Integer::sum;

        System.out.println(add.add(10,20));
    }

}
