package com.example.collection.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class ListMaxDemo {

    public static void main(final String[] args) {
        // given

        //List<Person> people = Arrays.asList(alex, john, peter)
        List<Person> people = new ArrayList<>();

        people.add(new Person("Alex1", 21));
        people.add(new Person("Alex2", 77));
        people.add(new Person("Alex3", 23));
        people.add(new Person("Alex4", 88));

        Person maxByAge = people.stream().max(Comparator.comparing(Person::getAge)).orElseThrow(NoSuchElementException::new);
        Integer maxAge = people.stream().max(Comparator.comparing(Person::getAge)).orElseThrow(NoSuchElementException::new).getAge();
        System.out.println("maxByAge ="+maxByAge.getAge()+" maxAge ="+maxAge);

        people.remove(people.size()-1);
        people.forEach(p-> {
                    System.out.println("name = "+p.name);
                }
        );
    }
}

class Person {
    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    String name;
    Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    // standard constructors, getters and setters
}