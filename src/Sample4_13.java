public class Sample4_13 {
    public static void main(String[] args) {
        Car4_13 car1 = new Car4_13(1234, 30.5);
        car1.vShow();
        car1.mShow();
    }
}

interface iVehicle4_13 {
    void vShow();
}

interface iMaterial4_13 {
    void mShow();
}

class Car4_13 implements iVehicle4_13, iMaterial4_13 {
    private int num;
    private double gas;

    public Car4_13(int n, double g) {
        num = n;
        gas = g;
        System.out.println("生產了車號為" + num + "，汽油量為" +gas + "的車子");
    }

    public void vShow() {
        System.out.println("車號為" + num);
        System.out.println("汽油量為" +gas);
    }

    public void mShow() {
        System.out.println("車子的材質是鐵");
    }
}