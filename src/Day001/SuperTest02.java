package Day001;

public class SuperTest02 {
    public static void main(String[] args){
        new E();
    }
}
class C  {
    public C(){
        System.out.println("C类的无参构造方法");
    }
}
class D extends C{
    public D(){
        System.out.println("D类的无参构造方法");
    }
    public D(String name){
        System.out.println("D的有参数构造执行(String)");
    }
}
class E extends D{
    public E(){
        this("zhangsan");
        System.out.println("E的无参数构造执行");
    }
    public E(String name){
        this(name,20);
        System.out.println("E的有参数构造执行(String)");
    }
    public E(String name,int age){
        super(name);
        System.out.println("E的有参数构造执行(String,int)");
    }
}
