package Models;

public abstract class Car {
    public int year;
    public int horsePower;
    public String brand;
    public boolean move;
    public int idx;

    public Car(int year, int horsePower, String brand, boolean move, int idx) {
        this.year = year;
        this.horsePower = horsePower;
        this.brand = brand;
        this.move = move;
        this.idx = idx;
    }

    public void drive() {
        System.out.println("Едет");
    }
    
    public void stop() {
        System.out.println("Остановился");
    }
}
