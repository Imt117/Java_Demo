package Exp04;

import java.io.*;

public class T_12201425_4_1 {

    public static void main(String[] args) {
        // 输入文件名
        String inputFileName = "intfile1.txt";
        // 输出文件名
        String outputFileName = "intfile2.txt";
        try {
            // 创建输入流和输出流
            BufferedReader in = new BufferedReader(new FileReader(inputFileName));
            BufferedWriter out = new BufferedWriter(new FileWriter(outputFileName));
            String line;
            while ((line = in.readLine()) != null) {
                // 按空格分隔每一行中的整数
                String[] nums = line.trim().split("\\s+");
                int sum = 0;
                for (String num : nums) {
                    sum += Integer.parseInt(num);
                }
                // 将该行的和写入输出文件
                out.write(sum + "\n");
            }
            // 关闭流
            in.close();
            out.close();
            System.out.println("计算完成，结果已写入" + outputFileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
