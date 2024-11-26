public class Sample4_9 {
    public static void main(String[] args) {
        Car4_9[] cars;
        cars = new Car4_9[2];

        cars[0] = new Car4_9();
        cars[1] = new RacingCar4_9();

        for (int i = 0; i < cars.length; i++) {
            Class cl = cars[i].getClass();
            System.out.println("第" + (i + 1) + "個物件的類別是" + cl);
        }
    }
}

class Car4_9 {
    protected int num;
    protected double gas;

    public Car4_9() {
        num = 0;
        gas = 0.0;
        System.out.println("生產了車子");
    }
}

class RacingCar4_9 extends Car4_9 {
    public RacingCar4_9() {
        System.out.println("生產了賽車");
    }
}