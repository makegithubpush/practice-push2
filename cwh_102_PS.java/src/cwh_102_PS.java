import java.util.ArrayList;
import java.util.HashSet;

public class cwh_102_PS {
    public static void main(String[] args) {
       //PS 1
        ArrayList ar = new ArrayList();
        ar.add("Student1");
        ar.add("Student2");
        ar.add("Student3");
        ar.add("Student4");
        ar.add("Student5");
        ar.add("Student6");
        ar.add("Student7");
        ar.add("Student8");
        ar.add("Student9");
        ar.add("Student10");
        for(Object o: ar){
            System.out.println(o);

        //PS 5
            HashSet<Integer> s = new HashSet();
            s.add(5);
            s.add(6);
            s.add(46);
            s.add(68);
            s.add(9);
            s.add(9);
            s.add(6);
            System.out.println(s);
        }
    }
}