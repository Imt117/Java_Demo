public class RecursionTest01 {
    public static void main(String[] args) {

        System.out.println("doSome begin");

        doSome();

        System.out.println("doSome over");
    }

    public static void doSome() {
        System.out.println("doSome begin");
        doSome();
        System.out.println("doSome over");

    }
}

class num{
    public static void main(String[] args){
        int n = 1000;
        int retValue = sum(n);
        System.out.println(retValue);
    }
    public static int sum(int n){
        if (n == 1){
            return 1;
        }
        return n + sum(n-1);


    }
}

class num1{
    public static void main(String[] args){
        int n = 9;
        int retValue = method(n);
        System.out.println(retValue);
    }
    public static int method(int n){
        int result = 1;
        for(int i = n;i>0;i--){
            result *=i;
        }
        return result;
    }
}

class num2{
    public static void main(String[] args){
        int n = 5;
        int retValue = method(n);
        System.out.println(retValue);
    }
    public static int method(int n){
       if (n == 1){
           return 1;
       }else return n*method(n-1);

    }
}