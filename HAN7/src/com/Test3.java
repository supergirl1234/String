package com;

import java.util.Objects;

/**
 * Author:Fanleilei
 * Created:2019/2/17 0017
 */
//对象比较
//String类对象的比较使用的是equals()方法，实际上String类的equals()方法就是覆写的Object类中的equals()方
//法
public class Test3 {

    public static void main(String[] args) {
        Person person1=new Person("Tom",12);
        Person person2=new Person("Tom",12);
        //在没有覆写Object的equals方法时，结果为false
        //在覆写Object的equals方法后，结果为true
        System.out.println(person1.equals(person2));

    }
}
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "姓名：" + this.name + ",年龄：" + this.age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age);
    }
}
