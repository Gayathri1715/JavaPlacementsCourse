public class PalindromeNum {
    static void palin(int n){
        int sum=0;
        int r=0;
        int temp = n;
        while(n>0){
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        if(sum==temp){
            System.out.println("Palindrome Number");
        }else{
            System.out.println("Not Palindrome");
        }
    }
    public static void main(String[] args) {
        palin(544);
    }
}
