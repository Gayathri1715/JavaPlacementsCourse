public class GCD {
    //By using Eulcid mathematics
    static int gcd(int a, int b){
        return b==0 ? a:gcd(b, a%b);
    }
    public static void main(String[] args) {
        System.out.println(gcd(37, 17));
        
    }
}