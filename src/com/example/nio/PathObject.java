package com.example.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Kanat KB on 21.10.2017.
 */
public class PathObject {
    public static void main(String[] arg) {

        getAbsolutPath();
        getCountFile();

        printPathInformation(Paths.get("/zoo/armadillo/shells.txt"));
        printPathInformation(Paths.get("armadillo/shells.txt"));

        getAbsolute();
        getNewPath();

        getRelativeze();

        getResolve();
        getNormalize();
        getRealPath();
    }

    public static void getAbsolutPath() {
        try {
            System.out.println("----------getAbsolutPath()----------");
            Path path = Paths.get("/zoo/../home").getParent().normalize().toAbsolutePath();
            System.out.println(path);
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public static void getCountFile() {
        try {
            System.out.println("----------getCountFile(()----------");
            Path path = Paths.get("/land/hippo/harry.happy");
            System.out.println("The Path Name is: " + path);
            for (int i = 0; i < path.getNameCount(); i++) {
                System.out.println(" Element " + i + " is: " + path.getName(i));
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public static void printPathInformation(Path path) {
        System.out.println("----------printPathInformation()----------");
        System.out.println("Filename is: " + path.getFileName());
        System.out.println("Root is: " + path.getRoot());
        Path currentParent = path;
        while ((currentParent = currentParent.getParent()) != null) {
            System.out.println(" Current parent is: " + currentParent);
        }
    }


    public static void getAbsolute() {
        try {
            System.out.println("----------getAbsolute(()----------");
            Path path1 = Paths.get("C:\\birds\\egret.txt");
            System.out.println("Path1 is Absolute? " + path1.isAbsolute());
            System.out.println("Absolute Path1: " + path1.toAbsolutePath());
            Path path2 = Paths.get("birds/condor.txt");
            System.out.println("Path2 is Absolute? " + path2.isAbsolute());
            System.out.println("Absolute Path2 " + path2.toAbsolutePath());

        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public static void getNewPath() {
        try {
            System.out.println("----------getNewPath()----------");
            Path path = Paths.get("/mammal/carnivore/raccoon.image");

            System.out.println("Path is: " + path);
            System.out.println("Subpath from 0 to 3 is: " + path.subpath(0, 3));
            System.out.println("Subpath from 1 to 3 is: " + path.subpath(1, 3));
            System.out.println("Subpath from 1 to 2 is: " + path.subpath(1, 2));

        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public static void getRelativeze() {
        try {
            System.out.println("----------getRelativeze()----------");
            Path path1 = Paths.get("fish.txt");
            Path path2 = Paths.get("birds.txt");
            System.out.println(path1.relativize(path2));
            System.out.println(path2.relativize(path1));

            Path path3 = Paths.get("E:\\habitat");
            Path path4 = Paths.get("E:\\sanctuary\\raven");
            System.out.println(path3.relativize(path3));
            System.out.println(path4.relativize(path4));

        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public static void getResolve() {
        try {
            System.out.println("----------getResolve()----------");
            final Path path1 = Paths.get("/cats/../panther");
            final Path path2 = Paths.get("food");
            System.out.println(path1.resolve(path2));

        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public static void getNormalize() {
        try {
            System.out.println("----------getNormalize()----------");
            Path path3 = Paths.get("E:\\data");
            Path path4 = Paths.get("E:\\user\\home");
            Path relativePath = path3.relativize(path4);
            System.out.println(path3.resolve(relativePath));
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public static void getRealPath() {
        try {
            System.out.println("----------getRealPath(()----------");
            System.out.println(Paths.get("./data/data.txt").toRealPath());
            System.out.println(Paths.get("./data.txt").toRealPath());
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }


}
