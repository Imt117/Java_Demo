package chapter18.匿名内部类;

public class Test01 {
    static class Inner1{

    }
    class Inner2{

    }
    public void doSome(){
        class Inner3{

        }
    }
}
interface Compute{
    int sum(int a,int b);
}
class ComputeImpl implements Compute{
    public int sum(int a,int b){
        return a+b;
    }
}
class MyMath{

}


