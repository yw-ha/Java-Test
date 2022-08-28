package com.juc;

/**
 * @author yw
 * @create 2022-08-28 10:17
 */
public class createThreadImplementRunnable implements Runnable{
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        createThreadextends create = new createThreadextends();
        create.start();

    }

    @Override
    public void run() {
        System.out.println("I have been used!");
        System.out.println(Thread.currentThread().getName());
    }
}
