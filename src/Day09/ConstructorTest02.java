package Day09;

public class ConstructorTest02 {
    public static void main(String[] args) {
        Account act1 = new Account("222");
        System.out.println("账号:" + act1.getActno());
        System.out.println("余额:" + act1.getBalance());
        Account act2 = new Account("123", 10.0);
        System.out.println("账号:" + act2.getActno());
        System.out.println("余额:" + act2.getBalance());
        Account act3 = new Account(1000);
        System.out.println("账号:" + act3.getActno());
        System.out.println("余额:" + act3.getBalance());
    }
}





