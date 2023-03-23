public class Day06 {
    public static void main (String[] args){
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.println("欢迎使用素数判定系统");
        System.out.print("请输入需要判定的数字:");
        int i = s.nextInt();
        boolean isSuShu = true;
        for(int j = 2;j<=i;j++){
            if(i % j == 0){
                isSuShu = false;
                break;
            }
        }
        System.out.println(isSuShu ? i +"是素数" : i+ "不是素数");
    }
}
class Con{
    public static void main (String[] args){
        int count = 0;
        for(int i = 2;i<=100;i++){
            boolean isSuShu = true;
           for(int j =2;j<i;j++){
               if(i % j==0){
                isSuShu = false;
                break;
            }
           }
            if (isSuShu) {
                count++;
                System.out.print(i+" ");
                if(count % 8 ==0){    //if(count == 8;
                    //或者归零 每次count等于8换行。
                    System.out.println();
                    //count = 0;
                }
            }
        }

    }
}
class MethodTest01{
    public static void main(String[] args){
        MethodTest01.sunInt(10,20);
    }
    public static void sunInt(int a,int b){
        int c = a+b;
        System.out.println(a+"+"+b+"="+c);

    }
}