public class StringPalin {
    static boolean ispalin(String s,int l, int r){
        if(l>=r){
            return true;
        }
        if(s.charAt(l)!=s.charAt(r)){
            return false;
        }
        return ispalin(s, l+1, r-1);
        
    }
    static boolean checkpalin(String s){
        return ispalin(s, 0, s.length()-1);
    }
    public static void main(String[] args) {
        if(checkpalin("racecar")){
            System.out.println("Its a palindrome String");
        }
        else{
            System.out.println("Not a palindrome string");
        }
    }
}
