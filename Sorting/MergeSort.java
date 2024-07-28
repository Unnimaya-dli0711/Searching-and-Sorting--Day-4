package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    static void merge(int [] array,int left,int mid,int right){
        int rightarray=right-mid;
        int leftarray=mid-left+1;
        int rightArray[]=new int[rightarray];
        int leftArray[]=new int[leftarray];
        for(int i=0;i<leftarray;++i){
            leftArray[i]=array[left+i];
        }
        for(int j=0;j<rightarray;++j){
            rightArray[j]=array[mid+1+j];
        }
        int i=0,j=0;
        int k=left;
        while (i<leftarray && j<rightarray){
            if(leftArray[i]<=rightArray[j]){
                array[k]=leftArray[i];
                i++;
            }else {
                array[k]=rightArray[j];
                j++;
            }
            k++;
        }
        while(i<leftarray){
            array[k]=leftArray[i];
            i++;
            k++;
        }
        while(j<rightarray){
            array[k]=rightArray[j];
            j++;
            k++;
        }
    }

    static void mergesort(int [] array,int left,int right){
        if(left<right){
            int mid=left+(right-left)/2;
            mergesort(array,left,mid);
            mergesort(array,mid+1,right);
            merge(array,left,mid,right);

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

        mergesort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }
}
