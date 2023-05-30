public class Day04 {
    public static void main(String[] args){
        String username = "张力文";
        boolean sex = false;
        char c = sex ? '男' : '女';
        System.out.println("登陆成功，欢迎"+username+"回来");
        System.out.println(c);
        int score = 90;
        String grade = "aa";
        if (score<0||score>100){
            grade = "对不起，你的成绩不合法";
        } else if (score>=90) {
            grade = "A";

        }
        System.out.println(grade);
    }
}
class KeyInputTest{
    public static void  main(String[] args){
        //创建键盘扫描目录
        java.util.Scanner s = new java.util.Scanner(System.in);
        String userInputContent = s.next();

        System.out.println("您输入了:"+ userInputContent);
    }
}
class Calculator{
    public static void main(String[] args){
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.println("欢迎使用建议计算器系统");
        System.out.println("请输入第一个数字:");
        int num1 = s.nextInt();

        System.out.println("请输入运算符:");
        String operator = s.next();

        System.out.println("请输入第二个数字:");
        int num2 = s.nextInt();

        int result = 0;
        switch (operator){
            case "+":
                result = num1 + num1;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            case "%":
                result = num1 % num2;
                break;
        }
        System.out.println("运算结果是"+result);
    }
}
