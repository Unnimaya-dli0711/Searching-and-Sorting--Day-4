package LinearSearch.com;

import java.util.Scanner;

public class FindMaximum {
    static int linearSearch(int[] array){
        int maximum=0;
        for(int i=0;i<array.length;i++){
            if(array[i]>=maximum)
                 maximum=array[i];
        }
        return maximum;
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

        int maximum= linearSearch(array);

        System.out.println("The maximum is "+maximum);
    }
}
