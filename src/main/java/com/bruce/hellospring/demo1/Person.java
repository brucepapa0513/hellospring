package com.bruce.hellospring.demo1;

public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public Person() { }

    public void sayHello() {
        System.out.println("Hello, my name is " + name);
    }

}
