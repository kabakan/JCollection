package com.example.lamda;

import com.example.all.Animal;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by Kanat KB on 26.08.2017.
 */
public class LamdaTest {
    private static void print(Animal animal, Predicate<Animal> trait) {
        if (trait.test(animal))
            System.out.println(animal);
    }

    public static void LamdaList() {
        System.out.println("//------------- Lamda list ------------//");
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        list.stream().map((x) -> x * x).forEach(System.out::println);
    }

    public static void LamdaList2() {
        System.out.println("//------------- Lamda list 2------------//");
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        int sum = list.stream().map(x -> x * x).reduce((x, y) -> x + y).get();
        System.out.println(sum);
    }

    public static void main(final String[] args) {
        print(new Animal("fish", false, true), a -> a.canHop());
        print(new Animal("kangaroo", true, false), a -> a.canHop());
        LamdaList();
        LamdaList2();
    }

}

