package com;

/**
 * Author:Fanleilei
 * Created:2019/2/16 0016
 */
//String 是一种对象
public class Test1 {

    public static void code1() {
        //String对象实例化
        //1.直接实例化
         String str1="hello";//堆空间上开辟了一个内存块
         String str2="hello";//这种直接实例化的方法有入池共享的作用
        System.out.println(str1);
           //String对象的比较
        System.out.println(str1==str2);//true
        //2.构造方法
        String str3=new String("hello");//堆栈
        String str4=new String("hello");//堆空间上开辟了两个内存块，其中一个变成垃圾空间
        System.out.println(str3);
        System.out.println(str3==str4);//false

        int x=10;
        int y=10;
        System.out.println("x=y?"+(x==y));//true
        //==本身是进行数值比较的，如果用于对象比较，那么所比较的就是两个对象所保存的内存地址数值比较，而并没有比较对象的内容
        System.out.println(str2==str3);//false
        //equals用来比较对象的内容
        System.out.println("equals方法");
        System.out.println(str1.equals(str2));//true
        System.out.println(str1.equals(str3));//true
        System.out.println(str3.equals(str4));//true

        //有入池的方法intern()
        str3=str3.intern();//将字符串str3入池
        //或者直接用构造方法
        //String str=new String("hello").intern();
        System.out.println("入池之后，str1=str3?"+(str1==str3));//true
        System.out.println("但str4没有入池，str1=str4?"+(str1==str4));//false
    }

    //字符与字符串
    public static void code2() {
        //字符串不可更改，如果字符串进行更改，会创建新的字符串对象
        String str1="hello";
        str1=str1+"world";
        System.out.println(str1);

        //字符与字符串之间的转换
        char[] char1=new char[]{'q','s','s','d','e','5'};
        //将字符数组转换为字符串
        String newStr=new String(char1);
        System.out.println(newStr);
        //将字符数组部分转换为字符串
        String newStr2=new String(char1,2,2);
        System.out.println(newStr2);

        //字符串转换为字符数组
        char[] newchar=str1.toCharArray();
        for(int i=0;i<newchar.length;i++){
            System.out.print(newchar[i]+" ");

        }
        System.out.println();

        //取得字符串指定位置的字符
        char strw=str1.charAt(4);
        System.out.println(strw);
    }

    //判断一个字符串是否有数字组成
    public static void code4() {
        String str1="12345556";
        String str2="123ffe2";
        for(int i=0;i<str2.length();i++){
            if(str2.charAt(i)<'0'||str2.charAt(i)>'9'){
                System.out.println("这个字符串不是全由数字组成");
                break;
            }

        }


    }

    //字节与字符串
    public static void code3(){

        //字节与字符串的转换
        //将字节数组转换为字符串
        byte[] byte1 = new byte[]{3, 7, 94, 45, 34, 90};
        String strByte = new String(String.valueOf(byte1));
        System.out.println(strByte);

        //将字符串转换为字节数组
        String str1="world";
        byte[] bytes=str1.getBytes();
        for(int i=0;i<bytes.length;i++){
            System.out.print(bytes[i]+" ");

        }
        System.out.println(new String(bytes));
    }

    //字符串比较
    public static void code5() {
        String str1="hello";
        String str2="World";
        String str3="Hello";
        //区分大小写的比较
        System.out.println(str1.equals(str2));
        //不区分大小写的比较
        System.out.println(str1.equalsIgnoreCase(str3));

        //compareTo()方法返回一个整型，
        //1. 相等：返回0.
        //2. 小于：返回内容小于0.
        //3. 大于：返回内容大于0。
        System.out.println(str1.compareTo(str2));//17
        System.out.println(str1.compareTo(str3));//32
        System.out.println(str3.compareTo(str1));//-32

    }


    //字符串查找
    public static void code6() {
        String str1="heklogeuworldxhsjs";
        System.out.println(str1.contains("world"));//true

        System.out.println(str1.indexOf("world"));//8
        System.out.println(str1.indexOf("world",9));//-1
        System.out.println(str1.lastIndexOf("world"));//8
        System.out.println(str1.lastIndexOf("world",7));//-1  从指定位置由后向前查找

       //startWith  是否以某字符串开头
        System.out.println(str1.startsWith("hek"));//true
         //从指定位置开始，判断是否以某字符串开头
        System.out.println(str1.startsWith("j",6));//false
       //endWith
        System.out.println(str1.endsWith("sjs"));//true
    }

    //字符串替换、拆分、截取
    public static void code7() {
        String str1="halloworbeijinghangzhou";

        //替换所有的指定内容
        String newstr1=str1.replaceAll("ha","---");
        System.out.println(newstr1);

        //替换首个内容
        String newstr2=str1.replaceFirst("ha","--");
        System.out.println(newstr2);


        //字符串拆分
        String[] strnew=str1.split("o");//以o为分界点
        for(int i=0;i<strnew.length;i++){
            System.out.print(strnew[i]+" ");

        }
        System.out.println();

        //将字符串部分拆分，且设置数组的长度
        String[] strnew2=str1.split("o",3);//以o为分界点，且数组长度为3
        for(String p:strnew2){
            System.out.print(p+" ");

        }
        System.out.println();


        String str3 = "张三:28:男|王五:18:男|李四:18:女";
        String[] persons = str3.split("\\|");
        for(int i=0; i<persons.length;i++){
            String person = persons[i];
            String[] infos = person.split(":");
            System.out.println("姓名："+infos[0]+" 年龄："+infos[1]+" 性别："+infos[2]);
        }


    //字符串截取
        String strr1=str1.substring(2);
        System.out.println(strr1);
        String strr2=str1.substring(2,9);
        System.out.println(strr2);


    }

    //字符串的其他方法
    public static void code8() {

        //trim()  去掉字符串中的左右空格，保留中间空格
        String str="  hello world!!  ";
        System.out.println("["+str+"]");
        System.out.println("["+str.trim()+"]");

        //字符串转大写
        System.out.println(str.toUpperCase());

        //isEmpty()  判断是否为空字符串，但不是null，而是长度为0
        System.out.println("hello".isEmpty());//false
        System.out.println("".isEmpty());//true
        System.out.println(" ".isEmpty());//false

    }

    public static void main(String[] args) {
        //StringBuffer  线程安全
        //StringBuilder   线程不安全

        StringBuffer sb=new StringBuffer();
        sb.append("hello").append("123").append("jing");
        System.out.println(sb);

        //将StringBuffer转换为String，用toString()方法
        System.out.println(sb.toString());

        //StringBuffer的一些方法
        //字符串反转
        StringBuffer fan=sb.reverse();//字符串反转，将得到的新值又赋给了原字符串
        System.out.println(fan);
        //删除指定范围的数据
        System.out.println(sb.delete(2,6));
        //在指定范围插入数据,可以插入各种数据类型
        System.out.println(sb.insert(0,"str"));

    }



}
