package com.yyc.learnleetcode.learnalgorithms.a905;

import java.io.Serializable;

public class Dog implements Serializable {

    private static final long serialVersionUID = -7689020475298042321L;

    String name;
    int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getAge() {
        return age;
    }

    void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
