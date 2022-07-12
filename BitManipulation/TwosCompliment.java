public class TwosCompliment {
    static void twos(long k){
        long Compliment = (~k)+1;
        System.out.println(Compliment);
    }
    public static void main(String[] args) {
        twos(5);
    }
}
