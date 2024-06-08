package org.java.Functional_Programming.Lamda;

import java.util.function.Function;

public class LambdaClosure {


    public static Function<Integer, Integer> counter() {
        int count = 0;
        Function<Integer, Integer> increment = x -> count + 1;
        /*
        count = count + 1; --> this won't work as lambda locks the variable value,so we can't modify the value of the variable which is used by lambda.
        If a variable is used by lambda, it should be final(mark as final) or effectively final(don't touch or modify the variable's value)
        lambda locks the value, not the variable, so, don't modify the value of the variable.
        the value is used, when lambda runs.

        But when instead of the primitive type, if we use an object, then the reference should not be changed, the contents of the object can be modified.
        Eg:
        Person p = new Person();
        Function<> getAge = () -> p.getAge();
        p.setAge(10); --> allowed

        p = new Person(); --> not allowed to change the reference, if lambda used it,but the contents of the object can be changed.
        So, if the object is in heap, object's contents can be changed, but the reference of the object cannot be changed.
        */

        return increment;
    }

    public static void main(String[] args) {
        Function<Integer, Integer> counter = LambdaClosure.counter();
        System.out.println(counter.apply(1));
        /*
        Lambda can access the local variable value outside it's scope, known as closures.
        Lambda locks the value of the variable, so it takes the value along with it even it is outside the scope.
        */

    }
}
