package LinearSearch.com;

import java.util.Scanner;

public class StringIndex {
    static int linearSearch(String string,String[] array){
        for(int i=0;i<array.length;i++){
            if(array[i].equals(string))
                return i;
        }
        return -1;
    }
    public static void main(String [] args){
        Scanner scannerobject=new Scanner(System.in);
        System.out.println("Enter number of elements in array");
        int number=scannerobject.nextInt();
        String[] array=new String[number];
        System.out.println("Enter the elements");
        for(int i=0;i<number;i++){
            array[i]=scannerobject.next();
        }

        System.out.println("Enter the element whose index should be found");
        String string=scannerobject.next();
        int index= linearSearch(string,array);
        if(index==-1)
            System.out.println("The element not found");
        else
            System.out.println("The index of "+string+" is "+index);
    }
}
