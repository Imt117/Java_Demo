package Test;

import java.util.Arrays;

public class Test03 {
    public static void main(String[] args) {
        int[] a ={77,66,89,79,50,100};
        int c = 0;
        Arrays.sort(a);
        for (int i = 0;i< a.length;i++){
            if (a[i]<80){
                c++;
            }
        }
        int[] b =new int[a.length-c];
        System.arraycopy(a,c,b,0,a.length-c);
        for (int i = 0;i< b.length;i++){
            System.out.print(b[i] + " ");
        }
    }

}
