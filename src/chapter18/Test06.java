package chapter18;

public class Test06 {
    public static void main(String[] args) {

        for (int i = 0;i<50;i++){
            Person p =new Person();
            Person a =new Person();
            Person b =new Person();
            Person c =new Person();
            p = null;
            a = null;
            b = null;
            c = null;
            System.gc();//建议启动垃圾回收器，概率高了。
        }

    }
}
class Person{
    protected void finalize() throws Throwable{
        System.out.println("即将被销毁!");
    }
}
