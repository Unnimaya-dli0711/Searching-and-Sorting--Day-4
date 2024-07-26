package BinarySearch;

import java.util.Scanner;

public class FirstAndLastIndex {
    static int firstSearch(int element,int[] array,int left,int right){
        int mid=(left+right)/2;
         if (left<=right){
            if(array[mid]==element &&(mid==0 || array[mid-1]<element))
                return mid;
            else if (array[mid]>element) {
                return firstSearch(element,array,left,mid-1);
            }else {
                return firstSearch(element,array,mid+1,right);
            }
        }
        return -1;
    }

    static int lastSearch(int element,int[] array,int left,int right){
        int mid=(left+right)/2;
        if (left<=right){
            if(array[mid]==element &&(mid==array.length-1 || array[mid+1]>element))
                return mid;
            else if (array[mid]>element) {
                return lastSearch(element,array,left,mid-1);
            }else {
                return lastSearch(element,array,mid+1,right);
            }
        }
        return -1;
    }

    public static void main(String [] args){
        Scanner scannerobject=new Scanner(System.in);
        System.out.println("Enter number of elements in array");
        int number=scannerobject.nextInt();
        int[] array=new int[number];
        System.out.println("Enter the elements in ascending order");
        for(int i=0;i<number;i++){
            array[i]=scannerobject.nextInt();
        }

        System.out.println("Enter the element whose index should be found");
        int element=scannerobject.nextInt();
        int left=0;
        int right=array.length-1;
        int firstindex= firstSearch(element,array,left,right);
        int lastindex=lastSearch(element,array,left,right);

        System.out.println("The first index of "+element+" is "+firstindex);
        System.out.println("The last index of "+element+" is "+lastindex);
    }
}
