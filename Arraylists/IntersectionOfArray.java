package Arraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class IntersectionOfArray {
    public static void main(String[] args) {
        Scanner scannerobject = new Scanner(System.in);
        System.out.println("Enter number of elements in first array ");
        int number1 = scannerobject.nextInt();
        System.out.println("Enter number of elements in second array");
        int number2 = scannerobject.nextInt();
        ArrayList<Integer> array1 = new ArrayList<>();
        ArrayList<Integer> array2 = new ArrayList<>();
        ArrayList<Integer> intersection = new ArrayList<>();
        System.out.println("Enter the elements of first array");
        for (int i = 0; i < number1; i++) {
            array1.add(scannerobject.nextInt());
        }
        System.out.println("Enter the elements of second array");
        for (int i = 0; i < number2; i++) {
            array2.add(scannerobject.nextInt());
        }
        for (int i = 0; i < array1.size(); i++) {
            if (array2.contains(array1.get(i))) {
                if(!intersection.contains(array1.get(i)))
                intersection.add(array1.get(i));
            }
        }
        System.out.println(intersection);
    }
}
