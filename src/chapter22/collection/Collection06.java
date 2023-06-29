package chapter22.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collection06 {
    public static void main(String[] args) {
        int a = 10;

        int b = a++ + ++a + a--;
        System.out.println(b);
        System.out.println(a);
        Collection c = new ArrayList();
        c.add(1);
        c.add(2);
        c.add(3);

        Iterator it = c.iterator();

        while (it.hasNext()){
            Object obj = it.next();
            it.remove();

            System.out.println(obj);
        }
        System.out.println(c.size());
    }
}
