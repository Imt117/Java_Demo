package chapter19;

public class ArrayTest07 {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Animal();
        Animal[] animals = {a1,a2};
        for (int i = 0;i<animals.length;i++){
/*
            Animal a = animals[i];
            a.move();
            我要把这两行合并
*/
            animals[i].move();
        }
        Animal[] ans = new Animal[2];
       /* ans[0] = new Animal();
        ans[1] = new Product();*/
        ans[1] = new Cat();
        Animal [] anis = {new Cat(),new Bird()};
        for (int i = 0;i<anis.length;i++){
           /* Animal an = anis[i];
            an.move();*/
            //调用子类特有的方法
            if (anis[i] instanceof Cat){
                Cat cat = (Cat)anis[i];
                cat.catMouse();
            }
            if (anis[i] instanceof Bird){
                Bird bird = (Bird) anis[i];
                bird.sing();
            }
        }

    }
}
class Animal{
    public void move(){
        System.out.println("Animal move. . .");
    }
}
class Product{

}
class Cat extends Animal{
    public void move(){
        System.out.println("猫在走猫步");
    }
    public void catMouse(){
        System.out.println("猫在抓老鼠");
    }
}
class Bird extends Animal{
    public void move(){
        System.out.println("鸟在飞");
    }
    public void sing(){
        System.out.println("小鸟在唱歌");
    }
}
