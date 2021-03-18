package com.ocp.Assesment.test17;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

/**
 * Created by Kanat KB on 22.07.2017.
 * B. It does not compile because of line k1.
 * C. It does not compile because of line k2.
 * E. It does not compile because of line k4.
 */
public class Test17 {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("/gorilla/signed-words.txt");
            Files.find(path.getParent(), 10, //k1
                    //Files.find(path.getParent(), 10.0, // k1
                    (p, a) -> p.toString().endsWith(".txt") && Files.isDirectory(p)) // k2
                    //(Path p) -> p.toString().endsWith(".txt") && Files.isDirectory(p)) // k2
                    .collect(Collectors.toList())
                    .forEach(System.out::println);
            Files.readAllLines(path) // k3
                    //  .flatMap(p -> Stream.of(p.split(" "))) // k4
                    //   .map(s -> s.toLowerCase()) // k5
                    .forEach(System.out::println);
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
}
