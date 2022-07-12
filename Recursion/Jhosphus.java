public class Jhosphus {
    static int shoot(int n, int k){
        if(n==1)return 0;
        return (shoot(n-1, k)+k)%n;  
    }
    public static void main(String[] args) {
        System.out.println(shoot(8, 3));
    }
}
