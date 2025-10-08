package Models;

public class Sedan extends Car {
    public int seatingCapacity;

    public Sedan(int year, int horsePower, String brand, boolean move, int idx, int seatingCapacity) {
        super(year, horsePower, brand, move, idx);
        this.seatingCapacity = seatingCapacity;
    }
}
