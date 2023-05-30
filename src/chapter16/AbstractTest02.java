package chapter16;

public class AbstractTest02 {
    public static void main(String[] args) {
        Animal a = new Bird();
        a.move();
    }
}
abstract class Animal{
    public abstract void move();
}

class Bird extends Animal{
    public void  move(){
        System.out.println("我是一只小鸟，我会自由自在的飞翔");
    }
}
