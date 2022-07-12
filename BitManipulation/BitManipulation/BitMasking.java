package BitManipulation;
public class BitMasking{
    public static void main(String[] args) {
        long n = 5 ;
        long k=1;
        printkthBIT(n, k);
        clearkthBit((int)n, (int)k);
    }
    static void printkthBIT(long n, long k){
        System.out.println( ((n & (1 << (k - 1))) >> (k - 1)));
    }
    static void clearkthBit(int n, int k){
        System.out.println(n & (~(1<<(k-1))));
    }
}