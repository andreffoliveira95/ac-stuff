package org.academiadecodigo.bootcamp.lambdas;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class Test {


    public static void main(String[] args) {

        Consumer<String> printValue = (word) -> System.out.println(word);
        printValue.accept("Batata, banana, ananas, cocaine.");

        Predicate<Integer> isLessThanTen = num -> num < 10;
        System.out.println(isLessThanTen.test(5));
    }
}
