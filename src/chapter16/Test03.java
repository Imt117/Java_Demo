package chapter16;


public class Test03 {
    public static void main(String[] args) {
        D d = new G();
        E e = new G();
        F f = new G();
        E e1 = (E)d;
        e1.m2();
        Y y = new Z();
//        X x = (X)y;
    }
}
interface X{

}
interface Y{

}
class Z implements Y{

}
interface D{
    void m1();
}
interface E{
    void m2();
}
interface F{
    void m3();
}
class G implements D,E,F{
    public void m1(){

    }
    public void m2(){
        System.out.println("你好");
    }
    public void m3(){

    }
}
