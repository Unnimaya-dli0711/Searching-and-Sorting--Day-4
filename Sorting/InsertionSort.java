package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    static void insertionsort(int [] array){
        int n=array.length;
        for(int i=1;i<n;i++){
            int key=array[i];
            int j=i-1;
            while (j>=0 && array[j]>key){
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=key;
        }
    }
    public static void main(String[] args){
        Scanner scannerobject=new Scanner(System.in);
        System.out.println("Enter number of elements in array");
        int number=scannerobject.nextInt();
        int[] array=new int[number];
        System.out.println("Enter the elements ");
        for(int i=0;i<number;i++){
            array[i]=scannerobject.nextInt();
        }

        insertionsort(array);
        System.out.println(Arrays.toString(array));
    }
}
