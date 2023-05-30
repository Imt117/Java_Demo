package chapter19;

public class ArrayTest06 {
    public static void main(String[] args) {
        if (args.length !=2){
            System.out.println("使用系统时,请输入程序参数,数中包括用户名和密码信息  例如:zhangsan 123");
            return;
        }
        String username = args[0];
        String password = args[1];
        if ("admin".equals(username) && "123".equals(password)){
            System.out.println("登陆成功,欢迎["+ username + "]回来");
            System.out.println("您可以继续使用该系统. . . . .");

        }else {
            System.out.println("验证失败,用户名不存在或者密码错误!");
        }
    }
}
