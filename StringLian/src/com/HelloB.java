package com;

/**
 * Author:Fanleilei
 * Created:2019/5/24 0024
 */
class Test {

    public Test() {
        System.out.println("I'm A class");
    }


    static {
        System.out.println("static A");
    }

}
    public class HelloB extends Test1 {


        public HelloB() {
            System.out.println("I'm A class");
        }

        static {

            System.out.println("statuc B");
        }

        public static void main(String[] args) {
            new HelloB();

            boolean b=true?false:true==true?false:true;
            System.out.println(b);

        }
    }

