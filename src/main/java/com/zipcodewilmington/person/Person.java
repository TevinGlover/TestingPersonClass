package com.zipcodewilmington.person;

/**
 * If you did ObjectsOne lab, you might recognize this code?
 */
public class Person {
    private String name;// the all ready set it up
    private int age; // and the age


    public Person() {// the constructor- set the name and age in to person as need ver
        name =""; // this set the starting name if no imput is made
        age = Integer.MAX_VALUE;// dido
    }

    public Person(int age) {
        this.age =age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) { // set the age to the new name
        this.name = name;
    }

    public void setAge(int age) { // set the age to the new age
        this.age = age;
    }

    public String getName() {
        return name;
    } // get the value of String

    public Integer getAge() {
        return age;
    }// get the value of int
}
