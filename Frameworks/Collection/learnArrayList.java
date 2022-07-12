import java.util.*;
public class learnArrayList{
    public static void main(String[] args) {
        List<Integer> Num = new ArrayList<>();
        Num.add(3);
        Num.add(4);
        Num.add(5);
        Num.add(6);
        System.out.println(Num);
        Num.add(7);
        System.out.println(Num);// add method is always adds the element at last index
        Num.add(1,5);//in this we can add the element at a Specific  index
        System.out.println(Num);
        List<Integer> newNum = new ArrayList<>();
        newNum.add(55);
        newNum.add(120);
        newNum.addAll(Num);//addAll method is used to copy all elments of Num into newNum 
        System.out.println(newNum);
        //Get function
        System.out.println(Num.get(0));// get function is used to get the elemrnt at a specified index
        // remove Function
        Num.remove(4);// Remove function is used to remove the element at a specific index
        System.out.println(Num);
        /* whenevr you remove the unexisted index elemrnts it shows the outofbound Exception  */
        Num.remove(Integer.valueOf(7));
        System.out.println(Num);
        //clear function
        Num.clear();
        System.out.println(Num);// Clear function is used to remove all elements from a list
        System.out.println(newNum.contains(5));// it is used to check whether the element is present or not     it returns the boolean
        //Set function
        newNum.set(4, 22);
        System.out.println(newNum);
        //iteration methods
        //1.Using For loop
        for(int i =0;i<newNum.size();i++){
            System.out.println("The elmenent is "+newNum.get(i));
        }
        //2.using for each loop
        for (Integer element : newNum) {
            System.out.println("The element is "+element);
        }
        //3.Iteration method
        Iterator<Integer> it = newNum.iterator();
        while(it.hasNext()){
            System.out.println("the iterator "+it.next());
        }

    }
}