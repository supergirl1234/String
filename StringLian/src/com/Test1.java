package com;

/**
 * Author:Fanleilei
 * Created:2019/5/26 0026
 */
public class Test1 {
    static int i = 0;
    public int aMethod(){
        //static int i = 0;该句不能放在这里
        i++;
        return i;
    }
    public static void main(String args[]){
        Test1 test = new Test1();
        test.aMethod();
        int j = test.aMethod();
        System.out.println(j);
    }
}