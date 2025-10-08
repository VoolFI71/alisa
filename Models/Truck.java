package Models;
import Interfaces.*;

public class Truck extends Car implements Truckable {
    public int loadCapacity;
    public int maxCapacity;

    public Truck(int year, int horsePower, String brand, boolean move, int idx, int loadCapacity, int maxCapacity) {
        super(year, horsePower, brand, move, idx);
        this.loadCapacity = loadCapacity;
        this.maxCapacity = maxCapacity;
    }

    @Override // из класса Car, переопределение метода по заданию
    public void drive() {
        System.out.println("Везет груз");
    }

    @Override // из интерфейса
    public int getLoadCapacity() {
        return loadCapacity; // возвращаем текущую грузоподъемность
    }

    @Override // из интерфейса
    public int getMaxCapacity() {
        return maxCapacity; // возвращаем максимальную грузоподъемность
    }

    @Override // из интерфейса
    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity; // устанавливаем текущую грузоподъемность
    }
}
