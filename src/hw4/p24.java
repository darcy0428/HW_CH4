package hw4;

public class p24 {
    public static void main(String[] args) {
        // 建立物件並直接設定屬性
        CarP24 car1 = new CarP24(1234, 20.5);
        System.out.println(car1); // 使用覆寫的 toString 方法輸出
    }
}

class CarP24 {
    private int num;
    private double gas;

    // 合併初始化至建構子
    public CarP24(int num, double gas) {
        this.num = num;
        this.gas = gas;
        System.out.println("生產了車號為 " + num + "，汽油量為 " + gas + " 的車子");
    }

    // 預設建構子，呼叫有參數建構子，提供初始值
    public CarP24() {
        this(0, 0.0);
    }

    // 覆寫 toString 方法，直接回傳字串格式
    @Override
    public String toString() {
        return String.format("車號: %d; 汽油量: %.1f", num, gas); // 使用格式化字串
    }
}
