package hw4;

public class p06 {
    public static void main(String[] args) {
        new RacingCarP04(1234, 20.5, 5); // 直接創建並執行
    }
}
class CarP04 {
    private int num;
    private double gas;

    public CarP04() {
        this(0, 0.0); // 呼叫另一個建構子進行初始化
        System.out.println("生產了車子");
    }
    public CarP04(int num, double gas) {
        this.num = num;
        this.gas = gas;
        System.out.println("生產了車號為 " + num + "，汽油量為 " + gas + " 的車子");
    }
    public void setCar(int num, double gas) {
        this.num = num;
        this.gas = gas;
        System.out.println("將車號設為 " + num + "，汽油量設為 " + gas);
    }
    public void show() {
        System.out.println("車號是 " + num);
        System.out.println("汽油量是 " + gas);
    }
}
class RacingCarP04 extends CarP04 {
    private int course;

    public RacingCarP04() {
        this(0, 0.0, 0); // 呼叫另一個建構子進行初始化
    }

    public RacingCarP04(int num, double gas, int course) {
        super(num, gas);
        this.course = course;
        System.out.println("生產了編號為 " + course + " 的賽車");
    }

    public void setCourse(int course) {
        this.course = course;
        System.out.println("將賽車編號設為 " + course);
    }
}
