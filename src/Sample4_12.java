public class Sample4_12 {
    public static void main(String[] args) {
        iVehicle4_12[] ivc = new iVehicle4_12[2];

        ivc[0] = new Car4_12(1234, 20.5);

        ivc[1] = new Plane4_12(232);

        for (int i = 0; i < ivc.length; i++) {
            ivc[i].show();
        }
    }
}

interface iVehicle4_12 {
    int weight = 1000;

    void show();
}

class Car4_12 implements iVehicle4_12 {
    private int num;
    private double gas;

    public Car4_12(int n, double g) {
        num = n;
        gas = g;
        System.out.println("生產了車號為" + num + "汽油量為" + gas + "的車子");
    }

    public void show() {
        System.out.println("車號是" + num);
        System.out.println("汽油量是" + gas);
    }
}

class Plane4_12 implements iVehicle4_12 {
    private int flight;

    public Plane4_12(int f) {
        flight = f;
        System.out.println("生產了" + flight + "班次的飛機");
    }

    public void show() {
        System.out.println("飛機的班次是" + flight);
    }
}