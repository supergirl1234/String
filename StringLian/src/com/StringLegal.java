package com;

import java.util.Stack;

/**
 * Author:Fanleilei
 * Created:2019/5/24 0024
 *
 * 给定一个字符串A和它的长度n，判断其是否为一个合法的括号串
 */


 //方法思路：  碰到左括号“（”就入栈，碰到右括号“）”，就出栈，如果碰到右括号，出栈的时候，栈中为空则不合法；
// 如果右括号都没了，栈中还有元素，则也不合法；如果碰到非括号以外的元素则也不合法
public class StringLegal {

    public boolean chkParenthesis(String A, int n) {

        Stack<Character> stack=new Stack<>();
        if(A==null||A.length()!=n){

            return false;
        }
        for(int i=0;i<n;i++){
            if(A.charAt(i)=='('){
                stack.push(A.charAt(i));

            }else if(A.charAt(i)==')'){
                if(stack.size()==0){
                    return false;
                }else {
                    stack.pop();
                }
            }else{
                return false;
            }

        }
        return stack.size() == 0;
    }

    public static void main(String[] args) {
        StringLegal p=new StringLegal();
        //String str="()()()";
        String str="()()())";
        //String str="(a)()())";
        boolean result=p.chkParenthesis(str,str.length());
        System.out.println(result);
    }
}
