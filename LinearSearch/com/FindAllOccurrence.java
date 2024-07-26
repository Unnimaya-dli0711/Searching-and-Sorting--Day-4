package LinearSearch.com;

import java.util.Scanner;

public class FindAllOccurrence {
    static void linearSearch(int element,int[] array){
        int flag=0;
        System.out.println("The index of "+element+" is ");
        for(int i=0;i<array.length;i++){
            if(array[i]==element){
                flag=1;
                System.out.println(i);
            }

        }
        if(flag==0)
            System.out.println("The element not found");
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
        linearSearch(element,array);
    }
}
