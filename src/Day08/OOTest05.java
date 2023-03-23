package Day08;

public class OOTest05 {
    public static void main(String[] args){
        Customer c = new Customer();
        //c = null;//空引用访问实例相关的数据。Exception in thread "main" java.lang.NullPointerException
        System.out.println(c.id);

    }
}
