package com.juc;

import java.util.Scanner;

/**
 * @author yw
 * @create 2022-08-28 20:39
 */
public class quicksort {
    public static void main(String[] args) {
        System.out.println("输入排序的数组，以逗号分开：");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] words = line.split(",");
        int[] arr=new int[words.length];
        System.out.println("排序前的数组：");
        for(int i=0;i< arr.length;i++){
            System.out.print(words[i]);
            arr[i]=Integer.parseInt(words[i]);
        }
        System.out.println();
//        System.out.println("排序过程");
        quicksort(arr, 0, arr.length-1);
        System.out.println("排序后的数组");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }

    public static void quicksort(int[] arr,int left,int right){
        if(left<right){
            int p=partition(arr, left, right);

            quicksort(arr, left, p-1);
            quicksort(arr, p+1, right);
        }
    }

    public static int partition(int[] arr,int left,int right){
        int p=arr[left];
        while(left<right){
        while (p<arr[right]&&left<right){
          //向右指针移动遇见小于p的元素
            right--;
        }
        arr[left]=arr[right];
        while(p>arr[left]&&left<right){
            left++;
        }
        arr[right]=arr[left];
        }
        arr[left]=p;
        return left;
    }

}
