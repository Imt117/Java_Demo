package chapter22.collection;

import java.util.HashSet;
import java.util.Iterator;

/*
    HashSet(HashMap的Key，存储在HashMap集合key的元素需要同时重写hashCode + equals)
 */
public class HashSetTest02 {
    public static void main(String[] args) {
        HashSet<Student> a = new HashSet<>();
        HashSet<Object> d = new HashSet<>();
        Student stu1 = new Student(22,"zhangsan");
        Student stu2 = new Student(21,"lisi");
        //Student stu3 = new Student(22,"zhangsan");
        a.add(stu1);
        a.add(stu2);
        a.add(new Student(22,"zhangsan"));

        System.out.println(a.size());
        System.out.println(d.size());
        Iterator<Student> b = a.iterator();
        while(b.hasNext()){
            System.out.println(b.next());
        }
        System.out.println("-------------------");
        for (Student c: a) {
            System.out.println(c);
        }
    }
}
class Student{
    int age;
    String name;
    public Student(int age, String name){
        this.age = age;
        this.name = name;
    }
    @Override
    public String toString() {
        return "age=" + age + ", name=" + name;
    }
}
