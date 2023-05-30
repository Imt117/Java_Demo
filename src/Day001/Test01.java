package Day001;



public class Test01 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int n = 3;
        int m = 3;
        System.out.println(n == m); //基本类型值比较,true
        String str = new String("hello");
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println(str1 == str2); //对象引用地址比较,false
        str1 = str;
        str2 = str;
        System.out.println(str1 == str2); //对象赋值后引用地址比较,true
        System.out.println(str1.equals(str2));//String的equals方法重写了，比较的是值,true
        StringBuffer sb = new StringBuffer("123");
        StringBuffer test = new StringBuffer("123");
        System.out.println(sb == test); //对象引用地址比较,false
        System.out.println(sb.equals(test));//StringBuffer的equals方法没有重写，比较内存地址,false
    }
}
