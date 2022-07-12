public class PalindromeString {
    static void palin(String s){
        int sLength = s.length();
        String reve ="";
        for(int i=(sLength-1);i>=0;--i){
            reve = reve+s.charAt(i);
        }
        if(s.equalsIgnoreCase(reve.toLowerCase())){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
        } 
        public static void main(String[] args) {
            palin("madam");
        }
    }

