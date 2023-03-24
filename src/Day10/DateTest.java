package Day10;

public class DateTest {
    public static void main(String[] args){
        //创建日期对象
        Date time1 = new Date();
        time1.printInfo();
        Date time2 = new Date(2023,3,24);
        time2.printInfo();
    }
}
