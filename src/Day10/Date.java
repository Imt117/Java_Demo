package Day10;
/*
this可以用在哪里
    1.可以使用在实例方法中，代表当前对象【语法格式:this.】
    2.可以使用在构造方法中，通过当前构造方法调用其他构造方法【语法格式:this(实参);】
    重点【记忆】:this();这种语法只能出现在构造函数的第一行。
 */
public class Date {
    private int year;
    private int month;
    private int day;

    public Date(int year,int month,int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public Date(){
//        this.year = 1970;
//        this.month = 1;
//        this.day = 1;
        //以上代码可以通过调用另一个构造方法来完成
        //但前提是不能创建新的对象，以下代码表示创建了一个新的对象
        //new Date(1970,1,1);
        //需要以下语法完成构造方法的调用
        //这种方式不会创建新的Java对象,但同时又可以达到调用其他方法
        this(1970,1,1);
    }

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
    public void printInfo(){
        System.out.println(this.year+"年"+this.month+"月"+this.day+"日");
    }
}
