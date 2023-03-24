package Day10;

public class ThisTest {
//    int num = 10;//实例变量，不能 this 得new对象
//
//    public static void main(String[] args){
//        ThisTest tt = new ThisTest();
//        System.out.println(tt.num);
//    }
    public static void main(String[] args){
        ThisTest.doSome();
        doSome();
        ThisTest tt = new ThisTest();
        tt.doOther();
        tt.run();
    }
    public static void doSome(){
        System.out.println("do Some!");
    }
    public void doOther(){
        System.out.println("do other!");
    }
    public void run(){
        System.out.println("run execute!");
        this.doOther();
    }
}
