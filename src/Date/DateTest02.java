package Date;

public class DateTest02 {
    public static void main(String[] args) {
        long nowTimeMillis = System.currentTimeMillis();
        System.out.println(nowTimeMillis);

        long begin = System.currentTimeMillis();
        print();
        long end = System.currentTimeMillis();
        System.out.println("消耗时长"+(end-begin)+"毫秒");
    }
    public static void print(){
        for (int i = 0;i < 100000;i++){
            System.out.println(i);
    }
}
}
