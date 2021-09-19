package com.ocp_8.Assesment.test07;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Kanat KB on 11.07.2017.
 * A. true true
 */
public class Test07 {
    public static void main(String[] args) {
        try {
            Path path1 = Paths.get("C:/KANATKB/soft/JCollection/temp/bats/night", "../").resolve(Paths.get("./sleep.txt")).normalize();
            // Path path2 = Paths.get("C:/KANATKB/soft/JCollection/temp/bats/night", "../").resolve(Paths.get("./sleep.txt")).normalize();
            // Path path2 = new File("../sleep.txt").toPath().toRealPath();
            //Path path1 = new File("C:/KANATKB/soft/JCollection/temp/bats/night/sleep.txt").toPath().toRealPath();
            System.out.println(path1.toString());
            Path path2 = new File("../sleep.txt").toPath().toRealPath();
            System.out.println(path2.toString());
            System.out.print(Files.isSameFile(path1, path2));
            System.out.print(" " + path1.equals(path2));
        } catch (Exception ex) {
            System.out.print("err: " + ex.getMessage());
        }

    }
}
