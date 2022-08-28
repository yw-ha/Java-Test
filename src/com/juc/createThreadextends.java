package com.juc;

/**
 * @author yw
 * @create 2022-08-28 10:06
 */
public class createThreadextends extends Thread{
    public static void main(String[] args) {
        createThreadextends thread = new createThreadextends();
        System.out.println(Thread.currentThread().getName());
        thread.setName("t1");
        thread.start();//开启线程
    }

    @Override
    public void run() {
        System.out.println("I have been used!");
        System.out.println(Thread.currentThread().getName());
    }
}
