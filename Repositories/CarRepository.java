package Repositories;
import java.util.*;
import Models.*;
import Interfaces.*;

public class CarRepository implements Repository<Car, Integer> {
    private List<Car> cars = new ArrayList<>();
    private int nextId = 1;

    @Override //переопределяем потому что из интерфейса
    public Car save(Car entity) {
        if (entity.idx == 0) {
            entity.idx = nextId++;
        }
        cars.add(entity);
        return entity; 
    }

    @Override
    public List<Car> saveAll(Collection<Car> entities) {
        List<Car> savedCars = new ArrayList<>();
        for (Car car : entities) {
            savedCars.add(save(car)); 
        }
        return savedCars;
    }

    @Override
    public Optional<Car> findById(Integer id) {
        for (Car car : cars) {
            if (car.idx == id) {
                return Optional.of(car); // возвращаем экземпляр класса car
            }
        }
        return Optional.empty();
    }

    @Override
    public void deleteById(Integer id) {
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).idx == id) {
                cars.remove(i);
                break;
            }
        }
    }

    @Override
    public void deleteAll() {
        cars.clear(); // очищаем список экземпляров класса Car
    }

    @Override
    public long count() {
        return cars.size();
    }

    @Override
    public boolean existsById(Integer id) {
        for (Car car : cars) {
            if (car.idx == id) {
                return true;
            }
        }
        return false;
    }
}