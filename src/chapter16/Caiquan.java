package chapter16;

import java.util.Random;
import java.util.Scanner;


public class Caiquan {
    public static void main(String[] args) {

        Random r = new Random();
        int a = r.nextInt(3)+1;
        System.out.println("1.石头" + "\n" + "2.剪刀" + "\n" + "3.布" + "\n" + "请先输入数字来进行猜拳:");
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
    /*
            switch (a){

                case 1:
                    System.out.println("系统出的石头");
                    break;
                case 2:
                    System.out.println("系统出的剪刀");
                    break;
                case 3:
                    System.out.println("系统出的布");
                    break;

            }
            switch (b){

                case 1:
                    System.out.println("你出的石头");
                    break;
                case 2:
                    System.out.println("你出的剪刀");
                    break;
                case 3:
                    System.out.println("你出的布");
                    break;

            }
*/
        if(a-b == 0){
            System.out.println("平局");
        }
        else if (a-b == 1||a-b == -2) {
            System.out.println("你赢了");
        }else{
            System.out.println("你输了");
        }

    }
}
