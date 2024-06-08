package org.java.Functional_Programming.Lamda;

import java.util.function.Function;

public class ComposibilityAndThen {

    public static void main(String[] args) {
        Function<Integer, Integer> add = x -> x + 2;
        Function<Integer, Integer> doubleIt = x -> x * 2;

        System.out.println(add.apply(doubleIt.apply(10)));

        //Composable function using andThen
        System.out.println(doubleIt.andThen(add).apply(10));

        Function<Integer, Integer> combine = doubleIt.andThen(add);
        System.out.println(combine.apply(10));

    }
}
