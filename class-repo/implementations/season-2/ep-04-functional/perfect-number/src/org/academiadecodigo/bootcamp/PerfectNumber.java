package org.academiadecodigo.bootcamp;

import java.util.stream.IntStream;

public class PerfectNumber {

    public static void main(String[] args) {
        PerfectNumber perfectNumber = new PerfectNumber();

        long start = System.currentTimeMillis();

        perfectNumber.checkPerfectsBetter();

        double elapsed = (System.currentTimeMillis() - start) / 1000;
        System.out.println(elapsed < 60d ? "time (secs): " + elapsed : "time (mins): " + elapsed / 60);

    }

    public int sumDivisors(int n) {
        return IntStream.range(1, n)
                .filter(x -> n % x == 0)
                //.peek(x -> System.out.print(x + ","))
                .sum();
    }
    public void checkPerfects(int min, int max) {
        IntStream.range(min, max)
                .filter(n -> n == sumDivisors(n))
                .parallel()
                .forEach(System.out::println);
    }

    public int sumDivisorsBetter(int n) {
        int root = (int) Math.sqrt(n);
        int sum = IntStream.range(2, root + 1)
                .filter(x -> n % x == 0)
                .parallel()
                //.peek(x -> System.out.print(x + "-" + n / x + ","))
                .map(x -> x + n / x)
                .sum();

        if(n == root * root) {
            sum = sum - root;
        }

        return sum + 1;
    }

    public void printSums(int min, int max) {
        IntStream.range(min, max)
                .peek(n -> System.out.print(n + "="))
                .map(this::sumDivisorsBetter)
                .forEach(n -> System.out.println(" which is " + n));
    }

    public void checkPerfectsBetter() {
        IntStream.iterate(1, n -> n +1)
                .unordered()
                .filter(n -> n == sumDivisorsBetter(n))
                .parallel()
                .limit(5)
                .forEach(System.out::println);
    }





}
