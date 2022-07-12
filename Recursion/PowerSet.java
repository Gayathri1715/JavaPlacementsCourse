public class PowerSet {
    static void powerSet(String s,int i,String cur){
        if(i==s.length()){
            System.out.println(cur);
            return;
        }
        else{
            powerSet(s, i+1, cur+s.charAt(i));
            powerSet(s, i+1, cur);
        }
    }
    public static void main(String[] args) {
        String s = "abc";
        int i =0;
        String cur = "";
        powerSet(s, i, cur);
    }
}
