package Day08;

import Day08.Student;

public class OOTest01 {
    public static void main (String[] args){
        int i = 10;
        Student s = new Student();
        int stuNo = s.no;
        String stuName = s.name;
        int stuAge = s.age;
        String stuAddr = s.addr;

        System.out.println("学号="+s.no);
        System.out.println("姓名="+s.name);
        System.out.println("年龄="+s.age);
        System.out.println("性别="+s.sex);
        System.out.println("住址="+s.addr);
        System.out.println("------------------");

        s.no = 10;
        s.name = "jack";
        s.age = 20;
        s.sex = true;
        s.addr = "北京";

        System.out.println("学号="+s.no);
        System.out.println("姓名="+s.name);
        System.out.println("年龄="+s.age);
        System.out.println("性别="+s.sex);
        System.out.println("住址="+s.addr);
        System.out.println("------------------");

        Student stu = new Student();

        System.out.println("学号="+stu.no);
        System.out.println("姓名="+stu.name);
        System.out.println("年龄="+stu.age);
        System.out.println("性别="+stu.sex);
        System.out.println("住址="+stu.addr);


    }
}
