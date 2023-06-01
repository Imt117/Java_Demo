package Test;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        System.out.println("欢迎使用出生日计算机:");
        System.out.println("请输入你出生的年份:");
        Scanner sc = new Scanner(System.in);
        int year1 = sc.nextInt();
        System.out.println("请输入你出生的月份:");
        int month1 = sc.nextInt();
        System.out.println("请输入你出生于几号:");
        int day1 = sc.nextInt();

        Time t1 = new Time(2023, 5,30);
        int nowday = t1.getYear()*365 + t1.getMonth()*30 + t1.getDay();
        int birthday = year1*365 + month1*30 + day1;
        int day2 = nowday - birthday;
        System.out.println("距离你出生已过去了" + day2 + "天");



    }

}
class Time {

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

    public Time() {
    }
    public Time(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
        System.out.println("今天是" + year + "年" + month + "月" + day + "日");

    }


}
