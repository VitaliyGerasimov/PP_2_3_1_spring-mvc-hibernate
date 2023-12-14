package web.service;


import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private List<Car> cars;

    public CarServiceImpl() {
        cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Black", 200));
        cars.add(new Car("Honda", "White", 350));
        cars.add(new Car("Ford", "Black", 126));
        cars.add(new Car("Chevrolet", "Red", 210));
        cars.add(new Car("BMW", "Orange", 320));
    }

    @Override
    public List<Car> getCars(int count) {

        if (count >= 5) {
            return cars;
        } else {
            return cars.subList(0, count);
        }
    }
}
