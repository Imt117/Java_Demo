package chapter22.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List01 {
    public static void main(String[] args){
        List myList = new ArrayList();
        myList.add("A");
        myList.add("B");
        myList.add("C");
        myList.add("D");
        myList.add(1,"KING");
        myList.add("C");
        Iterator iterator = myList.iterator();
        while (iterator.hasNext()){
            Object object = iterator.next();
            System.out.println(object);
        }
        Object firstObj = myList.get(0);
        System.out.println(firstObj);
//for循环获取每个数组
        for (int i = 0;i < myList.size();i++){
            Object obj = myList.get(i);
            System.out.println(obj);
        }
        //判断第一次出现处的索引
        System.out.println(myList.indexOf("KING"));
        System.out.println(myList.indexOf("C"));
        //最后一次出现
        System.out.println(myList.lastIndexOf("C"));
        //修改指定位置元素
        myList.set(2,"Soft");
        System.out.println("================");
        for (int i = 0;i < myList.size();i++){
            Object obj = myList.get(i);
            System.out.println(obj);
        }
    }
}
