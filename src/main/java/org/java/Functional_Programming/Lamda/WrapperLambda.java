package org.java.Functional_Programming.Lamda;

import java.time.LocalDateTime;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class WrapperLambda {

    public static void main(String[] args) {

        UnaryOperator<Integer> increment = x -> x + 1;

        Consumer<String> loggMessage = action -> System.out.println(action + " : " + LocalDateTime.now());

        Runnable start = () -> loggMessage.accept("Start");
        Runnable end = () -> loggMessage.accept("End");

        BiConsumer<UnaryOperator<Integer>, Integer> consumer = (operation, number) -> {
            start.run();
            System.out.println(operation.apply(10));
            end.run();
        };

        consumer.accept(increment, 10);

    }

}
