package chapter22.collection;

import java.util.Objects;

class Person1 {
    private String name;
    private int age;

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Person1 person = (Person1) obj;
        return age == person.age && name.equals(person.name);
    }

    /*@Override
    public int hashCode() {
        return Objects.hash(name, age);
    }*/
}

public class Test001 {
    public static void main(String[] args) {
        Person1 p1 = new Person1("John", 25);
        Person1 p2 = new Person1("John", 25);

        System.out.println(p1.equals(p2)); // true
        System.out.println(p1.hashCode()); // 1544803906
        System.out.println(p2.hashCode()); // 1544803906
    }
}
