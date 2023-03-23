package Day08;

public class OOTest03 {
    public static void main (String[] args){

        User u = new User();
        Address a = new Address();
        u.addr = a;
        System.out.println(u.addr.city);
        a.city = "天津";
        System.out.println(u.addr.city);

    }

}
