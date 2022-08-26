package com.datastructure;


import java.util.*;

/**
 * @author yw
 * @create 2022-08-26 17:37
 */
public class bubblesort {
    public static void main(String[] args) {
        //从键盘输入整数以逗号隔开
        System.out.println("输入需排序的字符以逗号隔开");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] words=line.split(",");
        int[] input=new int[words.length];
        System.out.println("------排序前--------");
        for(int i=0;i<input.length;i++){
            input[i]=Integer.parseInt(words[i]);
            System.out.print(input[i]+" ");
        }
        System.out.println();
        for(int i=0;i<input.length;i++){
            for(int j=0;j<input.length-i-1;j++){
                if(input[j]>input[j+1]){
                    int temp=input[j];
                    input[j]=input[j+1];
                    input[j+1]=temp;
                }
            }

        }
        System.out.println("------排序后--------");
        for(int i=0;i<input.length;i++){
            System.out.print(input[i]+" ");
        }
        System.out.println();
    }
}