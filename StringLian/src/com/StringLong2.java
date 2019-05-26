package com;

import java.util.Scanner;

/**
 * Author:Fanleilei
 * Created:2019/5/26 0026
 *  找出字符串中连续最长的数字串
 */
//方法：用max表示经过的数字长度最大值，count表示数字计数器，当为字母时重置为0，end表示数字尾部，
// 每次满足数字时，对max进行判断，当max小于count时，更新max和end
public class StringLong2 {

    public static void StringMaxLong(String str){

        int max=0;
        int count=0;
        int end=0;
        for(int i=0;i<str.length();i++){

            if(str.charAt(i)>='0'&&str.charAt(i)<='9'){

                count++;
                if(count>max){
                    max=count;
                    end=i;

                }
            }else{

                count=0;
            }
        }
        System.out.println(str.substring(end-max+1,end+1));
    }

    public static void main(String[] args) {

        System.out.println("请输入一个字符串");
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            String str=in.nextLine();
            StringMaxLong(str);

        }


    }
}
