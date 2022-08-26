package com.datastructure;


import java.util.Scanner;

/**
 * @author yw
 * @create 2022-08-26 20:08
 */
public class selectsort {
    public static void main(String[] args) {
        System.out.println("输入需排序的数组逗号分隔");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] words = str.split(",");
        int[] arr=new int[words.length];
        System.out.println("----------排序前-------------");
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(words[i]);
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    int temp1=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp1;
                }

            }
        }
        System.out.println("------------排序后--------------");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
