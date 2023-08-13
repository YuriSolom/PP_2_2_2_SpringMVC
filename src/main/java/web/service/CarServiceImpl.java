package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    private List<Car> carList;

    {
        carList = new ArrayList<>();
        Car car1 = new Car("Audi", "A8", 3.0);
        Car car2 = new Car("BMW", "M5", 4.4);
        Car car3 = new Car("Toyota", "Land Cruiser 300", 3.4);
        Car car4 = new Car("Mitsubishi", "Outlander", 2.4);
        Car car5 = new Car("Porsche", "911", 3.7);
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
    }

    @Override
    public List<Car> getCars(int a) {
        if (a >= 0) {
            return carList.stream().limit(a).collect(Collectors.toList());
        } else {
            return carList;
        }
    }
}
