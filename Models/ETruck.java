package Models;
import Interfaces.*;

public class ETruck extends Electric implements Truckable {
    public int loadCapacity;
    public int maxCapacity;

    public ETruck(int year, int horsePower, String brand, boolean move, int idx, int batteryCapacity, int loadCapacity, int maxCapacity) {
        super(year, horsePower, brand, move, idx, batteryCapacity);
        this.loadCapacity = loadCapacity;
        this.maxCapacity = maxCapacity;
    }

    @Override // из интерфейса
    public int getLoadCapacity() {
        return loadCapacity;
    }

    @Override // из интерфейса
    public int getMaxCapacity() {
        return maxCapacity;
    }

    @Override // из интерфейса
    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
