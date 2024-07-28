package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    static void selectionsort(int [] array){
        int n=array.length;
        for(int i=0;i<n-1;i++){
            int min_index=i;
            for(int j=i+1;j<n;j++){
                if(array[j]<array[min_index]){
                    min_index=j;
                }

                    int temp=array[i];
                    array[i]=array[min_index];
                    array[min_index]=temp;

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

        selectionsort(array);
        System.out.println(Arrays.toString(array));
    }
}
