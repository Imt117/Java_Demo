package chapter19;

public class ArrayTest08 {
    public static void main(String[] args) {
        int[] src = {1,2,3,4,5};
        int[] dest = new int[20];

        System.arraycopy(src,0,dest,15,src.length);
        for (int i = 0;i< dest.length;i++){
            System.out.println(dest[i]);
        }
        System.out.println("----------------");
        String[] strs = {"aaa","bbb","ccc","ddd","eee","fff"};
        String[] newstrs = new String[10];
        System.arraycopy(strs,0,newstrs,0,strs.length);
        for (int i = 0;i< newstrs.length;i++){
            System.out.println(newstrs[i]);
        }
        System.out.println("----------------");
        Object[] objs = {new Object(),new Object(),new Object()};
        Object[] newobjs = new Object[5];
        for (int i = 0;i< objs.length;i++){

            System.out.println(objs[i]);

        }
        System.out.println("----------------");
        for (int i = 0;i< newobjs.length;i++){

            System.out.println(newobjs[i]);

        }
        System.out.println("----------------");
        System.arraycopy(objs,0,newobjs,0,objs.length);
        for (int i = 0;i< newobjs.length;i++){

            System.out.println(newobjs[i]);

        }

    }
}
