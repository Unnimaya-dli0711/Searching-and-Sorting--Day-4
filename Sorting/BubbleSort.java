package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    static void bubblesort(int [] array){
        int n=array.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
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

        bubblesort(array);
        System.out.println(Arrays.toString(array));
    }
}
