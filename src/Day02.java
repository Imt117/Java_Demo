public class Day02 {
    public static void main(String[] args) {
        Day02.f1();
    }
    static Day02 d = new Day02();
    static {
        System.out.println("a");
    }
    {
        System.out.println("2");
    }
    Day02(){
        System.out.println("3");
    }
    private static void f1(){
        Day02 c = new Day02();
        System.out.println("4");
    }
}
