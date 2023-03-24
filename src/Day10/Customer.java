package Day10;

public class Customer {
    String name;

    public Customer(){

    }
    public void shopping(){
        System.out.println(this.name + "在购物！");
    }
    public  void doSome(){
        System.out.println(name);
    }
    public static void  doOther(){
        Customer c = new Customer();
        System.out.println(c.name);
    }
}
