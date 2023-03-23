public class Day05 {
    public static void main(String[] args){
        int sum = 0;
        for(int i = 1;i<=10;i+=2){
            sum += i;
        }
        System.out.println(sum);
    }
}
class Table{
    public static void main(String[] args){

        for(int i =1;i<=9;i++){
            for(int j = 1;j<=i;j++){
                int a = 0;
                a = i*j;
                System.out.println(i+"*"+j+"="+a);
            }
        }
    }
}
class WhileText{
    public static void main(String[] args){
        int a = 10;
        int b = 3;
        while (a>b){
            for(int i = 1;i>=1;i++)
            System.out.println("死循环"+i);
        }
    }
}
class WhileText1{
    public static void main(String[] args){
        int i = 10;
        do {
            System.out.println(i);
            i++;
        }while (i<100);
    }
}
class BreakText{
    public static void main(String[] args) {
        for1:for (int j = 0; j < 3; j++) {
            for2:for (int i = 0; i < 10; i++) {
                if (i == 5) {
                    break for1;
                }
                System.out.println(i);
            }
        }
    }
}
class ContinueText01{
    public static void main(String[] args){
        for(int i = 0;i<10;i++){
            if(i == 5){
                break;
            }
            System.out.println("i ="+i);
        }
        System.out.println("Hello World!");
        for(int i = 0;i<10;i++){
            if(i == 5){
                continue;
            }
            System.out.println("i ="+i);
        }
        System.out.println("Hello World!");
    }
}
