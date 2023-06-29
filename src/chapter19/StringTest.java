package chapter19;

public class StringTest {
    public static void main(String[] args) {
        byte[] bytes = {87,88,89};
        String s2 = new String(bytes);
        System.out.println(s2);
        String s3 = new String(bytes,1,2);
        System.out.println(s3);
        char[] chars = {'我','是','中','国','人'};
        String s4 = new String(chars);
        System.out.println(s4);
        String s5 = new String(chars,2,3);
        System.out.println(s5);
        char c = "中国人".charAt(1);
        System.out.println(c);
        int result = "abc".compareTo("abc");
        System.out.println(result);
        int result1 = "abcd".compareTo("abce");
        System.out.println(result1);
        int result2 = "abce".compareTo("abcd");
        System.out.println(result2);
        String a = "abc";
        String b = "ABC";
        System.out.println(a.equalsIgnoreCase(b));
        byte[] bytes1 = "abcdef".getBytes();
        for (int i = 0;i < bytes1.length;i++){
            System.out.println(bytes1[i]);
        }
        System.out.println("qweeryujnb".indexOf("q"));
        String s = "a";
        String ss = "";
        System.out.println(s.isEmpty());
        System.out.println(ss.isEmpty());
        System.out.println("ss.isEmpty()".length());
        System.out.println("qweeryujnbvfdr".lastIndexOf("f"));
        System.out.println("qweeryujnbvfdrg".substring(10));
        System.out.println("      wewewe   wwewew    ".trim());
        System.out.println(10);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("a");
        stringBuffer.append("b");
        stringBuffer.append(3.14);
        stringBuffer.append(true);
        stringBuffer.append(100L);
        System.out.println(stringBuffer.toString());

    }
}

