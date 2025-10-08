import java.util.*;
import Models.*;
import Repositories.*;

public class Main {
    public static void main(String[] args) {
        CarRepository repository = new CarRepository();

        Sedan sedan = new Sedan(2020, 150, "Toyota", false, 0, 5);
        Truck truck = new Truck(2021, 300, "Ford", false, 0, 2000, 5000);
        ESedan eSedan = new ESedan(2022, 200, "Tesla", false, 0, 100);
        ETruck eTruck = new ETruck(2023, 400, "Tesla", false, 0, 150, 3000, 6000);

        repository.save(sedan);
        repository.save(truck);
        repository.save(eSedan);
        repository.save(eTruck);

        System.out.println("Создано автомобилей: " + repository.count());

        System.out.println("Седан:");
        sedan.drive();
        System.out.println("Грузовик:");
        truck.drive();
        System.out.println("Электроседан:");
        eSedan.drive();
        System.out.println("Электрогрузовик:");
        eTruck.drive();

        System.out.println("Зарядка электроседана:");
        eSedan.charge();
        System.out.println("Зарядка электрогрузовика:");
        eTruck.charge();

        System.out.println("Найден автомобиль: " + repository.findById(1).get().brand);
        
        repository.deleteById(1);
        System.out.println("После удаления: " + repository.count());
    }
}