package com.ocp_8.chapter01ClassDesigin.test02;


import com.ocp_8.chapter01ClassDesigin.Test01.Employee;

/**
 * Created by Kanat KB on 22.07.2017.
 * A. The code compiles.
 */
public class Book {
    private int ISBN;
    private String title, author;
    private int pageCount;

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int hashCode() {
        return ISBN;
    }
    @Override
    public boolean equals(Object obj) {
        if ( !(obj instanceof Book)) {
            return false;
        }
        Book other = (Book) obj;
        return this.ISBN == other.ISBN;
    }
// imagine getters and setters are here

}

class Test {
    public static void main(String[] args) {
        Book book = new Book();
        Employee emp = new Employee();
        if ( book.equals(book) ) {
            System.out.print("Success ="+emp.hashCode());
        } else {
            System.out.print("Failure ="+emp.hashCode());
        }
    }
}
