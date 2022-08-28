package com.juc;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @author yw
 * @create 2022-08-28 10:32
 */
public class createThreadCallable implements Callable<Integer> {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        new createThreadextends().start();

    }

    @Override
    public Integer call() throws Exception {
        System.out.println(Thread.currentThread().getName());
        return 1;
    }
}
