package com;

/**
 * Author:Fanleilei
 * Created:2019/2/17 0017
 */
public class Test2 {
    //Object接受所有类的对象
    public static void fun(Object object){
        System.out.println(object.toString());

    }
    public static void main(String[] args) {
        fun(new student("Tom",12));
        //默认Object类提供的toString()方法只能够得到一个对象的地址（而这是所有对象都共同具备
        //的特征）。若想得到其他信息可以赋写toString()方法
        fun(new people("河南省","Jack"));

        fun("hello");

    }
}
class student{
    private String name;
    private  int age;

    public student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //toString()的核心目的在于取得对象信息。
    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
class people{

    private  String address;
    private  String name;

    public people(String address, String name) {
        this.address = address;
        this.name = name;
    }

  @Override
    public String toString() {
        return "people{" +
                "address='" + address + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}