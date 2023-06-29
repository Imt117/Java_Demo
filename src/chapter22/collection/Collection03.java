package chapter22.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;


public class Collection03 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);
        c.add(4);
        c.add(4);
        c.add(4);
        Iterator it = c.iterator();
        while (it.hasNext()){

            System.out.println(it.next());
        }
        Collection c2 = new HashSet();
        c2.add(100);
        c2.add(200);
        c2.add(300);
        c2.add(300);
        c2.add(800);
        c2.add(300);
        c2.add(600);
        c2.add(400);
        c2.add(300);
        c2.add(300);
        Iterator it2 = c2.iterator();
        while (it2.hasNext()){

            System.out.println(it2.next());
        }

    }
}
