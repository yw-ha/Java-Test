package com.datastructure;
import java.util.Scanner;

/**
 * @author yw
 * @create 2022-08-27 20:32
 */
public class insertSort {
    public static void main(String[] args) {
        System.out.println("输入待排序的数组以逗号分开：");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] words = line.split(",");
        int[] input = new int[words.length];
        insertSort insertSort = new insertSort();
        System.out.println("----------排序前---------------");
        for(int i=0;i<input.length;i++){
            input[i]=Integer.parseInt(words[i]);
            System.out.print(input[i]+" ");
        }
        System.out.println();
        for(int i=1;i<input.length;i++){
            for(int j=0;j<i;j++){
                if(input[i]<input[j])
                {
                    insertSort.insert(input,i,j);
                    break;
                }

            }

        }
        System.out.println("----------排序后---------------");
        for(int i=0;i<input.length;i++){
            System.out.print(input[i]+" ");
        }
    }

    public int[] insert(int[] arr,int i,int j){

        int[] arr1=new int[i+1];
        for(int k=0;k<j;k++){
            arr1[k]=arr[k];
        }
        for(int k=j+1;k<= i;k++){
            arr1[k]=arr[k-1];
        }
        arr1[j]=arr[i];
        for(int s=0;s<=i;s++){
            arr[s]=arr1[s];
        }
        return arr;
    }
}
