public class fibnocci {
    static int fib(int n){
        if(n==0) return 0;
        if(n==1||n==2) return 1;
        return fib(n-2)+fib(n-1);
    }
    public static void main(String[] args) {
        int n = 20;
        for(int i=0;i<=n;i++){
            System.out.println(fib(i)+" ");
        }
    }
}
