package BitManipulation;

import java.util.Scanner;

public class NonRepeating {
    static void nonrep(int[] arr){
        int res = 0;
        for(int i =0;i<arr.length;i++){
            res ^=arr[i];
        }
        System.out.println("The non repeating element = "+res);
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the Size of an array = ");
            int size = sc.nextInt();
            int [] arr = new int[size];
            System.out.print("Enter your Array = ");
            for(int i =0;i<size;i++){
                arr[i] = sc.nextInt();
            }
            nonrep(arr);
        }

    }
}
