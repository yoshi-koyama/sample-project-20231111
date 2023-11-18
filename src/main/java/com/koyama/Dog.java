package com.koyama;

public class Dog {

    // field フィールド
    private String name;
    private int age;

    // constructor コンストラクタ
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank()) {
            throw new IllegalArgumentException("名前が空白です");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    // setter


    public void setAge(int age) {
        this.age = age;
    }
}
