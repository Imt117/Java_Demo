package chapter18;

public class Test03 {
    public static void main(String[] args) {
        String s1 = "Test1";
        String s2 = "Test1";
        String s3 = new String("Test1");
        String s4 = new String("Test1");

        System.out.println(s3.equals(s4));
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s3 == s4);
        System.out.println(s1.equals(s3));
        String x = new String("邢栋爱吃粑粑");
        System.out.println(x.toString());
    }

}
