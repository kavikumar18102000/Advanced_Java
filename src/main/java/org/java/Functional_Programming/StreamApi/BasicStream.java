package org.java.Functional_Programming.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class BasicStream {

    /*

    Streams are lazy evaluated, means somebody should consume the result of the work after the operations done, like toList(),forEach()...etc,
     then it will work,otherwise the stream will not work unless the result is consumed(means, there must and should be a terminal operation).

    Streams are immutable, once the stream are created, we cannot modify the streams.
    In-place modification is not supported.

    Benefits of immutable:
    safe for parallel processing
    Side effect free
    improved debugging
    encourages stateless behaviour
    better composability

    */

    public static void main(String[] args) {
        List<String> list = List.of("Foo", "End", "Start", "Sample", "Done", "Duty", "Type", "Jack", "Daniels", "Cooper", "Soap", "Duty");
        Stream<String> stream = list.stream();
        Consumer<String> consumer = System.out::println;
        stream.forEach(consumer);

        int[] arr = {1, 2, 3, 4, 5};
        Arrays.stream(arr).forEach(System.out::println);

        //Using Stream.of()
        Stream.of("Apple", "Banana", "Mango").forEach(consumer);

        //Using Stream generate
        Stream.generate(Math::random)
                .limit(10)
                .forEach(System.out::println);


        Supplier<Double> supplier = () -> 10d;
//        supplier = Math::random;
        List<Double> list1 = Stream.generate(supplier)
                .limit(10)
                .toList();

        System.out.println(list1);


        //Using Stream iterate
        Stream.iterate(0, x -> x + 2)
                .limit(10)
                .forEach(System.out::println);

    }
}


