package chapter19;

public class ArrayTest012 {
    public static void main(String[] args) {
        /*
        int[][] array = new int[3][4];
        for (int i = 0;i < array.length;i++){
            for (int j = 0;j < array[i].length;j++){
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
        */
        int[][] a = {
                {22,11,333},
                {11,44,213},
                {88,55,77,1234}
        };
        printArray(a);
    }
    public static void printArray(int[][] array){

        for (int i = 0;i < array.length;i++){
            for (int j = 0;j < array[i].length;j++){
                System.out.print(array[i][j] + "\u0020");
            }
            System.out.println();
        }
    }
}
