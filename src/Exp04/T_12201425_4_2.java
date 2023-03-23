package Exp04;

public class T_12201425_4_2 {

    public static void main(String[] args) {

        // 创建一个桥对象
        Bridge bridge = new Bridge();

        // 创建10个人线程
        for (int i = 0; i < 5; i++) {
            new Thread(new Person(i + 1, "South", "North", bridge)).start();
        }
        for (int i = 5; i < 11; i++) {
            new Thread(new Person(i + 1, "North", "South", bridge)).start();
        }
    }

}

// 定义桥类
class Bridge {
    // 定义桥上的人数
    private int count;

    public Bridge() {
        count = 0;
    }

    // 桥上的人数加1
    public synchronized void add() {
        count++;
    }

    // 桥上的人数减1
    public synchronized void remove() {
        count--;
    }

    // 返回桥上的人数
    public synchronized int getCount() {
        return count;
    }
}

// 定义人类
class Person implements Runnable {

    private int id; // 人的编号
    private String start; // 出发点
    private String end; // 目的地
    private Bridge bridge; // 桥

    public Person(int id, String start, String end, Bridge bridge) {
        this.id = id;
        this.start = start;
        this.end = end;
        this.bridge = bridge;
    }

    @Override
    public void run() {
        // 从出发点走到桥边
        System.out.println("Person " + id + " walks to the " + start + " end of the bridge.");
        // 等待桥空闲
        while (bridge.getCount() == 1) {
            Thread.yield();
        }
        // 上桥
        bridge.add();
        System.out.println("Person " + id + " is walking on the bridge from " + start + " to " + end + ".");
        // 等待时间模拟过桥
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 下桥
        bridge.remove();
        System.out.println("Person " + id + " has walked across the bridge to the " + end + " end.");
    }
}
