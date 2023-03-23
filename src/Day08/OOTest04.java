package Day08;

public class OOTest04 {
    public static void main(String[] args) {
        Husband zhangLiWen = new Husband();
        zhangLiWen.name = "张力文";

        Wife jiangLiJuan = new Wife();
        jiangLiJuan.name = "蒋丽娟";
        zhangLiWen.w = jiangLiJuan;
        jiangLiJuan.h = zhangLiWen;

        System.out.println(zhangLiWen.w.name);
    }
}
