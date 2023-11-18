package com.koyama;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("クロ", 3);
        System.out.println(dog.getName());
        System.out.println(dog.getAge());

        Dog dog2 = new Dog("ハチ", 5);
        System.out.println(dog2.getName());
        System.out.println(dog2.getAge());
    }
}
