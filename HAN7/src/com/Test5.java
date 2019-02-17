package com;

/**
 * Author:Fanleilei
 * Created:2019/2/17 0017
 */
public class Test5 {

    public static void code1() {


        //装箱：将基本数据类型变为包装类对象，利用每一个包装类提供的构造方法实现装箱处理。
        // 拆箱：将包装类中包装的基本数据类型取出。
        //手工的装箱、拆箱
        Integer num=new Integer(10);//装箱
        int data=num.intValue();//拆箱
        System.out.println(data);


       // 自动装箱
        Integer x = 55 ;
        // 可以直接利用包装类对象操作
        System.out.println(++x * 5 );


       Integer num1=new Integer(10);
       Integer num2=new Integer(10);
       int num3=10;
        System.out.println(num1==num2);//false
        System.out.println(num1==(new Integer(10)));//false
        System.out.println(num1.equals(num2));//true
        System.out.println("-------");
        System.out.println(num1==num3);//true

        System.out.println("--------");
        Integer num4=10;
        Integer num5=10;
        System.out.println("num4==num5?"+(num4==num5));//true


    }

    //基本数据类型与字符串转换
    //将字符串转为数字的时候，字符串的组成有非数字，那么转换就会出现错误
    //（NumberFormatException）
    public static void main(String[] args) {

        //String类转换为int型
        String str1="123";
        int data=Integer.parseInt(str1);
        System.out.println(data);
        //String类转换为double型
        double data1=Double.parseDouble(str1);
        System.out.println(data1);

         //String类转换为boolean型
        //str只有是true(忽略大小写) 时才返回true，否则返回false
        String str2="true";
        boolean bol=Boolean.parseBoolean(str2);
        System.out.println(bol);//true

        String str3="TRue";
        boolean bol2=Boolean.parseBoolean(str3);
        System.out.println(bol2);//true

        String str4="qwe";
        boolean bol3=Boolean.parseBoolean(str4);
        System.out.println(bol3);//false

        //将基本数据类型转换为字符串

        //1. 任何数据类型使用了"+"连接空白字符串就变为了字符串类型。
        //2. 使用String类中提供的valueOf()方法，此方法不产生垃圾


        int num=123;
        String strr1=num+"";
        System.out.println(strr1);
        System.out.println(strr1.getClass());


        String strr2=String .valueOf(66);
        System.out.println(strr2);
    }
}
