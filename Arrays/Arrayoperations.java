package Arrays;

public class Arrayoperations {
    public static void main(String[] args) {
        // lets do all in one line
        int[] Number_Array = {4, 5, 6, 8, 9, 0};//this is called initialization
        System.out.println(Number_Array);// since it doesn't print our elements rather than it prints random hash code
        //To print elements in an array we have to traversing through the array
        for (int element : Number_Array) {
            System.out.printf("[%d, ]", element);
        }
//        we can print specific element in an array by index value Actually it's starts from 0 and etc
        System.out.println(Number_Array[0]);
    }
}
