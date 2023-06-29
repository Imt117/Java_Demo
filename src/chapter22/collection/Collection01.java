package chapter22.collection;



import java.util.ArrayList;
import java.util.Collection;


public class Collection01 {
    public static void main(String[] args) {
        Collection c = new ArrayList();

        c.add(1200);
        c.add(3.14);
        c.add(1200);
        c.add(new Object());
        System.out.println(c.size());
        c.clear();
        System.out.println(c.size());
        System.out.println(c.isEmpty());
        c.add("Hello");
        c.add(1200);
        c.add(3.14);
        c.add(12);
        c.add(new Object());
        System.out.println(c.size());
        boolean flag = c.contains("Hello");
        System.out.println(flag);
        c.remove(1200);
        System.out.println(c.size());

        System.out.println(c.isEmpty());
        Object[] a = c.toArray();
        for (int i = 0;i < a.length;i++){
            Object o =a[i];
            System.out.println(o);
        }

    }
}
