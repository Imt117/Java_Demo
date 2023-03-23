package Day08;

import Day08.User;

public class OOTest02 {
    public static void main (String[] args){
        User u = new User();

        System.out.println(u.no);
        System.out.println(u.name);
        System.out.println(u.addr);

        u.no = 110;
        u.name = "jack";
        u.addr = new Address();

        System.out.println(u.no);
        System.out.println(u.name);
        System.out.println(u.addr);
    }
}
