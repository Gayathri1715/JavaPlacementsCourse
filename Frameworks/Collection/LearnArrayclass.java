import java.util.*;

public class LearnArrayclass {
    
    public static void main(String[] args) {
        int[] num = {1,5,3,5,68,2,44,879};
        int index = Arrays.binarySearch(num,5);
        System.out.println("The index of number 5 in the array at "+index);

        Arrays.sort(num);

        Arrays.fill(num, 24);
        for(int numbers:num){
            System.out.println(numbers);
        }


    }
}
