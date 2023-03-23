package Exp02;

public class T_12201425_2_4 {

    public static void main(String[] args) {
        String s = "103300002222223333";
        int maxLen = Search(s);
        System.out.println("最大长度为：" + maxLen);
    }

    public static int Search(String s) {
        if (s == null || s.length() == 0) {
            return 1;
        }
        int maxLen = 1;
        int curLen = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                curLen++;
            } else {
                maxLen = Math.max(maxLen, curLen);
                curLen = 1;
            }
        }
        return Math.max(maxLen, curLen);
    }
}

