package se.lexicon;

import java.time.LocalDate;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalDemo {

    public static void main(String[] args) {

        Function<String, Integer> stringToLength = (str) -> str.length();
        // useful for data transformations, such as converting one type to another type
        // represents a function that takes an input of type T and produces a result of type R
        Function<Double, Double> fahrenheitToCelsius = f -> (f - 32) * 5 / 9;   //     R apply(T t);
        System.out.println(stringToLength.apply("Hello World!"));
        System.out.println(fahrenheitToCelsius.apply(100.0));

        Predicate<Integer> isEven = num ->  num % 2 == 0;  //  boolean test(T t);
        System.out.println(isEven.test(10)); // true
        System.out.println(isEven.test(5)); // false

        Predicate<String> startWithA = s -> s.startsWith("A");
        System.out.println(startWithA.test("Apple")); // true
        System.out.println(startWithA.test("Lexicon")); // false

        Consumer<String>  printUpperCase = s -> System.out.println(s.toUpperCase());   // void accept(T t);
        printUpperCase.accept("Hello World!");

        Supplier<Integer> generateRandomNumber = ()-> new Random().nextInt(100);
        System.out.println(generateRandomNumber.get());

    }
}
