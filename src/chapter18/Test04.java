package chapter18;

import java.util.Objects;

public class Test04 {
    public static void main(String[] args) {
        Student xd = new Student(2013040243,"中北大学");
        Student zlw = new Student(2013040243,"中北大学");
        System.out.println(xd);
        System.out.println(xd.equals(zlw));
    }
}
class Student{
    int no;
    String school;

    public Student() {
    }
    public Student(int no, String school) {
        this.no = no;
        this.school = school;
    }
    public String toString(){
        return "学号:" + no + ",所在学校名称:" + school;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return no == student.no && Objects.equals(school, student.school);
    }


}
