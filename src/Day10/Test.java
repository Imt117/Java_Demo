package Day10;

public class Test {
    int i = 10;

    public static void doSome(){
        System.out.println("do some!");
    }

    public void doOther(){
        System.out.println("do other!");
    }

    public static void method1(){
        Test.doSome();
        doSome();
        Test t = new Test();
        t.doOther();
        System.out.println(t.i);
    }

    public  void method2(){
        Test.doSome();
        doSome();
        this.doOther();
        doOther();
        System.out.println(this.i );
    }

    public static void main(String[] args){
        //
        Test.method1();
        method1();
        Test t = new Test();
        t.method2();


    }
}
