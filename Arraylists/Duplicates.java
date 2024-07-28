package Arraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class Duplicates {
    public static void main(String[] args){
        Scanner scannerobject=new Scanner(System.in);
        System.out.println("Enter number of elements in array");
        int number=scannerobject.nextInt();
        ArrayList<Integer> array=new ArrayList<>();
        ArrayList<Integer> duplicates=new ArrayList<>();
        System.out.println("Enter the elements");
        for(int i=0;i<number;i++){
            array.add(scannerobject.nextInt());
        }
        for(int i=0;i<array.size();i++){
                int element=array.get(i);
                array.remove(i);
                if(array.contains(element)){
                    if(!duplicates.contains(element))
                        duplicates.add(element);
                }
        }
        System.out.println("duplicates are " +duplicates);
    }
}
