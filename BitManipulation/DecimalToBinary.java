public class DecimalToBinary {
    static void conversion(int k){
        int i =0;
        int[] binary = new int[1000];
        while (k>0){
            binary[i] = k%2;
            k=k/2;
            i++;
        }
        for(int j = i-1;j>=0;j--){
            System.out.print(binary[j]);
        }

    }public static void main(String[] args) {
        conversion(7);
    }
}
