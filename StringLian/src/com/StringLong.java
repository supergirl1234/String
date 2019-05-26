package com;

import java.util.Scanner;

/**
 * Author:Fanleilei
 * Created:2019/5/24 0024
 *
 * 找出字符串中连续最长的数字串
 */
public class StringLong {


    public static String LongNumberString(String str){
       if(str.length()==0){

           return null;
       }
        int max=0;
        String longString=null;

        for(int i=0;i<str.length();i++){
            if(!(str.charAt(i)>=48&&str.charAt(i)<=57)){
                continue;
            }

            int count=0;

            StringBuilder sb = new StringBuilder();
            for(int k=i;k<str.length();k++) {

                if(str.charAt(k)>=48&&str.charAt(k)<=57){
                    count++;
                    sb.append(str.charAt(k));
                }else{


                    break;
                }

            }
            if(count>max) {
                max = count;
                longString= sb.toString();
            }
            i=i+max-1;//直接跳过中间那几个数字

        }


        return longString;
    }

    public static void main(String[] args) {
        System.out.println("请输入一个字符串：");

        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        String result=LongNumberString(str);
        System.out.println(result);

    }
}
