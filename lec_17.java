package lec_17;
public class jagged_arrays {
    static void print_jaggu(int arr[][]){
        //printing jagged array properly
        //all rows in separate lines
        for(int i=0;i<arr.length;i++){ //rows 
            for(int j=0;j<arr[i].length;j++){ //coloums
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[][]=new int[3][];
        arr[0]=new int[3];
        arr[1]=new int[2];
        arr[2]=new int[3];
        print_jaggu(arr);
        int arr2[][]=new int[3][];
        // we can't use initializer list here, since it doesn't create an object
        // arr[0]={1,2,3};
        // arr[1]={4,5};
        // arr[2]={6,7,8};
        arr2[0]=new int[] {1,2,3};
        arr2[1]=new int[] {4,5};
        arr2[2]=new int[] {6,7,8};
        System.out.println("-----------------------------------");
        print_jaggu(arr2);
    }
}
//scanner

import java.util.Scanner;
public class scanner_class {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name : ");
        String f_name=sc.next();// will take input untill the next whitespace
        String l_name=sc.next();
        System.out.println("Enter your profession : ");
        String prof=sc.next();
        sc.nextLine();
        System.out.println("Enter your Address : ");
        String pata=sc.nextLine();
        System.out.println("Name : "+f_name+""+ l_name);
        System.out.println("Profession : "+prof);
        System.out.println("Address : "+pata);
    }
}
