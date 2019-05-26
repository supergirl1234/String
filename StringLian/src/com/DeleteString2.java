package com;

import java.util.Scanner;

/**
 * Author:Fanleilei
 * Created:2019/5/26 0026
 *
 * 从第一个字符串中删除第二个字符串的所有字符
 */
public class DeleteString2 {

    public static void main(String[] args) {

        System.out.println("请输入字符串：");
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            char[] ch=in.nextLine().toCharArray();
            String str=in.nextLine();
            for(int i=0;i<ch.length;i++){
                if(!str.contains(String.valueOf(ch[i]))){

                    System.out.print(ch[i]);
                }
            }


        }
    }
}
