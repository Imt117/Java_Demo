package Day08.Exp08;

public class ProductTest {
    public static void main(String[] args){
        Product iphone7 = new Product();
        //他是局部变量 +引用
        //读取 引用.变量名
        System.out.println("商品的编号:"+iphone7.productNo);
        System.out.println("商品的单价:"+iphone7.price);
        //修改 引用.变量名 = 值
        iphone7.productNo = 111;
        iphone7.price = 6800.0;
        System.out.println("商品的编号:"+iphone7.productNo);
        System.out.println("商品的单价:"+iphone7.price);
//下面的编译报错，实例变量必须先创建对象，通过引用.的方式访问,不能直接使用类名.的方式访问
        /*
        System.out.println(Product.productNo);
        */
        System.out.println(iphone7.productNo);


    }
}
