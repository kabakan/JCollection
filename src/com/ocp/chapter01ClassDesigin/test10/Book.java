package com.ocp.chapter01ClassDesigin.test10;

/**
 * Created by Kanat KB on 22.07.2017.
 * A. The code compiles successfully, and one bytecode file is generated: Book.class.
 */

public class Book {
    private int pageNumber;

    private class BookReader {
        public int getPage() {
            return pageNumber;
        }
    }
}

class Test {
    public static void main(String[] args) {
        Book book = new Book();
        boolean b = book instanceof  Book;
        if (b) System.out.println("Success");
    }
}