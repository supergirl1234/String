package com;

import java.util.Scanner;

/**
 * Author:Fanleilei
 * Created:2019/5/22 0022
 */
//在一个字符串中插入另一个字符串，判断新字符串是否是回文结构
public class Main {


   private static boolean isHuiwen(String newString){
/*

            int k;
            int j;
            for( k=0,j=newString.length()-1;k<j;k++,j--){

                //if(!newString.substring(k,k).equals(newString.substring(j,j))){
                if(!(newString.charAt(k)==newString.charAt(j))){
                    break;
                }

            }
           if(k==j||k==j+1){
               count++;
           }
*//*


       StringBuffer newnewString = new StringBuffer();
        for(int i=newString.length();i>=1;i--) {
            newnewString = newnewString.append(newString,i-1,i);
        }

       int k;
        for( k=0;k<newString.length()/2;k++) {
            if (!(newnewString.charAt(k)==newnewString.charAt(k))) {
               break;
            }
        }
        if(k==newnewString.length()/2){

            count++;
        }
*/

       int i=0;
       int j=newString.length()-1;
       while(i<j){
           if(newString.charAt(i)!=newString.charAt(j)){
               return false;
           }


           i++;
           j--;


       }
       return true;

    }

    /*private static void Insert(String strA,String strB){
        StringBuffer newString = new StringBuffer();

        if(strA==null&&strB==null){
            return;

        }
        if(strA==null){
            newString=newString.append(strB);
            isHuiwen(newString.toString());

        }else if(strB==null){
            newString=newString.append(strA);
            isHuiwen(newString.toString());

        }else {

            for (int i = 0; i <=strA.length(); i++) {

                newString = newString.append(strA, 0, i).
                        append(strB).append(strA, i, strA.length());

                isHuiwen(newString.toString());
                *//*int k;
                int j;
                for (k = 0, j = newString.length() - 1; k < j; k++, j--) {

                    //if(!newString.substring(k,k).equals(newString.substring(j,j))){
                    if (!(newString.charAt(k) == newString.charAt(j))) {
                        break;
                    }

                }
                if (k == j || k == j + 1) {
                    count++;
                }
*//*
            }
        }

    }
*/
    public static void main(String[] args) {


        System.out.println("请输入第一个字符串");
        Scanner in=new Scanner(System.in);
        String str1=in.nextLine();
        System.out.println("请输入第二个字符串");
        String str2=in.nextLine();
        int count=0;
        for(int i=0;i<str1.length();i++){
            StringBuffer sb=new StringBuffer(str1);
            sb.insert(i,str2);
            if(isHuiwen(sb.toString())){
                count++;
            }

        }
        //Insert(str1,str2);
        System.out.println("结果为："+count);

    }


}
