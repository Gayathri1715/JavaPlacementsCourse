package BitManipulation;

public class TwoNonRepeat {
    static void nonrep2(int [] arr){
        int res = 0;
        for(int i=0;i<arr.length;i++){
            res^=arr[i];
        }
        res = (res&-res);
        int res1=0;
        int res2=0;
        for(int i=0;i<arr.length;i++){
            if((arr[i]&res)>0){
                res1^=arr[i];
            }
            else{
                res2^=arr[i];
            }
        }
        System.out.println("The two non repeating elements are "+res1+ " And "+res2);
    }
    public static void main(String[] args) {
        int[] arr ={1,4,5,1,3,5};
        nonrep2(arr);
    }
}
