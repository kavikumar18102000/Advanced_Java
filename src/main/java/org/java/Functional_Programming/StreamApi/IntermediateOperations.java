package org.example.StreamApi;

import java.util.List;
import java.util.stream.Stream;

public class IntermediateOperations {

    public static void main(String[] args) {
        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //Using limit of stream
        Stream<Integer> limited = numbers.limit(5);
        limited.forEach(System.out::println);

        //Using filter of stream
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        integerStream.filter(n -> n % 2 == 0).forEach(System.out::println);

        /*
        Using map operator
        takes the element and performs the operation and adds the modified element to the stream
        */
        Stream<String > fruits = Stream.of("apple", "banana", "orange", "pear");
        fruits.map(String::toUpperCase).forEach(System.out::println);

        //Using peek operator
        //In stream, the operations are performed on each element individually, not all at the same time.
        fruits = Stream.of("apple", "banana", "orange", "pear");
        fruits.map(String::toUpperCase)
                .peek(frt -> System.out.println("Peek fruit: "+frt))
                .filter(str -> str.length() < 6)
                .forEach(System.out::println);

        //using sorted and distinct operator
        numbers = Stream.of(1, 2,9,8,3, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers
                .distinct()
                .sorted()
                .forEach(System.out::println);

        //Stream concatenation
        Stream<Integer> oddNumbers = Stream.of(1, 3, 5, 7, 9);
        Stream<Integer> evenNumbers = Stream.of(0,2,4,6,8);

        Stream.concat(evenNumbers,oddNumbers)
                .sorted()
                .forEach(System.out::println);


        //streams using objects
        Stream<Student> studentStream = Stream.of(
                new Student(1,"Foo"),
                new Student(2,"Apple")
        );

        List<Student> list2 = studentStream
                .filter(stu -> stu.getName().length() > 3)
                .toList();

        list2.forEach(student -> System.out.println(student.getName()));

    }

}

class Student{
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
