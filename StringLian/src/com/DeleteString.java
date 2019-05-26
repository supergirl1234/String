package com;


import java.util.Scanner;

/**
 * Author:Fanleilei
 * Created:2019/5/24 0024
 * 从第一个字符串中删除第二个字符串的所有字符
 */
//思路：将字符串A中没有出现在字符串B中的的字符保存在数组中
public class DeleteString {

    public static  String deleteFromString(String strA,String strB){
        if(strA==null){
            return null;
        }
        if(strB==null){
            return strA;
        }
        char[] stringArray=new char[strA.length()];

        int num=0;

            for (int i = 0; i < strA.length(); i++) {
                char deleChar = strA.charAt(i);
                int k;
                for ( k = 0; k < strB.length(); k++) {
                    if (deleChar==strB.charAt(k)) {
                        break;

                    }


                }
                 if(k==strB.length()){
                    stringArray[num] = deleChar;
                    num = num + 1;
                }

            }
            //将数组转为字符串
        StringBuilder str=new StringBuilder();
        for (char aStringArray : stringArray) {
            str.append(aStringArray);

        }



        return str.toString();

    }
    public static void main(String[] args) {

        System.out.println("请输入两个字符串：");
        Scanner in=new Scanner(System.in);
        String str1=in.nextLine();
        String str2=in.nextLine();
        String result=deleteFromString(str1,str2);
        System.out.println(result);

    }
}
