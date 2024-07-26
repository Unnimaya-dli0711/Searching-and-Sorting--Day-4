package BinarySearch;

import java.util.Scanner;

public class RotatedSortedArray {
    static int binarySearch(int element,int[] array){
        int left=0,right=array.length-1;

        while (left<=right){
            int mid=(left+right)/2;
            if(array[mid]==element)
                return mid;
            //array sorted in the left half
            else if (array[left]<array[mid]) {
                if(element<array[mid])
                    right=mid-1;
                else
                    left=mid+1;
            }else {
                if(element>array[mid])
                    left=mid+1;
                else
                    right=mid-1;
            }
        }
        return -1;
    }
    public static void main(String [] args){
        Scanner scannerobject=new Scanner(System.in);
        System.out.println("Enter number of elements in array");
        int number=scannerobject.nextInt();
        int[] array=new int[number];
        System.out.println("Enter the elements");
        for(int i=0;i<number;i++){
            array[i]=scannerobject.nextInt();
        }

        System.out.println("Enter the element whose index should be found");
        int element=scannerobject.nextInt();
        int index= binarySearch(element,array);
        if(index==-1)
            System.out.println("The element not found");
        else
            System.out.println("The index of "+element+" is "+index);
    }
}
