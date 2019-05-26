package com;

import java.util.Stack;

/**
 * Author:Fanleilei
 * Created:2019/5/25 0025
 */
public class QueueByStack {

    private Stack<Integer> stack1 = new Stack<Integer>();
    private Stack<Integer> stack2 = new Stack<Integer>();


    public void push(int node) {
        stack1.push(node);


    }

    public int pop() {
        if(stack2.isEmpty()&&stack1.isEmpty()){


            throw new Error("队列中没有元素了");

        }
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()) {
                int num = stack1.pop();
                stack2.push(num);
            }
        }

        return stack2.pop();

    }
    public static void main(String[] args) {
        QueueByStack queue=new QueueByStack();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());


    }
}
