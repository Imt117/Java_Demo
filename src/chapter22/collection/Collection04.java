package chapter22.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Collection04 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        String s1 = new String("abc");
        c.add(s1);
        String s2 = new String("def");
        c.add(s2);
        System.out.println("元素的个数是:" + c.size());
        String x = new String("abc");
        System.out.println(x.equals(s1));
        System.out.println(x.equals(s2));
        System.out.println(c.contains(s1));
        System.out.println(c.contains(x));
    }


}
