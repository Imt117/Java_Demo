package chapter16;

public class Test04 {
    public static void main(String[] args) {
        Flyable f =new Cat();
        f.fly();
        Flyable f2 = new Pig();
        f2.fly();
    }

}
class Animal1{

}
interface Flyable{
    void fly();
}
class Cat extends Animal1 implements Flyable{
    public void fly(){
        System.out.println("俺是一只猫，直到有一天我插上了飞翔接口，很神奇，我变成了飞翔的猫！");
    }
}
class Snake extends Animal1{

}
class Pig extends Animal1 implements Flyable{
    public void fly(){
        System.out.println("俺是小飞猪^(*￣(oo)￣)^");
    }
}

