package Models;

public abstract class Electric extends Car {
    public int batteryCapacity;

    public Electric(int year, int horsePower, String brand, boolean move, int idx, int batteryCapacity) {
        super(year, horsePower, brand, move, idx);
        this.batteryCapacity = batteryCapacity;
    }

    public void charge() {
        System.out.println("Заряжается");
    }
}
