package Day10;



public class CustomerTest {
    public static void main(String[] args){
        Customer c1 = new Customer();
        c1.name = "张三";
        c1.shopping();
        Customer c2 = new Customer();
        c2.name = "李四";
        c2.shopping();
        c1.doSome();
        Customer.doOther();
    }
}
