package com.example.lamda.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Created by Kanat KB on 12.09.2017.
 */
public class OptionalDemo {
    public static void main(String[] args) {
        List<Integer> li = Arrays.asList(9, 9, 8, 9);

        Optional<Double> opt = average(li);
        System.out.println("opt.orElse: " + opt.orElse(Double.NaN));
        System.out.println("opt.orElseGet: " + opt.orElseGet(() -> Math.random()));
        System.out.println("opt.orElseThrow: " + opt.orElseThrow(() -> new IllegalStateException()));
        Optional<Double> opt1 = average(li);
        opt1.ifPresent(System.out::println);

        //-----threeDigit
        Optional<Integer> opt2 = Optional.of(10 + 100);
        threeDigit(opt2);
        //-----threeDigitlamda
        threeDigitLamda(opt2);
    }

    public static Optional<Double> average(List<Integer> scores) {
        if (scores.size() == 0) return Optional.empty();
        int sum = 0;
        for (int score : scores) sum += score;
        return Optional.of((double) sum / scores.size());
    }

    public static void threeDigit(Optional<Integer> optional) {
        System.out.println("-------threeDigit------");
        if (optional.isPresent()) { // outer if
            Integer num = optional.get();
            String string = "" + num;
            if (string.length() == 3) // inner if
                System.out.println(string);
        }
    }

    public static void threeDigitLamda(Optional<Integer> optional) {
        System.out.println("-------threeDigitLamda------");
        optional.map(n -> "3" + n) // part 1
                .filter(s -> s.length() > 3) // part 2
                .ifPresent(System.out::println); // part 3
    }

}
