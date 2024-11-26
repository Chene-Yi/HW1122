public class Sample4_8 {
    public static void main(String[] args) {
        Car4_8 car1 = new Car4_8();
        Car4_8 car2 = new Car4_8();

        Car4_8 car3;
        car3 = car1;
        System.out.println("car1 與 car2 相同 " + car1.equals(car2));
        System.out.println("car1 與 car3 相同 " + car1.equals(car3));
    }
}

class Car4_8 {
    protected int num;
    protected double gas;

    public Car4_8() {
        num = 0;
        gas = 0.0;
        System.out.println("生產了車子");
    }
}
