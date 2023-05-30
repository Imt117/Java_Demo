package chapter18;

import java.util.Objects;

public class Test01 {
    public static void main(String[] args) {
        MyTime t1 = new MyTime(2023, 5,29);
        MyTime t2 = new MyTime(2023, 5,29);
        MyTime t3 = new MyTime(2023, 5,30);
        MyTime t4 = null;
        String s1 = t1.toString();
        System.out.println(s1);
        System.out.println(t1.equals(t2));
        System.out.println(t1.equals(t3));
        System.out.println(t1.equals(t4));
        System.out.println(t1.getClass());
        System.out.println(t1.getClass().getName());
        String userName = null;
       // System.out.println(userName.equals("小王"));
        //把给定的字符串放在前面，方便处理userName为空的问题
        System.out.println("小王".equals(userName));
    }

}
class MyTime {

    private int year;
    private int month;
    private int day;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public MyTime() {
    }

    public MyTime(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
        System.out.println("今天是" + year + "年" + month + "月" + day + "日");

    }

    @Override
    public String toString() {
        return "MyTime{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyTime myTime = (MyTime) o;
        return year == myTime.year && month == myTime.month && day == myTime.day;
    }


    /* public String toString() {
        return this.year + "年" + this.month + "月" + this.day + "日";
    }*/


/*
    public boolean equals(Object obj) {
        int year1 = this.year;
        int month1 = this.month;
        int day1 = this.day;
        if (obj instanceof MyTime){
            MyTime t = (MyTime) obj;
            int year2 = t.year;
            int month2 = t.month;
            int day2 = t.day;
            if (year1 == year2 && month1 == month2 && day1 == day2){
                return true;
            }
        }

        return false;
    }
*/
    //改良equals
/*public boolean equals(Object obj){
    if (obj == null){
        return false;
    }
    if (!(obj instanceof MyTime)){
        return false;
    }
    if (this == obj){
        return true;
    }
    MyTime t = (MyTime)obj;
    return this.year == t.year && this.month == t.month && this.day == t.day;
}*/
}
