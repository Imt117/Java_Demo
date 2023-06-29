package chapter22.collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Collection02 {
    public static void main(String[] args) {
        Collection<Object> c = new HashSet<>();
        c.add("abc");
        c.add("def");
        c.add(100);
        c.add(250);
        c.add(new Object());
        Iterator<Object> it = c.iterator();
        while (it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }



    }
}
