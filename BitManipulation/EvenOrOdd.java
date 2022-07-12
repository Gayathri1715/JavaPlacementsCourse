public class EvenOrOdd {
    static void evencheck(long n){
        if((n&1)==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
    public static void main(String[] args) {
        evencheck(3);
    }
}
