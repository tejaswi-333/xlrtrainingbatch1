import java.util.Iterator;
import java.util.LinkedHashSet;

class LinkedHashSetDemo {
    void linkedHashSetMethod() {
        
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(20);
        lhs.add(30);
        lhs.add(60);
        lhs.add(80);

        System.out.println("Initial LinkedHashSet: " + lhs);

        
        lhs.remove(30);
        System.out.println("After removing 30: " + lhs);

        
        int sum = 0;
        for (Integer x : lhs) {
            sum += x;
        }
        System.out.println("The sum is: " + sum);

        
        System.out.println("Elements using Iterator:");
        Iterator<Integer> it = lhs.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

public class Demo033 {
    public static void main(String[] args) {
        LinkedHashSetDemo obj = new LinkedHashSetDemo();
        obj.linkedHashSetMethod();
    }
}
