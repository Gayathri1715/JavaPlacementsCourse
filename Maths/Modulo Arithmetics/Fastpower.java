public class Fastpower {
    static long fastpower(long a, long b,long n){//a^b
        long res =1;
        while(b>0){
            if((b&1)!=0){
                res = (res*a%n)%n;
            }
            a = a*(a%n);
            b>>=1;// for division
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(fastpower(9,15,100000));//9 power 15
    }
}
