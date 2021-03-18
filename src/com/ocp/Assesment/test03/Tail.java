package com.ocp.Assesment.test03;

/**
 * Created by Kanat KB on 03.07.2017.
 * D. The code will not compile because of lines 16–17. (44-45)
 * E.
 */

public class Tail {
}

/*
public class Bird implements Serializable {
    private String name;
    private transient int age;
    private Tail tail;

    public String getName() {
        return name;
    }

    public Tail getTail() {
        return tail;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTail(Tail tail) {
        this.tail = tail;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void main(String[] args) {
        System.out.println("#1");
        try (InputStream is = new ObjectInputStream(
                new BufferedInputStream(new FileInputStream("birds.dat")))) {
            System.out.println("#2");
            Bird bird = is.readObject();
        } catch (Exception e) {
            System.out.println("Error:"+e.getMessage());
        }

    }
} */