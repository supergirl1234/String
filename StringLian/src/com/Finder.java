package com;

/**
 * Author:Fanleilei
 * Created:2019/5/22 0022
 *
 */

//按照快排的思想，找出一个数组中倒数第K大的值

public class Finder{
    public int findKth(int[] a,int n,int k){
         return findkth(a,0,n-1, k);

    }
    public int findkth(int[] a,int low,int high,int k){

      int part=partation(a,low,high);
      if(k==part-low+1){
          return a[part];
      }else if(k>part-low+1){
          //只排后半部分
          return findkth(a,part+1,high,k-part+low-1);

      }else{
          //只排前半部分
          return findkth(a,low,part-1,k);
      }


    }

    private int partation(int[] a, int low, int high) {

        //大的数放在前面，小的数放在后面
        int key=a[low];
        while(low<high){

            while(low<high&&a[high]<=key){

                high--;
            }
            a[low]=a[high];
            while(low<high&&a[low]>key){

               low++;
            }
            a[high]=a[low];
        }
        a[low]=key;
        return low;
    }

    public static void main(String[] args) {

        int[] array=new int[]{12,3,7,9,13,6};
        Finder p=new Finder();
        int result=p.findKth(array,array.length,3);

        System.out.println("倒数第3大的值为："+result);
    }
}