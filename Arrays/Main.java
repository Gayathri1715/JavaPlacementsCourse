package Arrays;

class LowArray{
    private long[] a;
    public LowArray(int size){
        a = new long[size];
    }
    public void setEle(int index, int value){
        a[index] = value;
    }
    public long getEle(int index){
        return a[index];
    }
}

public class Main {
    public static void main(String[] args) {
        LowArray arr ;
        arr = new LowArray(100);
        int nElements = 0;
        int j;

        arr.setEle(0,1);
        arr.setEle(1,5);

    }
}
