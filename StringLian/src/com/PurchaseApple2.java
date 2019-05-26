package com;

import java.util.Scanner;


/**
 * Author:Fanleilei
 * Created:2019/5/24 0024
 */

//首先，6和8都是偶数。因此，能凑出的个数也一定是偶数。程序中若苹果总数是奇数，可以直接返回-1。
//再次，偶数个苹果数对8取模，其结果只可能为0,2,4,6。
//若余数为6或者0，则可以直接用6包装情况处理，不需要回溯购买8包装的情况,则包装数为n/8+1;
//若余数为4，只需回溯1次即可，因为8+4=12, 12%6 =0,则需包装数n/8-1+(8+4)/6=n/8+1;
//若余数为2，只需回溯2次即可，因为8+8+2=18, 18%6 = 0,则需包装数n/8-2+(8+8+2)/6=n/8+1;
public class PurchaseApple2 {
    private static int NumberNeed(int n) {
        if(n%2!=0||n==10||n<6){

            return -1;
        }
        if(n%8==0){

            return n/8;
        }


        return 1+n/8;
    }

    public static void main(String[] args) {
        System.out.println("请输入想购买的苹果数量：");
        Scanner in=new Scanner(System.in);

        while(in.hasNextInt()){
           int n=in.nextInt();
            System.out.println(NumberNeed(n));
        }

    }

}
