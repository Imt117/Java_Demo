package Day08.Exp09;

class Computer{
    String brand;
    String style;
    String color;

}
class Student{
    int no;
    String name;
    Computer notepad;

}
public class OOTest06 {
    public static void main(String[] args){
        Computer biJiBen = new Computer();

        Student zhangsan = new Student();

        biJiBen.brand = "华硕";
        biJiBen.style = "京东";
        biJiBen.color = "black";

        zhangsan.no = 123;
        zhangsan.name = "张三";
        zhangsan.notepad = biJiBen;

        System.out.println(zhangsan.notepad.brand);
        zhangsan.notepad.brand = "苹果";
        System.out.println(zhangsan.notepad.brand);
        zhangsan.notepad = new Computer();

        System.out.println(zhangsan.notepad.brand);



    }
}
