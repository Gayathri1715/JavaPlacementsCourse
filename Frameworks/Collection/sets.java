import java.util.*;
class student{
    String name;
    int rollNo;

    public student(String name, int rollNo){
        this.name=name;
        this.rollNo = rollNo;
    }
    @Override
    public String toString(){
        return "Student{"+"name = "+name+ ", rollNo"+rollNo+"}";
    }
    @Override
    public boolean equals(Object o){
        if(this==o) return true;
        if(o==null || getClass() !=o.getClass()) return false;
        student stu = (student)o;
        return rollNo == stu.rollNo;
    }
    @Override
    public int hashCode(){
        return Objects.hash(rollNo);
    }
}


public class sets {//In sets duplicate elements are not allowed
    

    public static void main(String[] args) {
       /*  Set<Integer>set = new HashSet<>();
        Set<Integer> set = new LinkedHashSet<>(); */
        Set<Integer> set = new TreeSet<>();//Sorted form
        Set<student> studentset = new HashSet<>();
        studentset.add(new student("Anuj", 12));
        studentset.add(new student("Srinivas", 7 ));
        studentset.add(new student("ganesh", 5));
        studentset.add(new student("Anuj",12));
        System.out.println(studentset);
        student s1 = new student("Srinivas", 2);
        student s2 = new student("Anuj", 2);
        System.out.println(s1.equals(s2 ));

        /* set.add(3);
        set.add(12);
        set.add(56);
        set.add(45);
        set.add(45);

        System.out.println(set);
        set.remove(12);
        System.out.println(set);
        System.out.println(set.isEmpty());
        set.clear();
        System.out.println(set);
        System.out.println(set.isEmpty());
 */
        
    }
}
