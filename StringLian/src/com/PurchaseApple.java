package com;

import java.util.Scanner;

/**
 * Author:Fanleilei
 * Created:2019/5/24 0024
 */
public class PurchaseApple {

    public static int NumberNeed(int sum){

        if(sum<6){
            return -1;

        }
        int x;
        int y;
        int num;
        int count=0;
        int result=Integer.MAX_VALUE;
        x=sum/6;
        y=sum/8;
        //如果能被整除
        if((sum%6)==0){
            if(x<result ){
                result=x;
            }


        }
        if((sum%8)==0 ){
            if(y<result){
                result=y;
            }

        }
       for(num=y;num<=x;num++){


           if((sum-num*6)%8==0){
               count=num+(sum-num*6)/8;
               if(count<result){
                   result=count;
               }
           }

           if((sum-num*8)%6==0){
               count=num+(sum-num*8)/6;
               if(count<result){
                   result=count;
               }
           }
       }
       if(result==Integer.MAX_VALUE){

            return -1;
       }

        return result;

    }

    public static void main(String[] args) {

        System.out.println("请输入想购买的苹果数量：");
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        int result=NumberNeed(num);
        System.out.println(result);

    }
}
