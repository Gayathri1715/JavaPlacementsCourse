import java.util.Stack;
public class Stacks {
    public static void main(String[] args) {
        Stack<Integer> Num = new Stack<>();
        Num.push(5);
        Num.push(4);
        Num.push(7);
        System.out.println(Num);
        System.out.println(Num.peek());
        Num.pop();
        System.out.println(Num);
        System.out.println(Num.peek());
    }
}
