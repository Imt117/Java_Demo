package chapter18;

public class Test07 {
    public static void main(String[] args) {
        X x = new X();
        Object o = new Object();
        Object oo = new Object();
        String s1 = x.toString();
        System.out.println(s1);
        System.out.println(o);

        System.out.println(oo);
        int hashCodeValue = o.hashCode();
        int hashCodeValue1 = oo.hashCode();
        System.out.println(hashCodeValue);
        System.out.println(hashCodeValue1);
    }

}

class X{
    public String toString() {
        return getClass().getSimpleName() + "@" + Integer.toHexString(hashCode());
    }
}
