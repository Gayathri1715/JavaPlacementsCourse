package BitManipulation;
import java.util.*;

public class Swapping {
    static void swap(int a, int b){
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("a = "+a);
        System.out.println("b = "+b);

    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your first digit = ");
            int a = sc.nextInt();
            System.out.print("Enter your second digit = ");
            int b = sc.nextInt();
            swap(a, b);
        }
    }

}
