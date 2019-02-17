package com;

/**
 * Author:Fanleilei
 * Created:2019/2/17 0017
 */

//Object可以接收所有数据类型
public class Test4 {
    public static void code1() {
        //可以接收数组对象
        Object object=new int[]{1,2,3,4,5};
        //要向下转型，强转
        int[] data= (int[]) object;
        for(int p:data){

            System.out.print(p+" ");
        }

    }

    public static void main(String[] args) {

        //Object可以接收接口对象
        Message message=new Message();
        Object object=message;
        System.out.println(object);
        //还是要向下转型，强转
        ((Message) object).print();


    }

}

interface  getMessage{

    void print();
}
class Message implements getMessage{


    @Override
    public void print() {
        System.out.println("这是我获取的信息");
    }
}